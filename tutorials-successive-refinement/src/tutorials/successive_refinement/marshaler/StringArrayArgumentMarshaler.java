package tutorials.successive_refinement.marshaler;

import tutorials.successive_refinement.ArgsException;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static tutorials.successive_refinement.ErrorCode.MISSING_STRING_ARRAY;

public class StringArrayArgumentMarshaler implements ArgumentMarshaler {

    private String[] stringArrayValue = {};

    @Override
    public void set(final Iterator<String> currentArgument) throws ArgsException {
        try {
            final String parameter = currentArgument.next();
            stringArrayValue = parameter.split(",");
        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_STRING_ARRAY);
        }
    }

    public static String[] getValue(final ArgumentMarshaler am) {
        if (am instanceof StringArrayArgumentMarshaler) {
            return ((StringArrayArgumentMarshaler) am).stringArrayValue;
        }
        return null;
    }
}
