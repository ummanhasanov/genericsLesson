/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package wildcard;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) {

        Container<Integer> container1 = new Container<>();
        Container<Object> container2 = new Container<>();

        Container<User> container3 = new Container<>(); // with different types

        method(container1);
        method2(container2);

        method3(container3);
    }

    public static void method(Container<? extends Number> container) {

    }

    // with same types but one is extends, another one is super
    public static void method2(Container<? super Number> container) {

    }

// with different types
    public static void method3(Container<? extends User> container) {

    }
}
