/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wildcard;

/**
 *
 * @author Umman Hasan
 * @param <E>
 */
public class Container2<E>

{
    // create new private variable

    private E stored;

    //create constructor with E type obj and this.stored = obj
    public Container2(E obj) {
        this.stored = obj;
    }

    // create new method which cast to (E) given parameter and return it, given parameter is passed
    public E castAndReturn(E passed) {
        System.out.println("passed=" + passed.getClass().getName());
        System.out.println("stored=" + stored.getClass().getName());
        return (E) passed;
    }
    
    public E doo(){
        return stored;
    }
    
    public String doo2(String s){
        return s;
    }
}
