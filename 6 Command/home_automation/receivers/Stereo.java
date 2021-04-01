package home_automation.receivers;

public class Stereo {

    private String name;
    private int volume = 0;

    public Stereo(){
        this("Unknown");
    }

    public Stereo(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public String toString(){
        return this.getClass().getName()+ " : " + name;
    }

    public void on(){
        System.out.println(name + " : Stereo on");
    }
    
    public void off(){
        System.out.println(name + " : Stereo off");
    }

    public void setCd(){
        System.out.println(name + " : Stereo set Cd");
    }

    public void setDvd(){
        System.out.println(name + " : Stereo set Dvd");
    }

    public void setRadio(){
        System.out.println(name + " : Stereo set Radio");
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        if(volume < 0){
            throw new IllegalArgumentException("Volume can't be negative!");
        }
        this.volume = volume;
        System.out.println(name + " : Stereo set Volume to " + volume);
    }
}
