
import java.util.Scanner;

public class StudentDatabase {

    public static void main(String[] args) {

        //Ask how many new users we want ot add
        System.out.println("How many student you wanna add ?");
        Scanner in = new Scanner(System.in);  
        int numsOfStudents = in.nextInt();
        Student[] students = new Student[numsOfStudents];

        //Create n number of new  students
        for (int i = 0; i < numsOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        for (int i = 0; i < numsOfStudents; i++) {
            System.out.println(students[i].toString());
        }
    }
}