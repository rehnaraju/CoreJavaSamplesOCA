/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe5Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

/**
 *
 * @author Flow-User
 */
public class Book_Sale {
    
   
    public static void main(String[] args) {
        List<String> titelArray=Arrays.asList("Java 7 Übungsbuch Band I", "Java 7 Übungsbuch Band II", "Android 4 Übungsbuch", "Servlets und JavaServer Pages");
        List<Double> preisArray=Arrays.asList(29.95, 29.95, 24.95, 16.95);
        List<Integer> seitenArray=Arrays.asList(806, 796, 454, 748);
        System.out.println("..............................");
        List<Double> changedPreisArray=getchangedBookList(seitenArray,preisArray,PredicateBook.PagePricePredicate);
        
        
        for(int i=0;i<changedPreisArray.size();i++)
        {
            KindleEdition KE1=new KindleEdition(titelArray.get(i),changedPreisArray.get(i),seitenArray.get(i));
            System.out.println(KE1);
            
        }
       
        
               
    }
    
    public static List<Double> getchangedBookList(List<Integer> seitenArray,List<Double> preisArray,Predicate<Integer> PagePricePredicate )
    {
       
       List<Double> changedPreisArray=new ArrayList<Double>();
       int j=0;
       for(Integer i:seitenArray)
       {
           
          if(PagePricePredicate.test(i))
          {
              
              double x=preisArray.get(j);
              x=(x*12)/100;
              changedPreisArray.add(x);
              
             
          }
          else
          {
              double x=preisArray.get(j);
              x=(x*9)/100;
              changedPreisArray.add(x);
          }
          j++;
       }
       
       return changedPreisArray;
    }
}
    
    
   

