import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create school
        School school = new School("Springfield High");

        // Create departments
        Department science = new Department("Science");
        Department mathematics = new Department("Mathematics");

        // Add departments to school
        school.addDepartment(science);
        school.addDepartment(mathematics);

        // Create teachers
        Teacher teacher1 = new Teacher("Mr. Smith", "Biology");
        Teacher teacher2 = new Teacher("Mrs. Jones", "Chemistry");
        Teacher teacher3 = new Teacher("Mr. White", "Calculus");
        Teacher teacher4 = new Teacher("Ms. Black", "Algebra");

        // Create students
        Student student1 = new Student("John Doe", 10);
        Student student2 = new Student("Jane Doe", 12);
        Student student3 = new Student("Jim Beam", 11);
        Student student4 = new Student("Tim Cook", 10);
        Student student5 = new Student("Ann Taylor", 11);
        Student student6 = new Student("Gary Oak", 12);

        // Assign teachers to departments
        science.addTeacher(teacher1);
        science.addTeacher(teacher2);
        mathematics.addTeacher(teacher3);
        mathematics.addTeacher(teacher4);

        // Assign students to departments
        science.addStudent(student1);
        science.addStudent(student2);
        science.addStudent(student3);
        mathematics.addStudent(student4);
        mathematics.addStudent(student5);
        mathematics.addStudent(student6);

        // Print school details
        printSchoolDetails(school);

    }

    private static void printSchoolDetails(School school) {
        System.out.println("School: " + school.getName());
        System.out.println("Departments:");
        for (Department department : school.getDepartments()) {
            System.out.println(department.getName() + " Department");
            System.out.println(" - Teachers:");
            for (Teacher teacher : department.getTeachers()) {
                System.out.println("   - " + teacher.getName() + " (" + teacher.getSubject() + ")");
            }
            System.out.println(" - Students:");
            for (Student student : department.getStudents()) {
                System.out.println("   - " + student.getName() + " (Grade " + student.getGrade() + ")");
            }
            System.out.println();
        }
    }
}
