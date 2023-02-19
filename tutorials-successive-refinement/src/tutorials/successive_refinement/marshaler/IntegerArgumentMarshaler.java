package tutorials.successive_refinement.marshaler;

import tutorials.successive_refinement.ArgsException;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static tutorials.successive_refinement.ErrorCode.INVALID_INTEGER;
import static tutorials.successive_refinement.ErrorCode.MISSING_INTEGER;

public class IntegerArgumentMarshaler implements ArgumentMarshaler {
    private int intValue = 0;

    @Override
    public void set(final Iterator<String> currentArgument) throws ArgsException {
        String parameter = null;
        try {
            parameter = currentArgument.next();
            intValue = Integer.parseInt(parameter);
        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_INTEGER);
        } catch (NumberFormatException e) {
            throw new ArgsException(INVALID_INTEGER, parameter);
        }
    }

    public static int getValue(final ArgumentMarshaler am) {
        if (am instanceof IntegerArgumentMarshaler) {
            return ((IntegerArgumentMarshaler) am).intValue;
        }
        return 0;
    }
}
