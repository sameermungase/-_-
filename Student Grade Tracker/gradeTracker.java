import java.util.ArrayList;
import java.util.Scanner;

public class gradeTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects of student : ");
        
        ArrayList<Double> marks = new ArrayList<>();
        int numSub = scanner.nextInt();
        for (int i = 0; i < numSub; i++) {
            System.out.print("Enter the grades for student in subject " + (i + 1) + ": ");
            double markspersub = scanner.nextDouble();
            marks.add(markspersub);
        }

        double sum = 0;
        double highest = marks.get(0);
        double lowest = marks.get(0);

        for (double totalM : marks) {
            sum += totalM;
            if (totalM > highest) {
                highest = totalM;
            }
            if (totalM < lowest) {
                lowest = totalM;
            }
        }
        String grade = "";
        int percentage = 0; 

        double average = sum / marks.size();
         percentage =(int)average  ;

        if (percentage >=90){
            grade ="A+";
        }else if (percentage >=80) {
            grade = "A";
        }else if (percentage >=70) {
            grade = "B+";
        }else if (percentage >50) {
            grade = "B";
        }else if (percentage <=50) {
            grade = "F";
        }

        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        System.out.println("Student grade : "+ grade );
    }
}