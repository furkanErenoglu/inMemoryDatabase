import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    List<Instructor> instructors = new ArrayList<>();

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
        System.out.println("Instructor created: " + instructor.getFullName());
    }


    public void instructorSearch(String id) {
        for (Instructor i : instructors) {
            if (i.getId().equals(id)) {
                System.out.println("Instructor: "+i.getFullName());
            }
        }

    }


}

