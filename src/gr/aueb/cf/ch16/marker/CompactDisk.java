package gr.aueb.cf.ch16.marker;

public class CompactDisk implements Item {
    private long id;
    private String title;

    public CompactDisk() {

    }

    public CompactDisk(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "CompactDisk{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
