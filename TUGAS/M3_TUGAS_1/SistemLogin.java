import java.util.Scanner;

class User {
    private String name; //encapsulation. private sebagai super keyword 
    private String nim;

    public User (String name, String nim) { // constructor untuk mengisi nilai awal/ menginisialisasi objek yang baru dibuat
        this.name = name;
        this.nim = nim;
    }

    //getter & setter name 
    public void setName (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //getter & setter nim
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return nim;
    }

    public void login(Scanner scanner){
    //kosong supaya bisa di override aja ^^
    }

    public void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Student ID  : " + nim);
    }
}

public class Admin extends User { //extends sebagai tanda inheritance atau pewarisan
   private String ValidUsername = "Admin" ;
   private String ValidPassword = "354354";

    public Admin(String name, String nim){
        super (name, nim); //untuk memanggil construktor superclass User
    }

    @Override //untuk mereplikasi body method utama yang ada di class parent. 
    public void login(Scanner scanner){
        System.out.print("Input Username : ");
        String inputValidUsername = scanner.nextLine();
        System.out.print("Input Password : ");
        String inputValidPassword = scanner.nextLine();

        if (inputValidUsername.equals(ValidUsername) && inputValidPassword.equals(ValidPassword)){
            System.out.println("Login is successful!");
        } else {
            System.out.println("Login is failed! Invalid Username or Password");
        }
    }

    @Override
    public void displayInfo(){
        System.out.println("Login is successful!");
        super.displayInfo();
    }
} 

class Student extends User {
       public Student (String name, String nim){
        super(name, nim); //untuk memanggil construktor superclass User
       }

       @Override
       public void login(Scanner scanner) {
        System.out.print("Input your name : ");
        String inputName = scanner.nextLine();
        System.out.print("Input your Student id : ");
        String inputNim = scanner.nextLine();

        if (inputName.equals(getName()) && inputNim.equals(getNim())){
            System.out.println("Login is succesfull!");
            displayInfo();
        } else {
            System.out.println("Login is failed! invalid Name or Student ID.");
        }
       }
    }

public class SistemLogin {
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
            Admin admin1 = new Admin("Admin", "354354"); //objek  instance
            admin1.login(scanner);
            break; 
            
            case 2: 
            Student student1 = new Student("Karina Putri", "354");
            student1.login(scanner);
            break;
            
            default : 
            System.out.println ("invalid option");
            break;
            } 
            scanner.close();
        } 
    }
