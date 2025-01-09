//imports ArrayList for using to build our school, teacher, and student list
import java.util.ArrayList;

//school class is defined, with respective teachers and students in it
public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    public String name;
    public String address;
    public String principal;

    //construct the school (with name, address, and principal), and also construct two lists for teachers and students
    public School(String name, String address, String principal) {
        this.name = name;
        this.address = address;
        this.principal = principal;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    //method to add teacher to the list
    public void addT(Teacher teacher) {
        teachers.add(teacher);
    }

    //method to add student to the list
    public void addS(Student student) {
        students.add(student);
    }

    //method to remove teacher from the list of teachers
    public void removeT(Teacher teacher) {
        teachers.remove(teacher);
    }

    //method to remove student from the list of students
    public void removeS(Student student) {
        students.remove(student);
    }

    //show all teachers in array "teachers"
    public void showTeachers() {
        System.out.println("All teachers:");
        for (Teacher teacher: teachers) {
            System.out.println(teacher);
        }
    }

    //show all students in array "students"
    public void showStudents() {
        System.out.println("All students:");
        for (Student student: students) {
            System.out.println(student);
        }
    }
}

//Sources:
//https://www.quora.com/How-do-you-print-all-the-values-of-an-array-in-Python