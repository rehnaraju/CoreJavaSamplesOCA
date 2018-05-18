/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaTest;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *
 * @author Flow-User
 */
public class LambdaTest3 {
    public static void main(String[] args) {
        //Predicate
        //consumer
        //Supplier
        
        Consumer<String> c1=(s) ->System.out.println("Start:" +s);
        Consumer<String> c2=(s) ->System.out.println("Ende:" +s);
        c2.andThen(c1).accept("lambdas is not schwer");
        
        List<String> liste=Arrays.asList("Rehna","Tino","Raju");
        liste.forEach((w)-> System.out.println("........."+w+".........."));
        //liste.forEach(c1);
        //Supplier
        Supplier<String> s1=() ->"Das ist ein Supplier";
       Supplier<Integer> rand=() -> new Random().nextInt(100);
        System.out.println(rand.get());
        System.out.println(rand.get());
        System.out.println("---------PREDICATE--------");
        
    }
    
}
