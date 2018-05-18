/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Flow-User
 */
public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(-5,-4,-3,-2,-1,0,1,2,3,4,5);
        //classname.method
        List<Integer> filiteredNumbers=getfiliteredNumbers(numbers,PredicateInterface.PositiveIntegerPredicate);
        filiteredNumbers.forEach(System.out::println);
        
        
        
    }
    //PositiveIntegerPredicate is Predicate name in PredicateInterface in java
    public static List<Integer> getfiliteredNumbers(List<Integer> numbers,Predicate<Integer> PositiveIntegerPredicate )
    {
       List<Integer> filiteredNumbers=new ArrayList<Integer>();
       for(Integer i:numbers)
       {
          if(PositiveIntegerPredicate.test(i))
          {
              filiteredNumbers.add(i);
          }
       }
       
       return filiteredNumbers;
    }
}

//to call staic variable

