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
public class CheckIfHopper implements CheckTrait{

    @Override
    public boolean test(Animal a) {
        return a.canHop();    }
    
}
