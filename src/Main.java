// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();
        CourseManager courseManager = new CourseManager(studentManager, instructorManager );


        Student student1 =new Student();
        student1.setFullName("Furkan Erenoglu");
        student1.setAge(24);
        student1.setId("544376659");
        student1.setDepartment("Math");
        student1.setFaculty("Science");
        student1.setPassword("kfjgsdkgsl56");
        student1.setLesson(course1.getName());

        Student student2 =new Student();
        student2.setFullName("Begüm Erenoglu");
        student2.setAge(24);
        student2.setId("544376456");
        student2.setDepartment("Math");
        student2.setFaculty("Science");
        student2.setPassword("kffasasgsl56");

        Student student3 =new Student();
        student3.setFullName("Fatih Kuscu");
        student3.setAge(24);
        student3.setId("544375458");
        student3.setDepartment("Math");
        student3.setFaculty("Science");
        student3.setPassword("kffşdkfs489");

        Student student4 =new Student();
        student4.setFullName("Emre Kuscu");
        student4.setAge(24);
        student4.setId("544375441");
        student4.setDepartment("Math");
        student4.setFaculty("Science");
        student4.setPassword("kffasasgsl56");

        Student student5 =new Student();
        student5.setFullName("Yunus Kuscu");
        student5.setAge(24);
        student5.setId("544376654");
        student5.setDepartment("Math");
        student5.setFaculty("Science");
        student5.setPassword("kffasasgsl56");



        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);
        studentManager.addStudent(student5);
        System.out.println(studentManager.students.get(0).getFullName());

        Instructor instructor1 = new Instructor();
        instructor1.setFullName("Nilüfer Özdemir");
        instructor1.setId("1234567890");
        instructor1.setPassword("dsfkslkfsdf53");
        instructor1.setDepartment("Math");

        instructorManager.addInstructor(instructor1);


        course1.setName("Topoloji");
        course1.setCode("MAT216");
        course1.setCapacity(80);
        course1.setSituation("compulsory");


        Course course2 = new Course();
        course2.setName("Linear Algebra");
        course2.setCode("MAT320");
        course2.setCapacity(80);
        course2.setSituation("compulsory");

        courseManager.addCourse(course1);
        courseManager.addCourse(course2);



        courseManager.joinCourse("544376654","MAT216");
        courseManager.joinCourse("544376659","MAT216");
        courseManager.joinCourse("544376659","MAT320");
        courseManager.joinCourse("544376456","MAT320");
        studentManager.studentSearch("544376654");

        instructorManager.instructorSearch("1234567890");
        courseManager.addInstructor("1234567890","MAT216");
    }
}