import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[]args){
        // create scanner instance to read from command line
        Scanner scanner = new Scanner(System.in);
        // init total amount of tests to grade
        int totalTests = 10;
        
        // sum of all grades
        double sum = 0.0;
        double avg;
        double min=100;
        double max=0;

        // init grade variable
        double grade;

        System.out.println("Grade Calculator");
        System.out.println("Please enter " + totalTests + " to final class average");

        // init for loop to loop through user inputs
        for( int i = 1; i <= totalTests; i++){
            System.out.println("Please enter grade for test #" + i);
            if(scanner.hasNextDouble()){
                grade = scanner.nextDouble();

                if(grade > 100.0 || grade <0){
                    System.out.println("Invalid test score");
                    break;
                }
                if(grade >= max ){
                    max = grade;
                }
                if(grade <= min){
                    min = grade;
                }
                sum += grade;

                
            }else {
                System.out.println("Invalid grade");
                scanner.next();
            }

        }
        
        avg = sum / totalTests;

        System.out.println("\n Grade Statistics");
        System.out.println("The average for the test scores are: " + avg);
        System.out.println("The lowest grade is: " + min);
        System.out.println("The highest grade is: " + max);



        scanner.close();

    }
}