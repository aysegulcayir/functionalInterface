package ocp.fi.function;

import ocp.fi.lamp.Lamp;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    Function function;
    final  static String message = "Hello";

    private <T, R> R useFunction(T t, Function<T, R> function) {
        return function.apply(t);
    }

    private <T, R> Boolean useFunction2(T t, Function<T, Boolean> function) {
        return function.apply(t);
    }

    private Boolean useFunction3(Lamp l, Function<Lamp, Boolean> function) {
        return function.apply(l);
    }

    public static void main(String[] args) {

        FunctionExample functionExample = new FunctionExample();

        Function<Integer, Integer> function = x -> x * 3;

        Function<Lamp, String> function2 = x -> "Lamp: " + x.toString();


        final String message = "Hallo";
        final Lamp fLamp = new Lamp(true,150);

        Function<Integer, List<Lamp>> function3 = x -> {
            List<Lamp> lamps = new ArrayList<>();
            fLamp.toggle();
            // fLamp = new Lamp(true,85);
            // message = "Hello";
            System.out.println(message);
            for (int i = 0; i < x; i++) {
                lamps.add(new Lamp(true, 70));

            }
            return lamps;

        };
        Integer resul1 = functionExample.useFunction(5,function);
        System.out.println(resul1);

        String result2 = functionExample.useFunction(new Lamp(false,120),function2);
        System.out.println(result2);

        List<Lamp> lamps = functionExample.useFunction(34,function3);
        System.out.println(lamps);

        MyFunction<String,String,String,String,String> myFunction = (a,b,c,d)->a+b+c+d;

    }
}
