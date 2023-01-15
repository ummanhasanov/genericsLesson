/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.genericslesson;

/**
 *
 * @author Umman Hasan
 * @param <T>
 */
public class Container<T>
{
    private T object;

    public Container() {
    }

    public Container(T object) {
        this.object = object;
    }
    
    public T doItAndReturn(){
        System.out.println("i did something");
        return this.object;
    }
}
