import java.util.Scanner;
public class Firstdig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int Firstdig = num/10;
        System.out.println("Firstdig is "+Firstdig);
    }

    
}
