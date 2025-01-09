//the class Student is defined to have a first and last name, grade, student number
//idCounter is used for generating unique ids for each respective student
public class Student {
    //fields are made for name, grade, and student number of a student
    public String firstName;
    public String lastName;
    public int grade;
    public int studentNumber;
    public static int idCounter = 1;

    //construct an individual student's information and assigns them a random student number
    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = idCounter++;
    }

    //return statement to ensure that all the different components of a student (grade, name, etc.) are returned
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nGrade " + grade + "\nStudent Number: " + studentNumber + "\n";
    }
}
//Sources:
//https://gist.github.com/icella/d4011b6808fc549c538c0310528d9e94
//https://www.geeksforgeeks.org/string-tostring-method-in-java/
//https://stackoverflow.com/questions/60013219/java-tostring-how-to-return-string-message-in-place-of-null