package devdojo.intro.classes.test;

import devdojo.intro.classes.dominio.StudentProfile;

public class StudentProfileTest02 {
    public static void main(String[] args) {
        StudentProfile studentProfile = new StudentProfile();

        System.out.println(studentProfile.name);
        System.out.println(studentProfile.age);
        System.out.println(studentProfile.gender);
    }
}
