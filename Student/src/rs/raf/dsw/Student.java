package rs.raf.dsw;

public class Student {
    private String firstName;
    private String lastName;
    private String address;

    public Student(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Metod koji ćemo menjati u različitim granama
    public String getFullName() {
        return firstName + ", " + lastName;
    }

    public static void main(String[] args) {
        Student student = new Student("Žarko", "Nedeljković", "Knez");
        System.out.println(student.getFullName());
    }
}