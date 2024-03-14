package Task3;

import java.util.ArrayList;

public class Student extends Person {

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
    }

     ArrayList<String> passedCourses = new ArrayList<>();
     ArrayList<String> currentCourses = new ArrayList<>();

    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            System.out.println(getName() +  " has already Passed " + course);
            return false;
        } else {
            currentCourses.add(course);
            System.out.println(getName() + " Is now signed up for " + course);
            return true;
        }
    }
}

