class Book{
    
    private String title;
    private String author;
    private int price;

    Book(){
       this.title="Demo Title";
       this.author="Demo Author";
       this.price=1200;
    }

    Book(String title, String author, int price){
       this.title=title;
       this.author=author;
       this.price=price;
    }

    void display(){
        System.out.println("Book Title: "+title);
        System.out.println("Book author: "+author);
        System.out.println("Book price: "+price);
    }

    public static void main(String[] args) {
        System.out.println("Invoking default constructor and displaying details :");
        Book book=new Book();
        book.display();
        System.out.println();
        System.out.println("Invoking parameterized constructor and displaying details :");
        Book book1=new Book("Journey To The West","Wu Cheng",10000);
        book1.display();
        
    }
}