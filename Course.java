public class Course {
    private String courseName;
    private String courseCode;
    private teacher teacher;
    public Course(String courseName, String courseCode,teacher teacher) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.teacher = teacher;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(teacher teacher) {
        this.teacher = teacher;


    }
    @Override
    public String toString() {
        return "Course [courseName=" + courseName + ", courseCode=" + courseCode + ", teacher=" + teacher + "]";
    }
}
