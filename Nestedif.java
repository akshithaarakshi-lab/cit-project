import java.util.Scanner;
public class Nestedif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        if(age>=18){
            if(age>=65){
                System.out.println("Elegible to vote and avail government fund");
            }
            else
                System.out.println("we are eligible for vote and not eligible to avail government scheme");
        }else
            System.out.println("we are not eligible to vote and not eligible to avail government scheme");
    }
    
}
