public class Main {
    public static void main(String[] args) {
        //Creating school using the school class
        School school = new School("Rockridge Secondary", "5350 Headland Drive", "Mr. Kolkea");

        //adding teachers using the class "Teacher"
        Teacher n1 = new Teacher("Bruce", "Wayne", "Math");
        Teacher n2 = new Teacher("Harry", "Potter", "Science");
        Teacher n3 = new Teacher("Kent", "Clark", "French");
        school.addT(n1);
        school.addT(n2);
        school.addT(n3);

        //adding students using the class "student"
        school.addS(new Student("Sara", "Moose", 1));
        school.addS(new Student("Niki", "Grape", 3));
        school.addS(new Student("Hafez", "Orange", 5));
        school.addS(new Student("Nima", "Mandarin", 10));
        school.addS(new Student("Farzad", "Peach", 12));
        school.addS(new Student("Navid", "Apple", 8));
        school.addS(new Student("Parisa", "Watermelon", 9));
        school.addS(new Student("Farad", "Banana", 10));
        school.addS(new Student("Omid", "Cucumber", 7));
        school.addS(new Student("Amir", "Pomegranate", 2));

        //display both lists
        school.showTeachers();
        school.showStudents();

        // Removing 1 teacher and 2 students
        school.removeT(n2);
        school.removeS(school.students.get(0));
        school.removeS(school.students.get(1));

        //display both lists
        school.showTeachers();
        school.showStudents();
    }
}
