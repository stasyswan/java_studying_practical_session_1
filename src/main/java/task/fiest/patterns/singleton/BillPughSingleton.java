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
public class BillPughSingleton {
    private BillPughSingleton(){}
     
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
     
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
    
    public void sayHello(){
        System.out.println("Hello from BillPughSingleton!");
    }
}
