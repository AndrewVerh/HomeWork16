public class Person {

    protected String name;
    protected String surname;
    protected int tickets;


    protected Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public void setTickets() {
        if (tickets > 0) {
            this.tickets--;
        }
    }

    public int getTickets() {
        return tickets;
    }

    public String getName () {
        return name;
    }



}
