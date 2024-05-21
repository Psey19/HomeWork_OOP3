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
        Stream stream1 = new Stream("Stream №1");
        stream1.addStudentGroupInStream(studentGroup2);
        stream1.addStudentGroupInStream(studentGroup4);
        stream1.addStudentGroupInStream(studentGroup4);
        stream1.addStudentGroupInStream(studentGroup4);

        //Выводим содержимое 1 потока
        printStream(stream1);

        //Создаём 2 поток
        Stream stream2 = new Stream("Stream №2");
        stream2.addStudentGroupInStream(studentGroup1);
        stream2.addStudentGroupInStream(studentGroup3);
        stream2.addStudentGroupInStream(studentGroup5);

        //Выводим содержимое 2 потока
        printStream(stream2);

        //Создаём 3 поток
        Stream stream3 = new Stream("Stream №3");
        stream3.addStudentGroupInStream(studentGroup4);
        stream3.addStudentGroupInStream(studentGroup4);
        stream3.addStudentGroupInStream(studentGroup1);
        stream3.addStudentGroupInStream(studentGroup2);
        stream3.addStudentGroupInStream(studentGroup5);

        //Выводим содержимое 3 потока
        printStream(stream3);

        //Создаём Список потоков и выводим его
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        System.out.println("Список потоков:");
        printListOfStreams(streams);

        //Сортируем Список потоков и выводим его
        StreamService streamService = new StreamService();
        streamService.getSortedStreams(streams);
        System.out.println("Отсортированный список потоков:");
        printListOfStreams(streams);

    }
    //Метод для вывода списка учебных групп в потоке
    static void printStream(Stream stream){
        System.out.println(stream.getStreamName());
        for(StudentGroup studentGroup: stream){
            System.out.println(studentGroup);
        }
        System.out.println("--------------------------");
    }
    //Метод для вывода потоков в списке потоков
    static void printListOfStreams(List<Stream> streams){
        for(Stream stream: streams){
            System.out.println(stream);
            System.out.printf("%s: %d\n", "Количество групп в потоке", stream.getStream().size());
        }
        System.out.println("--------------------------");
    }
}
