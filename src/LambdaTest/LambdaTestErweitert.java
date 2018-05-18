/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaTest;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *
 * @author Flow-User
 */
public class LambdaTestErweitert {
    public static void main(String[] args) {
        //Function <T,R>
        //R apply(T t)
        Function<String,Integer> f1=(s) ->Integer.parseInt(s);
        System.out.println(f1.apply("890"));
        
        BiFunction<String,Integer,Integer> f2=(s,i) ->Integer.parseInt(s)+i;
        System.out.println(f2.apply("890",2));
        
        //UnaryOperator<T>
        
        UnaryOperator<String> uo=(s) -> s+".....";
        System.out.println(uo.apply("Hallo"));
        
        BinaryOperator<String> bo=(s1,s2) -> s1+"....."+s2;
        System.out.println(bo.apply("Hallo","hai........"));
    }
    
}
