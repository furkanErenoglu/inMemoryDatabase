import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    //Dependency Injection

    private StudentManager studentManager;
    private InstructorManager instructorManager;

    public CourseManager(StudentManager studentManager, InstructorManager instructorManager) {
        this.studentManager = studentManager;
        this.instructorManager = instructorManager;
    }

    private List<Course> courses = new ArrayList<>();



    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course created: " + course.getCode());
    }

    public void joinCourse(Student student, String code) {
        for (Course c : courses) {
            if (c.getCode().equals(code) && c.getCapacity() > 0) {
                for (Student st : studentManager.getStudents()) {
                    if (st.getId().equals(student.getId())) {
                        c.getStudents().add(st);
                        c.setCapacity(c.getCapacity() - 1);
                        System.out.println("joined successfully, quota is " + c.getCapacity());
                        System.out.println("students: " + c.getStudents());
                    }
                }
            }
        }

    }

    public void addInstructor(Instructor instructor, String classCode) {
            for (Course c2 : courses) {
                if ((c2.getCode().equals(classCode)) && (instructor.getId().equals(instructor.getId()))) {
                    c2.setTeacher(instructor);
                    System.out.println("Instructor added completed: ");
                }
            }


    }

}




