/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaTest;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Flow-User
 */
public class LambdaTest {
    int i1=100;
    static int i2=200;
    static Myinterface i;
    public static void main(String[] args) {
        LambdaTest lt =new LambdaTest();
        ArrayList<String> liste=new ArrayList<>();
        int y=20;
         i =(int a,String b) ->{
            System.out.println("Moin.........!"+a);
            System.out.println(lt.i1);
            return;
        };
        
        i.machwas(1,"");
        
        //Object o=(a,b) ->System.out.print("");
        Object o=i;    
        i2=300;
        lt.i1=150;
    }
    }
@FunctionalInterface
interface Myinterface
{
    void machwas(int i,String s) ;
    
}

interface MyInterface2 extends Myinterface
{
    void machwas(int i,String s) ;
    void machwas2(int i,String s) ;
}
