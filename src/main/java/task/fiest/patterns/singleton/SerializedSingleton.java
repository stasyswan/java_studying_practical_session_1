/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.fiest.patterns.singleton;

import java.io.Serializable;

/**
 *
 * @author stasy
 */
public class SerializedSingleton  implements Serializable{
    private static final long serialVersionUID = -7604766932017737115L;
 
    private SerializedSingleton(){}
     
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
     
    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
    
    protected Object readResolve() {
        return getInstance();
    }
}
