package tutorials.successive_refinement.marshaler;

import tutorials.successive_refinement.ArgsException;

import java.util.Iterator;

public interface ArgumentMarshaler {
    void set(final Iterator<String> currentArgument) throws ArgsException;
}
