// this
// *
// *  The this keyword is a reference variable.
// *It is used in constructors and instance methods.
// *It is used to access the current object's members.
// *
// *

package devdojo.intro.classes.methods.dominio;

public class Student {
    public String name;
    public int age;
    public char gender;



    public void Printing( ){
        System.out.println();
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);


    }
}
