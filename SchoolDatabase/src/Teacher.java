//teacher class is defined to have a full name and subject for each respective teacher
public class Teacher {
    //fields are made for name and subject that student teaches
    public String firstName;
    public String lastName;
    public String subject;

    //constructor that defines a teacher's full name and the subject they teach
    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    //return statement to ensure that all the different components of a teacher (name and subject) are returned
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nSubject: " + subject + "\n";
    }
}

//Sources:
//https://www.geeksforgeeks.org/string-tostring-method-in-java/
//https://stackoverflow.com/questions/60013219/java-tostring-how-to-return-string-message-in-place-of-null