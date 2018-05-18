/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejavasamplesoca;

/**
 *
 * @author Flow-User
 */
public class subclassPoly extends Polymorphism implements intPoly{

    @Override
    public boolean sayYes() {
    return true;    
    }
    public int age=24;
    public static void main(String[] args) {
        subclassPoly sub=new subclassPoly();
        System.out.println(sub.age);
        intPoly i=sub;
        System.out.println(i.sayYes());
        System.out.println(sub.sayYes());
        Polymorphism po=sub;
        System.out.println(po.hasHandy());
        
        System.out.println("-------------------");
        subclassPoly sub1=(subclassPoly)po;
        System.out.println(sub1.age);
    }
    
    
}
