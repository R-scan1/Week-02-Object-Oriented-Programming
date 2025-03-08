public class Book {
    private static String libraryname="Kartik Library";
    private String title;
    private String author;
    private final long isbn;

    Book(String title, String author, long isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    
    public static void displayLibraryName(){
        System.out.println("Lirary Name "+libraryname); 
        System.out.println();
    }

    public void displayDetails(){
        if(this instanceof Book){
        System.out.println("Book title is "+title);
        System.out.println("Book author name is "+author);
        System.out.println("ISBN number is "+isbn);
        System.out.println();
        }
        else{
            System.out.println("There is no book!!!");
        }
    }

    public static void main(String[] args) {
        Book book=new Book("Gulliver's Travels", "Mark Twain", 1234432112345L);
        Book book2=new Book("Ikegai", "Yu Chang", 4321123454321L);
        
        displayLibraryName();
        book.displayDetails();
        book2.displayDetails();

    }   
}
