public class teacher extends Human implements Teachable {
   private String subject;
    public teacher(String name, String surname, int age, String gender, String phonenumber, String subject) {
        super(name, surname, age, gender, phonenumber);
        this.subject = subject;

    }


    @Override
    public String toString() {
      return name + " " + surname + ", Age: " + age + ", Gender: " + gender + ", Phone: " + phonenumber + "\n Subject: " + subject;
    }
    @Override
    public void teach(Course course) {
        System.out.println( name + "is teaching " + course.getCourseName());
    }
    }




