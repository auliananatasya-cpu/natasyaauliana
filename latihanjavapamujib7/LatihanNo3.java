import java.util.Date;

public class LatihanNo3 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa(
            "Rina", "Ayu", "Putri", new Date(),
            "202600123", "Ilmu Komputer", "Sarjana", 2030
        );

        String[] nilai = {"A", "B+", "A-", "B"};
        double ip = mhs.calculateGPA(nilai);

        System.out.println("Nama: " + mhs.getName());
        System.out.println("NIM: " + mhs.getStudentId());
        System.out.println("Gelar: " + mhs.getDegree());
        System.out.println("Tahun Lulus: " + mhs.getExpectedGraduationYear());
        System.out.println("Jurusan Awal: " + mhs.getMajor());

        mhs.changeMajor("Matematika");
        System.out.println("Jurusan Baru: " + mhs.getMajor());
        System.out.printf("IP: %.2f%n", ip);
    }
}

class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;

    public Person(String firstName, String middleName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}

class Mahasiswa extends Person {
    private String studentId;
    private double gpa;
    private String major;
    private String degree;
    private int expectedGraduationYear;

    public Mahasiswa(String firstName, String middleName, String lastName, Date dateOfBirth,
                     String studentId, String major, String degree, int expectedGraduationYear) {
        super(firstName, middleName, lastName, dateOfBirth);
        this.studentId = studentId;
        this.major = major;
        this.degree = degree;
        this.expectedGraduationYear = expectedGraduationYear;
        this.gpa = 0.0;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public String getDegree() {
        return degree;
    }

    public int getExpectedGraduationYear() {
        return expectedGraduationYear;
    }

    public void changeMajor(String newMajor) {
        if (newMajor != null && !newMajor.trim().isEmpty()) {
            this.major = newMajor;
        }
    }

    private double convertGradeToPoint(String grade) {
        if (grade == null) {
            return 0.0;
        }
        switch (grade.trim().toUpperCase()) {
            case "A":
                return 4.0;
            case "A-":
                return 3.67;
            case "B+":
                return 3.33;
            case "B":
                return 3.0;
            case "B-":
                return 2.67;
            case "C+":
                return 2.33;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                throw new IllegalArgumentException("Nilai tidak valid: " + grade);
        }
    }

    public double calculateGPA(String[] grades) {
        if (grades == null || grades.length == 0) {
            this.gpa = 0.0;
            return this.gpa;
        }

        double totalPoints = 0.0;
        for (String grade : grades) {
            totalPoints += convertGradeToPoint(grade);
        }

        this.gpa = totalPoints / grades.length;
        return this.gpa;
    }
}