
import java.util.Scanner;

/*
 * Simple program used to calculate the average of several inputs
 * Used to demonstrate a while loop
 * From Java How To Program, 10/e, Chapter 4
 */

public class ClassAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        int counter = 0;

        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();
            
        while (grade !=  -1) {
            total += grade;
            counter++;
            
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }
        
        if(counter !=0){
            double average = (double) total / counter;  //Convert total to a double before performing division
            System.out.printf("%nTotal of all %d grades is %d%n", counter, total);
            System.out.printf("Class average is %.2f%n", average);
        } else {
            System.out.println("No grades were entered.");
        }
               
    }    
}//End ClassAverage
