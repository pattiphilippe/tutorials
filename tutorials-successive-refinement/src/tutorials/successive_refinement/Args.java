package tutorials.successive_refinement;

import tutorials.successive_refinement.marshaler.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import static tutorials.successive_refinement.ErrorCode.*;

public class Args {
    private final Map<Character, ArgumentMarshaler> marshalers;
    private final Set<Character> argsFound;
    private ListIterator<String> currentArgument;

    public Args(final String schema, final String [] args) throws ArgsException {
        marshalers = new HashMap<>();
        argsFound = new HashSet<>();

        parseSchema(schema);
        parseArgumentStrings(Arrays.asList(args));
    }

    private void parseSchema(final String schema) throws ArgsException {
        for (final String element : schema.split(",")) {
            if (element.length() > 0) {
                parseSchemaElement(element.trim());
            }
        }
    }

    private void parseSchemaElement(final String element) throws ArgsException  {
        final char elementId = element.charAt(0);
        final String elementTail = element.substring(1);
        validateSchemaElementId(elementId);
        if (elementTail.length() == 0) {
            marshalers.put(elementId, new BooleanArgumentMarshaler());
        } else if (elementTail.equals("*")) {
            marshalers.put(elementId, new StringArgumentMarshaler());
        } else if (elementTail.equals("#")) {
            marshalers.put(elementId, new IntegerArgumentMarshaler());
        } else if (elementTail.equals("##")) {
            marshalers.put(elementId, new DoubleArgumentMarshaler());
        } else if (elementTail.equals("[*]")) {
            marshalers.put(elementId, new StringArrayArgumentMarshaler());
        } else {
            throw new ArgsException(INVALID_ARGUMENT_FORMAT, elementId, elementTail);
        }
    }

    private void validateSchemaElementId(final char elementId) throws ArgsException {
        if (!Character.isLetter(elementId)) {
            throw new ArgsException(INVALID_ARGUMENT_NAME, elementId, null);
        }
    }

    private void parseArgumentStrings(final List<String> argsList) throws ArgsException {
        for (currentArgument = argsList.listIterator(); currentArgument.hasNext(); ) {
            final String argString = currentArgument.next();
            if (argString.startsWith("-")) {
                parseArgumentCharacters(argString.substring(1));
            } else {
                currentArgument.previous();
                break;
            }
        }
    }

    private void parseArgumentCharacters(final String argChars) throws ArgsException {
        for (int i = 0; i < argChars.length(); i++) {
            parseArgumentCharacter(argChars.charAt(i));
        }
    }

    private void parseArgumentCharacter(final char argChar) throws ArgsException {
        final ArgumentMarshaler m = marshalers.get(argChar);
        if (m == null) {
            throw new ArgsException(UNEXPECTED_ARGUMENT, argChar, null); 
        } else {
            argsFound.add(argChar);
            try {
                m.set(currentArgument);
            } catch (ArgsException e) {
                e.setErrorArgumentId(argChar);
                throw e;
            }
        }
    }

    public boolean has(final char arg) {
        return argsFound.contains(arg);
    }

    public int nextArgument() {
        return currentArgument.nextIndex();
    }

    public boolean getBoolean(final char arg) {
        return BooleanArgumentMarshaler.getValue(marshalers.get(arg));
    }

    public String getString(final char arg) {
        return StringArgumentMarshaler.getValue(marshalers.get(arg));
    }

    public int getInt(final char arg) {
        return IntegerArgumentMarshaler.getValue(marshalers.get(arg));
    }

    public double getDouble(final char arg) {
        return DoubleArgumentMarshaler.getValue(marshalers.get(arg));
    }

    public String[] getStringArray(final char arg) {
        return StringArrayArgumentMarshaler.getValue(marshalers.get(arg));
    }

}
