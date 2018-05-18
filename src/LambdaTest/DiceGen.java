/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaTest;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Flow-User
 */
public class DiceGen {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Dice d=null;
        while(true)
        {
        System.out.println("how many sides have a dice");
        switch(scanner.nextInt())
        {
            case 4:
                d=()->(int)(Math.random()*4+1);
                break;
                
            case 6:
                d=() ->new Random().nextInt(6);
                break;
            
            case 10:
                d=() ->new Random().nextInt(10);
                break;
                
            case 20:
                d=() ->new Random().nextInt(20);
                break;
                
            case 100:
                d=() ->new Random().nextInt(100);
                break;
                
            default:
                System.out.println("not corect");
                continue;
        }
        System.out.println(d.role());
        }
        
    }
 
}


interface Dice
{
    int role();
}