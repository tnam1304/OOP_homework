package week5.bai5_2bonus;

public class Ticket {
    protected String id;
    protected String content;
    protected long timestamp;

    public Ticket(String id, String content, long timestamp) {
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
    }
}