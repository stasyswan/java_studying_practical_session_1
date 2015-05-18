/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.first.patterns.factory;

/**
 *
 * @author stasy
 */
public class FactoryDemo {
    public static void main(String[] args) {
        AbstractFactory eF = FactoryProducer.getFactory();
        Employee manager = eF.factoryMethod("Manager", 3500.00, "MANAGER");
        Employee programmer = eF.factoryMethod("Programmer", 2500.00, "PROGRAMMER");
        
        System.out.println(manager.status());
        System.out.println(manager.salary());
        
        System.out.println(programmer.status());
        System.out.println(programmer.salary());
    }
}
