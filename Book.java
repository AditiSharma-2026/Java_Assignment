class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-----------------------");
    }
}

public class Library {
    public static void main(String[] args) {

        // Array of Book objects
        Book[] books = new Book[3];

        books[0] = new Book("Java Programming", "James Gosling", 500);
        books[1] = new Book("Data Structures", "Mark Allen", 450);
        books[2] = new Book("Operating Systems", "Galvin", 600);

        // Display book details
        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}
