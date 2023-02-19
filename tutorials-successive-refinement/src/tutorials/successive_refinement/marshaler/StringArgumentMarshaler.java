package tutorials.successive_refinement.marshaler;

import tutorials.successive_refinement.ArgsException;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static tutorials.successive_refinement.ErrorCode.MISSING_STRING;

public class StringArgumentMarshaler implements ArgumentMarshaler {

    private String stringValue = "";

    @Override
    public void set(final Iterator<String> currentArgument) throws ArgsException {
        try {
            stringValue = currentArgument.next();
        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_STRING);
        }
    }

    public static String getValue(final ArgumentMarshaler am) {
        if (am instanceof StringArgumentMarshaler) {
            return ((StringArgumentMarshaler) am).stringValue;
        }
        return "";
    }
}
