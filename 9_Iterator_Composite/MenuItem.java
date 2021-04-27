public class MenuItem {
    private String name;
    private String description;
    private boolean isVegetarian;
    private double price;


    public MenuItem(String name, String description, boolean isVegetarian, double price) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }


    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isVegetarian() {
        return this.isVegetarian;
    }

    public double getPrice() {
        return this.price;
    }
    
}