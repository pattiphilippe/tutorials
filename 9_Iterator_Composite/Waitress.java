import java.util.ArrayList;
import java.util.List;

public class Waitress {
    private List<Menu> menus = new ArrayList<>();

    public Waitress(List<Menu> menus){
        this.menus = menus;
    }

    public void printMenu(){
        menus.forEach(menu -> menu.forEach(System.out::println));
    }
}
