/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.first.anonymous.classes;

/**
 *
 * @author stasy
 */
public class Car {
    String name;
    int weight;
    
    public Car(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public String toString(){
        return "String";
    }
    
    public boolean equals(Car car){
        return true;
    }
    
//    public static void main(String[] args) {
//        Car c1 = new Car("c1", 5000){
//            @Override
//            public String toString(){
//                return this.name + " " + this.weight;
//            }
//            
//            @Override
//            public boolean equals(Car car){
//                return this.name.equals(car.name) && this.weight == car.weight;
//            }
//        };
//        
//        Car c2 = new Car("c2", 7000){
//            @Override
//            public String toString(){
//                return this.name + " pfpdpdpdpdpd " + this.weight;
//            }
//            
//            @Override
//            public boolean equals(Car car){
//                return this.name.equals(car.name) && this.weight == car.weight;
//            }
//        };
//        
//        Car c3 = new Car("c1", 5000);
//        
//        System.out.println(c1.toString());
//        System.out.println(c2.toString());
//        System.out.println(c3.toString());
//        System.out.println(c1.equals(c2));
//        System.out.println(c2.equals(c1));
//        System.out.println(c3.equals(c1));
//       
//    }
    
}
