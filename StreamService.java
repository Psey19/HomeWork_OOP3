import java.util.ArrayList;
import java.util.List;

public class StreamService {
    public Stream streams;

    public StreamService() {
        this.streams = streams;
    }


    public List<Stream> getSortedStreams(List<Stream> streams) {
        streams.sort(new StreamComparator());
        return streams;
    }
}
