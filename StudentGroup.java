public class StudentGroup {
    private String studentGroupName;

    public StudentGroup(String studentGroupName) {
        this.studentGroupName = studentGroupName;
    }

    public String getStudentGroupName() {
        return studentGroupName;
    }

    @Override
    public String toString() {
        return studentGroupName;
    }
}
