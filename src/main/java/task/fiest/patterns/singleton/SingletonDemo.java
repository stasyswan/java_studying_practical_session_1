/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.fiest.patterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 *
 * @author stasy
 */
public class SingletonDemo {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LazyInitializedSingleton ls1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton ls2 = LazyInitializedSingleton.getInstance();
        ls1.sayHello();
        ls2.sayHello();
        System.out.println("ls1 hashCode="+ls1.hashCode());
        System.out.println("ls2 hashCode="+ls2.hashCode());
        EagerInitializedSingleton.getInstance().sayHello();
        StaticBlockSingleton.getInstance().sayHello();
        ThreadSafeSingleton.getInstance().sayHello();
        ThreadSafeSingleton.getInstanceUsingDoubleLocking().sayHello();
        BillPughSingleton.getInstance().sayHello();
       
        // Using Reflection to destroy Singleton Pattern
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
        
        // SingletonSerializedTest
        SerializedSingleton instanceThree = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceThree);
        out.close();
         
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SerializedSingleton instanceFour = (SerializedSingleton) in.readObject();
        in.close();
         
        System.out.println("instanceOne hashCode="+instanceThree.hashCode());
        System.out.println("instanceTwo hashCode="+instanceFour.hashCode());
    }
}
