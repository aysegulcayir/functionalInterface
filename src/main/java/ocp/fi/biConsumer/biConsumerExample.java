package ocp.fi.biConsumer;

import ocp.fi.lamp.Lamp;

import java.util.function.BiConsumer;

public class biConsumerExample {

    BiConsumer biConsumer;

    private static <T,U> void doSomethingWithBiConsumer(T t, U u, BiConsumer<T,U> biConsumer){
        biConsumer.accept(t,u);
    }

    public static void main(String[] args) {

        BiConsumer<String,Lamp> biConsumer = (u,v) -> System.out.println(u);


        doSomethingWithBiConsumer("Hello ",new Lamp() , biConsumer);

        BiConsumer<String, Lamp> lampBiConsumer = (s,l) -> {
            System.out.println(l.toString());
            l.toggle();
            System.out.println(s);
            System.out.println(l.toString());


        };
        doSomethingWithBiConsumer("Switching lamp: ",new Lamp() ,lampBiConsumer);

    }
}
