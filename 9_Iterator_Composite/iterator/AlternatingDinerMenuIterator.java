package iterator;
import java.util.Calendar;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        if (!hasNext())
            throw new NoSuchElementException();
        MenuItem menuItem = items[position];
        position += 2;
        return menuItem;
    }
    
}
