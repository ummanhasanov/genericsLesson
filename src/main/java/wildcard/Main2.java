/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wildcard;

/**
 *
 * @author Umman Hasan
 */
public class Main2
{

    public static void main(String[] args) {
        // we create new container and given type is User2
        Container2<User2> container = new Container2<>(new User2());
        // we send container to method1
        method1(container);
    }

    // in method1 we see that lower bound is User3, it is true because User3 extends User2
    private static void method1(Container2<? super User3> container) {
        //here we can add parameter only User3 or objects extends User3 
        //for example we have User4, and User4 extends User3 and we can add new User4 as parameter
        container.castAndReturn(new User3());
    }

    // we can use code in line 25 only if we use super keyword, with extends we can't use it
    private static void method2(Container2<? extends User3> container) {
//        container.castAndReturn(new User3());
        //but we can call methods in User3 and we see it return to us User3 type
        // can write User3 u =  container.doo();
        container.doo();
    }
    
    private static void method3(Container2<?> container){//unbound wildcard
        // it 
        container.doo();
        container.<String>doo2("") ;
    }
}
