import java.util.ArrayList;
import java.util.Scanner;

public class gradeTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();

        ArrayList<Double> grades = new ArrayList<>();
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the grades for student " + (i + 1) + ":");
            double grade = scanner.nextDouble();
            grades.add(grade);
        }

        double sum = 0;
        double highest = grades.get(0);
        double lowest = grades.get(0);

        for (double grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = sum / grades.size();

        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }
}