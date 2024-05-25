
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentId;
    private String courses = "";
    private  int tuitionBalance = 0;
    private static  int costOfCourses = 600;
    private static  int id = 1001;

    //Constructor: prompt user to enter student's name and year 
    public Student(){
        Scanner in = new Scanner(System.in); 
        System.out.println("enter student first name");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name");
        this.lastName = in.nextLine();

        System.out.println(" 1 - Freshman, \n 2 - Sophomore, \n 3 - Junior, \n 4 - Senior \n Enter student class level");
        this.gradeYear = in.nextLine();

        setStudentID();
    }


    private String setStudentID(){
        id++;
        this.studentId =  gradeYear + " " + id;
        return studentId;
    }

    public void enroll(){
        do{
        System.out.print("Enter course a enroll (Q to quit): ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
        if (!course.equals("Q")) {
                courses += "\n" + course;
                tuitionBalance += costOfCourses;
        }else{
            break;
        }
    } while (1 != 0);
    }

    public void ViewBalance(){
        System.out.println("Your balance is $" + tuitionBalance);
    }

    public void payTuition(){
        System.out.println("Enter your payment");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for paying $" + payment);
        ViewBalance();
    }

    //show status
    public String showInfo(){

        return "Name :" + firstName + " " + lastName + "\n Grade level " + gradeYear +"\nStudent ID :" + studentId  + "\n Courses enrolled:" + courses + "\nbalance" + tuitionBalance;
    }

}
