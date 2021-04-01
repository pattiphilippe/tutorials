package home_automation.receivers;

public class CeilingFan {
    private String name;
    private CeilingFanSpeed speed;

    public CeilingFan(String name){
        this.name = name;
        speed = CeilingFanSpeed.OFF;
    }

    public String getName(){
        return name;
    }
    
    public String toString(){
        return this.getClass().getName()+ " : " + name;
    }

    public CeilingFanSpeed getSpeed(){
        return speed;
    }

    public void setSpeed(CeilingFanSpeed speed){
        this.speed = speed;
        System.out.println(name + " : " + speed);
    }
}
