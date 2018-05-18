/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe5Lambda;


import java.util.function.Predicate;

/**
 *
 * @author Flow-User
 */
public class PredicateBook {
    public static Predicate<Integer> PagePricePredicate=new Predicate<Integer>() {
       

        @Override
        public boolean test(Integer t) {
            return t>750;
        }
    
};
    
}
