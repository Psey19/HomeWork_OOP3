public class StudentGroup {
    private String studentGroup;

    public StudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "studentGroup='" + studentGroup + '\'' +
                '}';
    }
}
