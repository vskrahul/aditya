package khalidmughal.chapter3.declaration.bean;

import java.lang.Object;

public class TestBean extends Object {
    public static void main(String[] args) {
        Student aditya1 = new Student();
        aditya1.setAddress("Loni");
        aditya1.setFirstName("Aditya");
        aditya1.setLastName("Sharma");
        aditya1.setStudentId(100);
        Student aditya3 = aditya1;


        Student aditya2 = new Student(100, "Aditya", "Sharma", "Loni");


        System.out.println(aditya1.toString());
        System.out.println(aditya2.toString());

        System.out.println("compare reference = " + (aditya1 == aditya2)); // compare references
        System.out.println("compare objects = " + aditya1.equals(aditya2));

    }
}
