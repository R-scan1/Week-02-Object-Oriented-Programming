class Book{
    String title;
    String author;
    double price;
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display(){
        System.out.println("Title of Book "+title);
        System.out.println("Author of Book "+author);
        System.out.println("Price of Book "+price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Book book=new Book("Isekai","John Swayn",1500);
        book.display();
    }
}
