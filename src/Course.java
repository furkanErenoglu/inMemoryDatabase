import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String code;
    private Instructor teacher;
    private int capacity;
    private String situation;
    private List<Student> students;

    public Course() {
        this.students = new ArrayList<>(); // Öğrenci listesini başlattım
    }


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Instructor getTeacher() {
        return teacher;
    }

    public void setTeacher(Instructor teacher) {
        this.teacher = teacher;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }


}

