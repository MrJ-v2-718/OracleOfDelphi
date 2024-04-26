public class CollegeCourse {
    // Create a CollegeCourse class. The class contains fields for the course ID
    // (Ex. CIS 210), credit hours (Ex. 3), and a letter grade (Ex. A). Include
    // get and set methods for each field. Save the file as CollegeCourse.java

    private String courseId;
    private int creditHours;
    private char letterGrade;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(char letterGrade) {
        this.letterGrade = letterGrade;
    }
}
