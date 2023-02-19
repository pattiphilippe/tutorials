package tutorials.successive_refinement.marshaler;

import java.util.Iterator;

public class BooleanArgumentMarshaler implements ArgumentMarshaler {

    private boolean booleanValue = false;

    @Override
    public void set(final Iterator<String> currentArgument) {
        booleanValue = true;
    }

    public static boolean getValue(final ArgumentMarshaler am) {
        if (am instanceof BooleanArgumentMarshaler) {
            return ((BooleanArgumentMarshaler) am).booleanValue;
        }
        return false;
    }
}
