import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {


        Queue<Person> queueAttraction = new LinkedList<>(generateClients());
        while (!queueAttraction.isEmpty()) {

            Person s = queueAttraction.poll();
            System.out.println(s.getName() + " прокатился на аттракционе");
            s.setTickets();

            if (s.getTickets() > 0) {
                queueAttraction.offer(s);
            }
        }
    }

    private static List<Person> generateClients() {
        Person fedya = new Person("Федя", "Сумкин", 5);
        Person senya = new Person("Сеня", "Ганжа", 1);
        Person agronom = new Person("Агроном", "Бомж", 2);
        Person logovaz = new Person("Логоваз", "Эльф", 3);
        Person pendal = new Person("Пендальф", "Серый", 4);
        return List.of(fedya, senya, agronom, logovaz, pendal);
    }
}
