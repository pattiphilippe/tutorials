public class DinerMenu {
    public static final int MAX_ITEMS = 6;
    private int nbItems = 0;
    MenuItem[] menuItems;


    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacn with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog, with sauerkrat, relish, onions, topped with cheese", false, 3.05);
    }


    public void addItem(String name, String description, boolean isVegetarian, double price) {
        if(nbItems >= MAX_ITEMS){
            System.err.println("Sorry, menu is full! Can't add item to menu.");
            return;
        } 
        menuItems[nbItems++] = new MenuItem(name, description, isVegetarian, price);
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }

}
