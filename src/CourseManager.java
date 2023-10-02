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
    Course course = new Course();

    List<Course> courses = new ArrayList<>();



    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course created: " + course.getCode());
    }
    //List<Student> studentList = new ArrayList<>();
    public void joinCourse(String id, String code) {
        for (Course c : courses) {
            if (c.getCode().equals(code) && c.getCapacity() > 0) {
                for (Student st : studentManager.students) {
                    if (st.getId().equals(id)) {
                        c.getStudents().add(st);
                        c.setCapacity(c.getCapacity() - 1);
                        System.out.println("joined successfully, quota is " + c.getCapacity());
                        System.out.println("students: " + c.getStudents());
                        return;
                    }
                }
            }
        }
        System.out.println("Course or student not found, or quota is full");
    }

    public void addInstructor(String id, String classCode) {
        for (Instructor i : instructorManager.instructors) {
            for (Course c2 : courses) {
                if ((c2.getCode().equals(classCode)) && (i.getId().equals(id))) {
                    course.setTeacher(i);
                    System.out.println("Instructor added completed: ");
                }
            }


        }
    }

}




