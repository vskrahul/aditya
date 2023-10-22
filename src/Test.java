import animal.cat.Cat;

public class Test {
    // as soon as class loads into memory
    // lifetime - until class unloads from memory
    static String staticVariable = "static variable";

    // as soon as we create an object
    // lifetime - until object remains in memory
    String instanceVariable = "instance variable";

    public static void main(String args[]){
        System.out.println("Hello");
        Test t = new Test();
        t.doSomething();
        System.out.println("hi");

    }
    void doSomething() {
        //as soon as we enter into method
        // lifetime - until we exit the method
        int x = 100;
        String localVariable = "local variable";
    }
}

class CustomerIntegerWrapperClass {
    private int value;
    public CustomerIntegerWrapperClass(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
    public boolean equals(CustomerIntegerWrapperClass value) {
        return this.value == value.getValue();
    }
}


class Employee {

    Employee[] employees;
    String firstName;
    String lastName;
    int age;
    String fatherName;
    public boolean equals(Employee emp) {
        //compare properties to check if two object are same or not
        return this.firstName.equals(emp.firstName)
        && this.lastName.equals(emp.lastName)
        && this.age == emp.age
        && this.fatherName.equals(emp.fatherName);
    }
}