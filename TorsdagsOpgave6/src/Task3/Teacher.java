package Task3;

import java.util.ArrayList;

public class Teacher extends Person {

    public ArrayList<String> canTeach = new ArrayList<>();
    public ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
    }


    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            System.out.println("You are qualified to teach " + course + getName());
            currentCourses.add(course);
            return true;
        } else {
            System.out.println(getName() + " You are not qualified to teach " + course);
            return false;
        }


    }
}

