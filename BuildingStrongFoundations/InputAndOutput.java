import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        
    
    double studentGPA = 3.45;
    String studentName = "Nanthachai Yuennan";

    System.out.println(studentName + " คะแนนน GPA " + studentGPA);
    System.out.println("คะแนนนปัจจุบันของคุณคืออะไร");

    Scanner input = new Scanner(System.in);
    studentGPA =input.nextDouble();

    System.out.println(studentName + " คะแนน GPA " + studentGPA);
    }
}
