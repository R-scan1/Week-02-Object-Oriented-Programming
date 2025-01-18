public class Book1 {
    public String title;       
    public String author;      
    public double price;       
    public boolean availability; 

    public Book1() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.availability = true;
    }

    public Book1(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public void borrowBook() {
        if (this.availability) {
            System.out.println("You have successfully borrowed \"" + this.title + "\" by " + this.author + ".");
            this.availability = false; 
        } else {
            System.out.println("Sorry, \"" + this.title + "\" is currently unavailable.");
        }
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (availability ? "Available" : "Unavailable"));
    }

    public static void main(String[] args) {
                Book1 book1 = new Book1("1984", "George Orwell", 15.99, true);

        book1.displayBookDetails();
        System.out.println();

        book1.borrowBook();
        System.out.println();

        book1.borrowBook();
        System.out.println();

        book1.displayBookDetails();
    }
}
