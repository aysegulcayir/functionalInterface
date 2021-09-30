package ocp.fi.predicate;

import ocp.fi.lamp.Lamp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApplication {
    public static void main(String[] args) {

        List<Dj> djs = new ArrayList<>();
        djs.add(new Dj("Kevin",23));
        djs.add(new Dj("Pete",34));
        //use Stream.anyMatch method to test if name "kevin" is in the list of djs
        //you can the map method also to map the stream of djs
        //to a stream of Strings (names)

        Boolean streamMap = djs.stream()
                .map(n->n.getName())
                .anyMatch(n -> (n.equalsIgnoreCase("Kevin")));


        Boolean stream = djs.stream().
                anyMatch( n -> (n.name.equalsIgnoreCase("kevin")));

        System.out.println(stream);
        System.out.println(streamMap);

    }

}
