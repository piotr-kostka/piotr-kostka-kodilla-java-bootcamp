package module1.excercise26;

public class Student {
    private String firstName;
    private String lastName;
    private String peselId;

    public Student (String firstName, String lastName, String peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    public boolean equals(Student s) {
        return (this.firstName == s.firstName) && (this.lastName == s.lastName) && (this.peselId == s.peselId);
    }

    public int hashCode() {
        return Integer.parseInt(peselId.substring(0,5));
    }

    public String toString() {
        return firstName + " " + lastName + " (" + peselId + ")";
    }
}
