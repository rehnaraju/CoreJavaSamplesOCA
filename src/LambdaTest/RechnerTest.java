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
public class RechnerTest {
    public static void main(String[] args) {
        
        MathOperation add =(a,b) ->a+b;
        MathOperation sub =(a,b) ->a-b;
        MathOperation multi =(a,b) ->a*b;
        MathOperation div =(a,b) ->a/b;
        System.out.println(rechne(10,30,sub));
    }
    public static int rechne(int a,int b,MathOperation o)
    {
       return o.op(a, b);
    }
    
}
interface MathOperation
{
    int op(int a,int b);
}
