/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.fiest.patterns.singleton;

/**
 *
 * @author stasy
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
     
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}
 
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
    
    public void sayHello(){
        System.out.println("Hello from EagerInitializedSingleton!");
    }
}
