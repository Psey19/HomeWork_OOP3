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
        System.out.println(stream1.getStreamName());
        printListIterator(stream1);
        System.out.println("--------------------------");

        //Создаём 2 поток
        Stream stream2 = new Stream("Stream №2");
        stream2.addStudentGroupInStream(studentGroup1);
        stream2.addStudentGroupInStream(studentGroup3);
        stream2.addStudentGroupInStream(studentGroup5);

        //Выводим содержимое 2 потока
        System.out.println(stream2.getStreamName());
        printListIterator(stream2);
        System.out.println("--------------------------");

        //Создаём 3 поток
        Stream stream3 = new Stream("Stream №3");
        stream3.addStudentGroupInStream(studentGroup4);
        stream3.addStudentGroupInStream(studentGroup4);
        stream3.addStudentGroupInStream(studentGroup1);
        stream3.addStudentGroupInStream(studentGroup2);
        stream3.addStudentGroupInStream(studentGroup5);

        //Выводим содержимое 3 потока
        System.out.println(stream3.getStreamName());
        printListIterator(stream3);
        System.out.println("--------------------------");

        //Создаём Список потоков и выводим его
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        System.out.println("Список потоков:");
        printListIterator2(streams);
        System.out.println("--------------------------");

        //Сортируем Список потоков и выводим его
        StreamService streamService = new StreamService();
        streamService.getSortedStreams(streams);
        System.out.println("Отсортированный список потоков:");
        printListIterator2(streams);

    }
    //Метод для вывода списка учебных групп в потоке
    static void printListIterator(Stream stream){
        for(StudentGroup studentGroup: stream){
            System.out.println(studentGroup);
        }
    }
    //Метод для вывода потоков в списке потоков
    static void printListIterator2(List<Stream> streams){
        for(Stream stream: streams){
            System.out.println(stream);
            System.out.printf("%s: %d\n", "Количество групп в потоке", stream.getStream().size());
        }
    }
}
