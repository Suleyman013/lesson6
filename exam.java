public class exam {
    private student student;
    private Course course;
    private int score;
    public exam(student student, Course course, int score) {
        this.student = student;
        this.course = course;
        this.score = score;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return student.name+ " " + course.getCourseName() + " " + score;
    }
}
