import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private List<StudentGroup> stream;

    public Stream() {
        stream = new ArrayList<>();
    }

    public List<StudentGroup> getStream() {
        return stream;
    }

    public void addStudentGroupInStream(StudentGroup studentGroup){
        stream.add(studentGroup);
    }


    @Override
    public String toString() {
        return "Stream: " + stream;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return stream.iterator();

    }

}
