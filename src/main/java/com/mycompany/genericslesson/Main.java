/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.genericslesson;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) {
        // Generic olmadan ,yani <> operator 1.7 den baslayib , olmadan Raw type deyilir, sade formasi, xammal kimi
        // Type safety => compile zamani olur, Compile time safety == GENERIC 
//        Container<User> container = new Container<>(new User());// default olaraq <Object> olur
//        // Compile olunub bittikden sonra decompile olunduqda Raw type qayidir buna Type Erasure(tip silinme) deyilir
//
//        doSomething(container);

        ContainerGenericsInMethods container1 = new ContainerGenericsInMethods();

        User u = container1.doItAndReturn();
    }

    public static void doSomething(Container<User> container) {
        User u = container.doItAndReturn();
        System.out.println("u=" + u);
    }
}
