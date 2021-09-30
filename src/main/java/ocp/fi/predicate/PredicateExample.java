package ocp.fi.predicate;

import ocp.fi.lamp.Lamp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    Predicate predicate;

    private static <T> boolean doSomethingWithConsumer(T t,Predicate<T> predicate){
        return predicate.test(t);
    }

    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.startsWith("A");

        boolean startsWithA = PredicateExample.doSomethingWithConsumer("AAAVVVVV", predicate);

        System.out.println(startsWithA);

        Predicate<Integer> predicate2 = s-> s>0;
        boolean greaterthanZero = PredicateExample.doSomethingWithConsumer(-9, predicate2);
        Predicate<Lamp> predicate3 = s -> s.isOn();
        Lamp lamp = new Lamp();
        lamp.toggle();
        boolean isLampOn = PredicateExample.doSomethingWithConsumer(lamp, predicate3);
        System.out.println(isLampOn);
        Predicate<Integer> predicate4 = s-> (s%2==0);
        boolean isEvenNumber = PredicateExample.doSomethingWithConsumer(7,predicate4);
        System.out.println(isEvenNumber);

        List<Lamp> lamps = new ArrayList<>();
        lamps.add(new Lamp(true));
        lamps.add(new Lamp(true));
        lamps.add(new Lamp(false));
        lamps.add(new Lamp(true));
        lamps.add(new Lamp(false));
        lamps.add(new Lamp(true));
        lamps.add(new Lamp(true));


//        List<Lamp> lampsOn = lamps.stream()
//                .filter(predicate3)
//                .toList();

        List<Lamp> lampsOn = lamps.stream()
                .filter(s -> s.isOn())
                .toList();

        lampsOn.stream().forEach(s -> System.out.println(s.toString()));
        System.out.println("+++++++++++++++++++++++");
        lampsOn.stream().forEach(System.out::println);

        System.out.println("---------------------");
        lamps.stream().forEach(s -> System.out.println(s.toString()));


    }



}
