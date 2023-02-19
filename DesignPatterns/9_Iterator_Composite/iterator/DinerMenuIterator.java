package iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        if (!hasNext())
            throw new NoSuchElementException();
        return items[position++];
    }



}
