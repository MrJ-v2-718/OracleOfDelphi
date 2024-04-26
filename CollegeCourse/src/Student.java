public class Student {
    // Create a Student class containing an ID number and an array of five CollegeCourse objects.
    // Create a get and set method for the Student ID number. Also create a get method that returns
    // one of the Studnent's CollegeCourses; the method takes an integer argument and returns the
    // CollegeCourse in that position (0 through 4). Next, create a set method that sets the value
    // of one of the Student's CollegeCourse objects; the method takes two arguments--a CollegeCourse
    // and an integer representing the CollegeCourse's position (0 through 4).
    // Save the file as Student.java

    private int idNumber;
    CollegeCourse[] collegeCourses = new CollegeCourse[5];

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public CollegeCourse getCollegeCourses(int courseIndex) {
        return collegeCourses[courseIndex];
    }

    public void setCollegeCourses(CollegeCourse collegeCourse, int courseIndex) {
        this.collegeCourses[courseIndex] = collegeCourse;
    }
}
