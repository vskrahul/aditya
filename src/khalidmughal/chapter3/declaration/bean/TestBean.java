package khalidmughal.chapter3.declaration.bean;

import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public class TestBean extends Object {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(100, "Aditya", "Sharma", "Loni"));
        list.add(new Student(101, "Renu", "Sharma", "Loni"));
        list.add(new Student(102, "Kajal", "Sharma", "Loni"));

        Student.printStudent(list);

        Student aditya1 = new Student();
        aditya1.setAddress("Loni");
        aditya1.setFirstName("Aditya");
        aditya1.setLastName("Sharma");
        aditya1.setStudentId(100);
        Student aditya3 = aditya1;


        Student aditya2 = new Student(100, "Aditya", "Sharma", "Loni");


        Student.printStudent(aditya1);
        System.out.println(aditya2.toString());

        System.out.println("compare reference = " + (aditya1 == aditya2)); // compare references
        System.out.println("compare objects = " + aditya1.equals(aditya2));
    }
}
