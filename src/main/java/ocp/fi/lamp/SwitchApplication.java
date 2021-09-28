package ocp.fi.lamp;

public class SwitchApplication {

    public static <T> void doSomethingWithLamp(T t, Switcher<T> switcher){

        t = switcher.switchLamp(t);
    }
    public static void main(String[] args) {
        Switcher<Lamp>  switcher1 = (Lamp b) -> {
            b.toggle();
            return  b;
        };

        Switcher<String> switcher2 = (b) -> {
            return  b;
        };
        Switcher<Integer> switcher3 = l -> {
            Lamp lamp = new Lamp();
            lamp.toggle();
            return  7;
        };

        Lamp lamp = new Lamp();
        System.out.println(lamp.toString());
        SwitchApplication.doSomethingWithLamp(lamp,switcher1);
        SwitchApplication.doSomethingWithLamp(lamp,switcher1);
        System.out.println(lamp.toString());
        doSomethingWithLamp("generic with string: ",switcher2);
        System.out.println(lamp.toString());
        doSomethingWithLamp(7,switcher3);
        System.out.println(lamp.toString());

    }
}
