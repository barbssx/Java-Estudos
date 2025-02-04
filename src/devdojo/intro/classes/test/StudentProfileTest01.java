package devdojo.intro.classes.test;

import devdojo.intro.classes.dominio.StudentProfile;

public class StudentProfileTest01 {
    public static void main(String[] args) {
        StudentProfile studentProfile = new StudentProfile();
        studentProfile.name = "Vlad Dracula Tepes";
        studentProfile.age = 18;
        studentProfile.gender = 'M';
        System.out.println(studentProfile.name);
        System.out.println(studentProfile.age);
        System.out.println(studentProfile.gender);
    }
}
