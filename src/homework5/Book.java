package homework5;

public class Book {
    private String title;
    private int year;
    private boolean isNew;

    // Constructor
    public Book(String title, int year, boolean isNew) {
        this.title = title;
        this.year = year;
        this.isNew = isNew;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter and Setter for isNew
    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    @Override
    public String toString() {
        return "Book Title: " + title + ", Year: " + year + ", Is New: " + isNew;
    }
}
