package khalidmughal.chapter7.oops.inheritance;

public class InheritanceIsARelationShip {
}

abstract class Employee {
    String employeeId;
    String firstName;
    String lastName;
    /**
     * Employee HAS-A Address
     * We call it HAS-A relationship
     */
    Address address;
    String profile;
    Employee(String profile) {
        this.profile = profile;
    }
    //setter
    //getter
}

/**
 * Manager is subclass of Employee
 * we call this relation IS-A relation
 * E.g.; Manger IS-A Employee
 */
class Manager extends Employee {
    Manager(String profile) {
        super(profile);
    }
}

class HR extends Employee {
    HR(String profile) {
        super(profile);
    }
}

class Address {
    String addressLine1;
    String addressLine2;
    String zipCode;
    String city;
    String district;
    String state;
    String country;
}



