package home_automation.receivers;

public class Light {

    private String name;

    public Light(){
        this("Unknown");
    }

    public Light(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public String toString(){
        return this.getClass().getName()+ " : " + name;
    }

    public void on(){
        System.out.println(name + " : Light on");
    }

    public void off(){
        System.out.println(name + " : Light off");
    }

}
