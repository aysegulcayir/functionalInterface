package ocp.fi.lamp;

public class Lamp {

    boolean isOn;


    public Lamp(){}

    public Lamp(boolean isOn){
        this.isOn = isOn;
    }

    public void toggle(){isOn = (isOn)? false:true;}

    public boolean isOn() {
        return isOn;
    }

    @Override
    public String toString() {
        return "I AM "  + ((isOn) ? "ON": "OFF");
    }
}
