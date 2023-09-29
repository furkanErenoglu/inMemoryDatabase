import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    List<Student> students = new ArrayList<>();


    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added with id: " + student.getId());
    }


    public void studentSearch(String id) {
        for(Student s:students){
            if (s.getId().equals(id)){
                System.out.println("Student: "+s.getFullName());
            }
        }
    }
}
