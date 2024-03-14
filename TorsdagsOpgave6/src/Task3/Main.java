package Task3;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args){
        ArrayList<Person> persons = new ArrayList<>();

        Teacher t1 = new Teacher("Franck",new ArrayList<String>());
        Teacher t2 = new Teacher("Franck 2",new ArrayList<String>());
        Student s1 = new Student("Micke", new ArrayList<String>());
        Student s2 = new Student("Valdemar",new ArrayList<String>());



        t1.canTeach.add("Java 1.0 ");
        s1.passedCourses.add("Java 1.0 ");



        //t1.addCourse("Jeg vil hjem");
        //t2.addCourse("Jeg vil hjem");

        //s1.addCourse("Jeg vil hjem");
        //s2.addCourse("Jeg vil hjem");


        persons.add(t1);
        persons.add(t2);
        persons.add(s1);
        persons.add(s2);

        for(Person person: persons){
            person.addCourse("Java 1.0");


        }
    }
}
