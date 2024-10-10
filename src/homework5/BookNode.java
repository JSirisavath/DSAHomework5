package homework5;

public class BookNode {

	    private Book data;
	    private BookNode link;

	    // Constructor
	    public BookNode(Book data, BookNode link) {
	        this.data = data;
	        this.link = link;
	    }

	    // Getter and Setter methods for data
	    public Book getData() {
	        return data;
	    }

	    public void setData(Book data) {
	        this.data = data;
	    }

	    // Getter and Setter methods for link
	    public BookNode getLink() {
	        return link;
	    }

	    public void setLink(BookNode link) {
	        this.link = link;
	    }
	}

