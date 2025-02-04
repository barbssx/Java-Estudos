package devdojo.intro.classes.methods.test;

import devdojo.intro.classes.methods.dominio.Student;

public class StudentPrinting {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "John";
        student1.age = 18;
        student1.gender = 'M';
        student1.Printing();

        student2.name = "Jane";
        student2.age = 21;
        student2.gender = 'F';
        student2.Printing();

    }
}
