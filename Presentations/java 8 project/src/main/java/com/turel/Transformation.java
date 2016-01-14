package main.java.com.turel;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Haim.Turkel on 12/30/2015.
 */
public class Transformation {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);

        //version 1
        for (int i=0; i<values.size(); i++){
            System.out.println(values.get(i));
        }

        //version 2
        for (int i: values){
            System.out.println(values.get(i));
        }

        //version 3
        values.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(values.get(i));
            }
        });

        //what is a function:
        //1. method name
        //2. method parameter
        //3. method return type
        //4. method body

        //version 4
        //we have the mody, and parameter
        //return type will be figured out, and name is unnessary
        values.forEach((Integer value) -> System.out.println(value));


        //version 5
        //if the collection is of integers, why do we need to specify the integer?
        values.forEach((value) -> System.out.println(value));

        //version 6
        //this code just takes the parameter and passed it to another method
        //so we will use a method refernce
        values.forEach(System.out::println);
    }
}
