import java.util.Scanner;

class Admin { 
    String ValidUsername = "Admin" ;
    String ValidPassword = "354354";

    public void login (Scanner scanner){
        System.out.print("Input Username : ");
        String inputUsername = scanner.nextLine();
        System.out.print("Input Password : ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(ValidUsername) && inputPassword.equals(ValidPassword)){
            System.out.println("login is succesful!"); //untuk mengecek apakah sudah benar atau belum 
         } else {
                System.out.println("login is failed! invalid Username or Password. ");
            }
        }
    }

class Student {
        String ValidName = "Karina Putri" ; 
        String StudentID = "354";

        public void login(String InputvalidName, String InputstudentID){
            if(InputvalidName.equals(ValidName) && InputstudentID.equals(StudentID)){
                System.out.println("login succesful!");
                System.out.println("Username : "+ ValidName);
                System.out.println("Student ID : "+ StudentID);
            } else {
                System.out.println("Login is failed! invalid Username or Student ID.");
            }
        }
    }

public class LoginSystemClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("==LOGIN OPTIONS==");
        System.out.println("1. Admin");
        System.out.println("2. Student");
        System.out.print("Select an option  (1/2) : ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:  
            Admin admin = new Admin();
            admin.login(scanner);
            break;

            case 2: 
            System.out.print("Enter your name : ");
            String name = scanner.nextLine();
            System.out.print("Enter your student ID : ");
            String studentID = scanner.nextLine();

            Student student = new Student();
            student.login(name, studentID);
            break;

            default : 
            System.out.println ("invalid option");
        } 
    
        scanner.close();
    }
}
    

