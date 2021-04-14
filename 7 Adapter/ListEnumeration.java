import java.util.List;
import java.util.Enumeration;

public class ListEnumeration implements Enumeration<Object> {

    private List<?> list;

    public ListEnumeration(List<?> list){
        this.list = list;
    }

    @Override
    public boolean hasMoreElements() {
        return list.iterator().hasNext();
    }

    @Override
    public Object nextElement() {
        return list.iterator().next();
    }
    
}
