import java.util.ArrayList;
import java.util.List;

public class StreamService {
    
    public List<Stream> getSortedStreams(List<Stream> streams) {
        streams.sort(new StreamComparator());
        return streams;
    }
}
