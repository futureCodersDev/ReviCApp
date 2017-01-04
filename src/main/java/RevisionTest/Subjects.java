package RevisionTest;

public class Subjects {

    private final long id;
    private final String content;

    public Subjects(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}