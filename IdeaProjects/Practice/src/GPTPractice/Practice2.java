package GPTPractice;

public class Practice2 {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter and the Cursed Child","J.K. Rowling",7.99);


        Book b2 = new Book("Half Girlfriend","Chetan Bhagat",5.99);

        Book b3 = new Book("Mathematics for Class X","R.D. Sharma",10);
        Book b4 = new Book();

        Book b5 = new Book("Wings of Fire", "A.P.J. Abdul Kalam");

        b1.bookDetails();
        b2.bookDetails();
        b3.bookDetails();
        b4.bookDetails();
        b5.bookDetails();
    }
}

class Book{
    String title;
    String author;
    double price;

    Book(){
        System.out.println("Default Constructor Called");
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String t, String a, double p){
        System.out.println("Parameterized Constructor Called");
        title = t;
        author = a;
        price = p;
    }

    Book(String t, String a){
        title = t;
        author = a;
        price = 0.0;
    }

    void bookDetails(){
        System.out.println("Title: " + title + " | Author: " + author + " | Price: " + price + ".");
    }
}


