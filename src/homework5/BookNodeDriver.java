package homework5;

public class BookNodeDriver {

	public static void main(String[] args) {
		Book myBook = new Book("How to Catch a Dinosaur",2019,true);
		
		Book yourBook = new Book("I am Enough", 2018, false);
		
		
		
		// Nodes
	    BookNode nodeA = new BookNode(myBook, null);
	    BookNode nodeB = new BookNode(yourBook, null);
	    
	    
	    // More books 
	    Book mySecondBook = new Book("The Great Gatsby", 1925, false);
	    
	    Book myThirdBook = new Book("The Hunger Games", 2008, false );
	    
	    
	    // more nodes
	    
	    BookNode nodeC = new BookNode(mySecondBook, null);
	    
	    BookNode nodeD = new BookNode(myThirdBook, null);
	}
}