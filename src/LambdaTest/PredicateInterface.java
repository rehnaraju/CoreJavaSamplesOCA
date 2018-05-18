/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaTest;

import java.util.function.Predicate;

/**
 *
 * @author Flow-User
 */
public class PredicateInterface {
    public static Predicate<Integer> PositiveIntegerPredicate=new Predicate<Integer>() {
        @Override
        public boolean test(Integer t) {
            return t>0;
        }
    
};
    
}
