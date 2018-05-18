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
public class GenericTest {
    public static void main(String[] args) {
  //      Box<String> b =new Box();
    //    b.setInhalt("Mein ganzer langer text");
      //  System.out.println(b.getInhalt());
        //Box<Integer> b2 =new Box();
        //b2.setInhalt(1);
        //System.out.println(b2.getInhalt());
    }
    
}
class Box<T,R>
{
    private T inhalt;

    public T getInhalt() {
        return inhalt;
    }

    public void setInhalt(T inhalt) {
        this.inhalt = inhalt;
    }
     public void machWas(T inhalt,boolean b) {
        this.inhalt = inhalt;
        
    }
}