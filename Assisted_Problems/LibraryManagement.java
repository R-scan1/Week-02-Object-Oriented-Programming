import java.util.ArrayList;


class Library {
    private ArrayList<Book> books;


    public Library() {
        this.books = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
    }


    public void displayLibrary() {
        System.out.println("\nLibrary contains the following books:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}


class Book {
    private String title;
    private String author;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public String getTitle(){
    return title;
    }


    public String getAuthor() {
        return author;
    }


    public void displayBookDetails() {
        System.out.println("\nBook Title: " + title);
        System.out.println("Book Author: " + author);
    }
}


class LibraryManagement {
    public static void main(String[] args) {
        Book book1 = new Book("Don Quixote", "Miguel de Carvantes");
        Book book2 = new Book("Geetanjali", "Rabindra Nath Tagore");
        Book book3 = new Book("The Jungle Book", "Rudyard Kipling");


        Library library1 = new Library();
        Library library2 = new Library();


        library1.addBook(book1);
        library1.addBook(book2);


        library2.addBook(book3);


        library1.displayLibrary();
        library2.displayLibrary();


        book1.displayBookDetails();
    }
}
