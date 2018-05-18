/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaTest;

/**
 *
 * @author Flow-User
 */
public class LambdaTest2 {
    public static void main(String[] args) {
        //SAM - single abstract method
       //MyFunctional mf=() ->System.out.println("Lambda1");
      // mf.machWas();
        MyFunctional.machWasStatic();
        //mf.machWasAnderes();
       //mf=() ->System.out.println("Lambda2");
       //mf.machWas();
     /*  MyFunctional mf=(s)->System.out.println("Lambda v2"); //void machWas(String s); 
       mf=abc->System.out.println("Lambda v2");
       mf=(String x)->System.out.println("Lambda v2");
       mf=s->{
           System.out.println("Lambda v2");
       };*/
     
   /*  MyFunctional mf=(s,i)->System.out.println("Lambda v3" +s+" "+i);
     mf.machWas("Rehna",2);
     //s="rahul";//not possible......
    }*/
   /*  MyFunctional mf=(i)->11+i;
   mf =i->{
       i*=100;
       return i;
   };
        System.out.println(mf.machWas(2));
   
 */
   MyFunctional mf=()->(int)Math.random()*100;
        System.out.println(mf.machWas());
   
}
}
@FunctionalInterface
interface MyFunctional
{
    double PI=3.14;
  // void machWas(); 
   //void machWas(String s);
  // void machWas(String s,int i); 
   //int machWas(int i); 
    int machWas(); 
   default void machWasAnderes()
   {
       System.out.println("default");
   }
   static void machWasStatic()
   {
       System.out.println("Static");
   }
}
/*class MyClass implements MyFunctional
{

    @Override
    public void machWas() {
        System.out.println("Implementierung");    
    }
    
}*/
