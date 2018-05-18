/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author Flow-User
 */
public class supplieBiConsumerBiPredicate {
    public static void main(String[] args) {
        // supplier is often used when constructing new objects....
        System.out.println("---------------Supplier---------------");
        Supplier<LocalDate> s1=()->LocalDate.now();
        LocalDate d1=s1.get();
        System.out.println(d1);
        
        Supplier<String> str=()->"Das ist nicht diese Prüfung Thema";
        String s3=str.get();
        System.out.println(s3);
        Supplier<StringBuilder> SB1=() ->new StringBuilder("Rehna");
        Supplier<StringBuilder> SB2=StringBuilder::new;
        System.out.println(SB1.get());
        
        Supplier<ArrayList<String>> SA1= ArrayList<String>::new;
        ArrayList<String> a1=SA1.get();
        a1.add("Rehna");
        a1.add("hna");
        a1.add("hhhhna");
        a1.add("bbbhna");
        for(String a:a1)
        {
            System.out.println(a);
        }
        
         Supplier<Adresse> s2 = () -> {

            Adresse a = new Adresse();

            a.setVorname("Max");

            a.setNachname("Mustermann");

            a.setOrt("Hamburg");

            return a;

        };
         
         Adresse max=s2.get();
         System.out.println(max);
        
        
        System.out.println("--------------------Consumer---------------------");
        
        Consumer<String> c1=System.out::println;
        Consumer<String> c2=x->System.out.println(x);
        c1.accept("hello......");
        c2.accept("Rehnaaaaaaa");
        
        Consumer<String> c11 = (s) -> System.out.println("Start: " + s);

        Consumer<String> c21 = (s) -> System.out.println("Ende: " + s);

        c21.andThen(c11).accept("Lambdas sind soooo schwer...");
        Supplier<ArrayList<String>> list1=ArrayList<String>:: new;
        ArrayList<String> list2=list1.get();
        list2.add("ffff");
        list2.add("hhhh");
        list2.forEach(w->System.out.println(".........."+w+"..........."));
        
        System.out.println("--------BiConsumer-----------");
        Map<String,Integer> map= new HashMap<>();
        BiConsumer<String,Integer> b1=map::put;
        System.out.println(map);
        b1.accept("chicken", 4);
        BiConsumer<String,Integer> b2=(k,v)->map.put(k, v);
        b2.accept("Schweine", 5);
        System.out.println(map);
        
        Map<String,String> map1= new HashMap<>();
        BiConsumer<String,String> b3=map1::put;
        System.out.println(map1);
        b3.accept("chicken","Tino");
        BiConsumer<String,String> b4=(k1,v1)->map1.put(k1, v1);
        b4.accept("Schweine", "jissmol");
        System.out.println(map1);
        
        System.out.println("--------------------Predicate---------------------");
        Predicate<String> p1=String::isEmpty;
        Predicate<String> p2=x->x.isEmpty();
        System.out.println(p1.test(""));
        System.out.println(p2.test(""));
        
        Predicate<String> p3=x->false;
        p3=x->x.equals("Moin");
        System.out.println("P3="+p3.test("Rehna"));
        
        Supplier<ArrayList<String>> bar=ArrayList<String>::new;
        ArrayList<String> bars=bar.get();
        bars.add("Hamburg Scum-Bar");
        bars.add("Scum-Bar, Monkey Island");
        bars.add("Zum betrunkenen Pferd");
        bars.add("Zum betrunkenen Pferd");
        bars.forEach((b)->System.out.println(b));
        System.out.println("--------------------BiPredicate---------------------");
        BiPredicate<String,String> bp1=(string,prefix)->string.startsWith(prefix);
        System.out.println(bp1.test("Hello Rehna","Hello"));
           
        
        
        
        
        
           
       
    }
    
    
}
