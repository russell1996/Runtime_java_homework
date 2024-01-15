package Projects.edo;

import java.time.LocalTime;
import java.util.Random;

public class Document {
    private int id;
    private String documentType;

    private Random random = new Random();
    private int hour = random.nextInt(23);
    private int minute = random.nextInt(60);
    private int second = random.nextInt(60);
    private LocalTime created = LocalTime.of(hour, minute, second);
    private LocalTime updated = created;

    Document(int id, String documentType) {
        this.id = id;
        this.documentType = documentType;
    }

    public int getId() {
        return id;
    }

    public LocalTime getCreated() {
        return created;
    }

    public LocalTime getUpdated() {
        return updated;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getDocumentInfo() {
        return "Document ID: " + getId() +
                "\nDocument Type ID: " + getDocumentType() +
                "\nCreated at: " + getCreated() +
                "\nLast Updated at: " + getUpdated();
    }

}