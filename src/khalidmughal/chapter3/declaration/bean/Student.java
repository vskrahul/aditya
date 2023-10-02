package khalidmughal.chapter3.declaration.bean;

public class Student extends Object {
    Integer studentId;
    String firstName;
    String lastName;
    String address;

    public Student(int studentId, String firstName, String lastName, String address) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    public Student() {

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("[roll number=%d] " +
                        "[first name = %s] " +
                        "[last name = %s] " +
                        "[address = %s] ",
                this.studentId,
                this.firstName,
                this.lastName,
                this.address);
        //return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        Student st = null;
        if(obj instanceof Student) {
            st = (Student)obj;
            return this.studentId.equals(st.studentId);
        }
        return false;
    }
}
