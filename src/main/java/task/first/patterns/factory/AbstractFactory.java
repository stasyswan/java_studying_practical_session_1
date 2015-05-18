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
public abstract class AbstractFactory {
    abstract Employee factoryMethod(String name, double salary, String employeeType);
}
