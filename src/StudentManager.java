import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added with id: " + student.getId());
    }


    public void getStudentById(String id) {
        for(Student s:students){
            if (s.getId().equals(id)){
                System.out.println("Student: "+s.getFullName());
            }
        }
    }
}
