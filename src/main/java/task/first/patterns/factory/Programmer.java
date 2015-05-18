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
public class Programmer extends Employee {
    private String name;
    private double salary;

    public Programmer(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    
    @Override
    public String status(){
        return "Programmer status";
    }
    
    @Override
    public double salary(){
        return salary;
    }
}
