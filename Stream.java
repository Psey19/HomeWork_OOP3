import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private List<StudentGroup> stream;
    private String streamName;

    public Stream(String streamName) {
        this.streamName = streamName;
        stream = new ArrayList<>();
    }

    public List<StudentGroup> getStream() {
        return stream;
    }
    
    public String getStreamName() {
        return streamName;
    }

    public void addStudentGroupInStream(StudentGroup studentGroup){
        stream.add(studentGroup);
    }


    @Override
    public String toString() {
        return streamName + ": " + stream;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return stream.iterator();
    }
}
