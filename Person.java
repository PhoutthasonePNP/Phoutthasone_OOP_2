import java.util.*;

public class Person {
    protected String name;
    protected int age;

    private void setAge(int age) {
        this.age = age;
    }

    private int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void printInformation() {
        System.out.println("Name:" + getName());
        System.out.println("Age:" + getAge());
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Phoutthasone Phengmixay");
        p1.setAge(20);
        p1.printInformation();
    }
}

class Student extends Person {
    protected int year;
    Set<Select> own;
}

class Instructor extends Person {
    @Size(max = 1)
    Set<Course> teacher;

    public void Assign() {
        System.out.println("Assign");
    }
}

class Select {
    protected float mark;
    protected String location;
    @Size(max = 1)
    Set<Course> choice;
    @Size(max = 1)
    Set<Student> make;
}

class Course {
    protected String name;
    protected double grade;
    Set<Select> lesson;
    Set<Instructor> teach;
}
