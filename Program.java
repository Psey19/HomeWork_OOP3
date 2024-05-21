import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        //Создаём учебные группы
        StudentGroup studentGroup1 = new StudentGroup("Programmer");
        StudentGroup studentGroup2 = new StudentGroup("Tester");
        StudentGroup studentGroup3 = new StudentGroup("Analyst");
        StudentGroup studentGroup4 = new StudentGroup("Product manager");
        StudentGroup studentGroup5 = new StudentGroup("Project manager");

        //Создаём 1 поток
        Stream stream1 = new Stream();
        stream1.addStudentGroupInStream(studentGroup2);
        stream1.addStudentGroupInStream(studentGroup4);
        stream1.addStudentGroupInStream(studentGroup4);
        stream1.addStudentGroupInStream(studentGroup4);

        //Выводим содержимое 1 потока и его размер
        printListIterator(stream1);
        System.out.println(stream1.getStream().size());
        System.out.println("--------------------------");

        //Создаём 2 поток
        Stream stream2 = new Stream();
        stream2.addStudentGroupInStream(studentGroup1);
        stream2.addStudentGroupInStream(studentGroup3);
        stream2.addStudentGroupInStream(studentGroup5);

        //Выводим содержимое 2 потока и его размер
        printListIterator(stream2);
        System.out.println(stream2.getStream().size());
        System.out.println("--------------------------");

        //Создаём 3 поток
        Stream stream3 = new Stream();
        stream3.addStudentGroupInStream(studentGroup4);
        stream3.addStudentGroupInStream(studentGroup4);
        stream3.addStudentGroupInStream(studentGroup1);
        stream3.addStudentGroupInStream(studentGroup2);
        stream3.addStudentGroupInStream(studentGroup5);

        //Выводим содержимое 3 потока и его размер
        printListIterator(stream3);
        System.out.println(stream3.getStream().size());
        System.out.println("--------------------------");

        //Создаём Список потоков и выводим его
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        printListIterator2(streams);
        System.out.println("--------------------------");

        //Сортируем Список потоков и выводим его
        StreamService streamService = new StreamService();
        streamService.getSortedStreams(streams);
        printListIterator2(streams);

    }
    static void printListIterator(Stream stream){
        for(StudentGroup studentGroup: stream){
            System.out.println(studentGroup);
        }
    }
    static void printListIterator2(List<Stream> streams){
        for(Stream stream: streams){
            System.out.println(stream);
        }
    }
}
