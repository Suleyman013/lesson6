import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<student> students = new ArrayList<>();
            List<teacher> teachers = new ArrayList<>();
            List<Course> courses = new ArrayList<>();
            List<exam> exams = new ArrayList<>();
            teacher t1 = new teacher("Dashqin", "Mammadov", 34, "Male", "0502111332", "Math");
            teacher t2 = new teacher("Elnur", "Dashdemirov", 40, "Male", "0102030405", "Physics");
            teachers.add(t1);
            teachers.add(t2);
            Course c1 = new Course("Math Course", "C1", t1);
            Course c2 = new Course("Physics Course", "C2", t2);
            courses.add(c1);
            courses.add(c2);
            student s1 = new student("Elvin", "Huseynov", 20, "Male", "0501234567");
            student s2 = new student("Nigar", "Memmedova", 22, "Female", "0512345678");
            student s3 = new student("Reshad", "Quliyev", 21, "Male", "0559876543");
            student s4 = new student("Aysel", "Eliyeva", 23, "Female", "0701122334");
            student s5 = new student("Tunar", "İsmayılov", 19, "Male", "0774455667");
            students.addAll(Arrays.asList(s1, s2, s3, s4, s5));
            for (student s : students) {
                exams.add(new exam(s, c1, new Random().nextInt(101))); // 0-100 arası bal
                exams.add(new exam(s, c2, new Random().nextInt(101)));
            }
            System.out.println("=== Students ===");
            for (student s : students) {
                System.out.println(s);
            }
            System.out.println("\n=== Teachers ===");
            for (teacher t : teachers) {
                System.out.println(t);
            }
            System.out.println("\n=== Courses ===");
            for (Course c : courses) {
                System.out.println(c);
            }
            System.out.println("\n=== Exam Results ===");
            for (exam e : exams) {
                System.out.println(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
