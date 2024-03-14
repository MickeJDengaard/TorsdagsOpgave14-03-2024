package Task3;

abstract public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    abstract public boolean addCourse(String course);

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;


    }
}
