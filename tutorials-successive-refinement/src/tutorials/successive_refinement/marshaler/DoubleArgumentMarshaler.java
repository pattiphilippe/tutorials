package tutorials.successive_refinement.marshaler;

import tutorials.successive_refinement.ArgsException;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static tutorials.successive_refinement.ErrorCode.INVALID_DOUBLE;
import static tutorials.successive_refinement.ErrorCode.MISSING_DOUBLE;

public class DoubleArgumentMarshaler implements ArgumentMarshaler {

    private double doubleValue = 0;
    
    @Override
    public void set(final Iterator<String> currentArgument) throws ArgsException {
        String parameter = null;
        try {
            parameter = currentArgument.next();
            doubleValue = Double.parseDouble(parameter);
        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_DOUBLE);
        } catch (NumberFormatException e) {
            throw new ArgsException(INVALID_DOUBLE, parameter);
        }
    }

    public static double getValue(final ArgumentMarshaler am) {
        if (am instanceof DoubleArgumentMarshaler) {
            return ((DoubleArgumentMarshaler) am).doubleValue;
        }
        return 0;
    }

}
