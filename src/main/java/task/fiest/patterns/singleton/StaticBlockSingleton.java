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
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    
    private StaticBlockSingleton(){}
     
    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
     
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
    
    public void sayHello(){
        System.out.println("Hello from StaticBlockSingleton!");
    }
}
