import java.util.*;
public class student extends Human {

    private List<Course> courses = new ArrayList<>();
    public student(String name, String surname, int age, String gender, String phonenumber) {
        super(name, surname, age, gender, phonenumber);
    }

    @Override
    public String toString() {
        return name + " " + surname + ", Age: " + age + ", Gender: " + gender + ", Phone: " + phonenumber;
    }
    public void addCourse(Course course) {
        courses.add(course);
    }
    public void removeCourse(Course course) {
        courses.remove(course);
    }
    public List<Course> getCourses() {
        return courses;
    }
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
