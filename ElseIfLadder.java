import java.util.Scanner;
public class ElseIfLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of stdu");
        int marks=sc.nextInt();
        System.out.println("marks of student is:"+marks);
        if(marks>=900)
            System.out.println("a grade:");
        else if(marks>=75)
            System.out.println("b grade");
        else
            System.out.println("fail");

    }
    
}
