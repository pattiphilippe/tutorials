package home_automation.receivers;

public class GarageDoor {

    private String name;

    public GarageDoor(){
        this("Unknown");
    }

    public GarageDoor(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public String toString(){
        return this.getClass().getName()+ " : " + name;
    }

    public void up(){
        System.out.println(name + " : Garage Door up");
    }
    
    public void down(){
        System.out.println(name + " : Garage Door down");
    }
    
    public void stop(){
        System.out.println(name + " : Garage Door stop");
    }
    
    public void lightOn(){
        System.out.println(name + " : Garage Door lightOn");
    }
    
    public void lightOff(){
        System.out.println(name + " : Garage Door lightOff");
    }
}
