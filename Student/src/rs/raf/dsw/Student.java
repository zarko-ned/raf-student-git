package rs.raf.dsw;

public class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Metod koji ćemo menjati u različitim granama
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Student student = new Student("Žarko", "Nedeljković");
        System.out.println(student.getFullName());
    }
}