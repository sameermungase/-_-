# Grade Tracker System

This is a simple Grade Tracker System developed in Java. It allows a user (teacher or student) to input grades for multiple subjects, and then calculates and displays the average, highest, and lowest grades. Additionally, it provides a grade based on the average percentage.

## Features

- Input the number of subjects for a student.
- Enter grades for each subject.
- Calculate and display the average grade.
- Calculate and display the highest and lowest grades.
- Determine and display the student's final grade based on the average percentage.

## Getting Started

### Running the Program

1. Clone the repository or download the source code.
2. Open the project in your preferred IDE.
3. Compile and run the `gradeTracker.java` file.

## Code Explanation

The main logic of the Grade Tracker System is implemented in the `gradeTracker.java` file.

1. **Input Handling**:
   - The program first prompts the user to enter the number of subjects.
   - It then collects grades for each subject and stores them in an `ArrayList` named `marks`.

2. **Calculations**:
   - The program calculates the sum, highest, and lowest grades from the list of grades.
   - It then calculates the average grade and converts it into an integer percentage to determine the final grade.

3. **Grade Determination**:
   - Based on the average percentage, the program assigns a grade:
     - `A+` for 90% and above.
     - `A` for 80% to 89%.
     - `B+` for 70% to 79%.
     - `B` for 50% to 69%.
     - `F` for below 50%.

## Contributing

If you want to contribute to this project, please fork the repository and create a pull request with your changes. Contributions, issues, and feature requests are welcome.


## Acknowledgments

- Special thanks to Code Alpha for the task and opportunity.
- Thanks to the Java and open-source community for providing valuable resources and tools.


