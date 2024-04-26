import java.util.Scanner;

public class InputGrades {
    public static void main(String[] args) {
        // Write an application that prompts a professor to enter grades for five different courses
        // each for 10 students. Prompt the professor to enter data for one student at a time,
        // including student ID and course data for five courses. Use prompts containing the number
        // of the student whose data is being entered and the course number--for example, Enter ID
        // for student #1, and Enter course ID #5. Verify that the professor enters only A, B, C, D,
        // or F for the grade value for each course. Save the file as InputGrades.java

        Scanner input = new Scanner(System.in);
        Student[] students = new Student[10];
        String info;
        char grade = 'E';


        for (int i = 0; i < students.length; i++) {
            int j = 0;
            Student student = new Student();
            System.out.println();
            System.out.println("Enter data for Student #" + (i + 1));
            System.out.println("*************************");
            System.out.print("Enter Student ID #: ");
            int studentId = input.nextInt();
            student.setIdNumber(studentId);
            input.nextLine();

            while (j < 5) {
                System.out.println();
                System.out.print("Enter Course ID: ");
                String courseId = input.nextLine();

                System.out.print("Enter Credit hours: ");
                int creditHours = input.nextInt();
                input.nextLine();

                // Verify student grade
                boolean gradeVerified = false;
                while (!gradeVerified) {
                    System.out.print("Enter letter grade: ");
                    String letterGrade = input.nextLine().toUpperCase();
                    if (letterGrade.equals("A")) {
                        grade = 'A';
                        gradeVerified = true;
                    } else if (letterGrade.equals("B")) {
                        grade = 'B';
                        gradeVerified = true;
                    } else if (letterGrade.equals("C")) {
                        grade = 'C';
                        gradeVerified = true;
                    } else if (letterGrade.equals("D")) {
                        grade = 'D';
                        gradeVerified = true;
                    } else if (letterGrade.equals("F")) {
                        grade = 'F';
                        gradeVerified = true;
                    } else if (letterGrade.equals("E")) {
                        continue;
                    } else {
                        System.out.println("Not a valid grade");
                    }
                }
                CollegeCourse temp = new CollegeCourse();
                temp.setCourseId(courseId);
                temp.setCreditHours(creditHours);
                temp.setLetterGrade(grade);
                student.setCollegeCourses(temp, j);
                j++;
            }
            students[i] = student;
        }
        for (int a = 0; a < students.length; a++) {
            System.out.println();
            info = "Student #" + (a + 1) + " ID #" + students[a].getIdNumber();
            for (int b = 0; b < 5; b++) {
                CollegeCourse temp = new CollegeCourse();
                temp = students[a].getCollegeCourses(b);
                info = info + "\n" + temp.getCourseId() + " " + temp.getCreditHours() +
                        " credits. Grade is " + temp.getLetterGrade();
            }
            System.out.println(info);
        }

    }
}
