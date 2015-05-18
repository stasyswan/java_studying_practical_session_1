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
public class EmployeeFactory extends AbstractFactory {
    @Override
    public  Employee factoryMethod(String name, double salary, String employeeType){
        if(employeeType == null)
            return null;
        if(employeeType.equalsIgnoreCase("MANAGER"))
            return new Manager(name, salary);
        else if (employeeType.equalsIgnoreCase("PROGRAMMER"))
            return new Programmer(name, salary);
        
        return null;
    }
}
