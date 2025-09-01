// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        Book b1 = new Book("It", "Stephen King",2002);
        Book b2 = new Book("Dune","Frank Herbert",2006);
        Book b3 = new Book("Jaws","Peter Benchley",2010);

        Book[] books = {b1,b2,b3};
        for(Book book:books){
            book.displayInfo();
        }
    }
}

class Book{
    String title;
    String author;
    int year;

    Book(String title,String author,int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void displayInfo(){
        System.out.println("Title: " + title + " | Author: " + author + " | Year: " + year + ".");
    }
}