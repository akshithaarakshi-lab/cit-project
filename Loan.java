import java.util.Scanner;
public class Loan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age of the person: ");
        int age=sc.nextInt();
        
        System.out.println("Enter salary of person");
        int sal=sc.nextInt();

        if(age>=21 && sal>=21000)
            System.out.println("person is eligible for getting loan");
        else
            System.out.println("person is not eligible for getting loan");
   
    }
  

    
}
