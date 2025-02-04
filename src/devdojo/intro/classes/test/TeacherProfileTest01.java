package devdojo.intro.classes.test;

import devdojo.intro.classes.dominio.TeacherProfile;

public class TeacherProfileTest01 {
    public static void main(String[] args) {
        TeacherProfile profile = new TeacherProfile();
        profile.name = "Kakashi";
        profile.age = 50;
        profile.gender = 'M';

        System.out.print(profile.name+" "+profile.age+" "+profile.gender);
    }
}
