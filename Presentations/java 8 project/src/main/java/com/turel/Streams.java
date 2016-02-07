package main.java.com.turel;

import java.lang.Integer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Haim.Turkel on 12/30/2015.
 */
public class Streams {

//    interface Fly {
//        default public void test() {
//            System.out.printf("ss");
//        }
//
//        public void me();
//    }
//
//    interface MlyMe extends Fly{
//        default  void test() {
//            System.out.printf("dd");
//        }
//
//        default  void me() {
//            System.out.printf("ss");
//        }
//    }


    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);

        //version 1 -> imperative code (mutation in code)
        int total = 0;
        for (int e : values){
            total += e *2;
        }
        System.out.println(total);


        String::toUpperCase

        //version 2 -> we say what we want and not how
        System.out.println(
                values.stream().map(e -> e * 2).reduce(0, (c, e) -> c + e)
        );

//        IntStream intStream = integerStream.mapToInt();
//        intStream.

    }
}
