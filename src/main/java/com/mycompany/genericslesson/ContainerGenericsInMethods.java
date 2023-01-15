/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.genericslesson;

/**
 *
 * @author Umman Hasan
 */
public class ContainerGenericsInMethods
{
      
    public <T> T doItAndReturn(){
        System.out.println("i did something");
        return null;
    }
    
    public <E> E doItAndReturn2(E object){
        System.out.println("i did something");
        return object;
    }
}
