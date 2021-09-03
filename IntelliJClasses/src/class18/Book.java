package class18;

public class Book {
    /*
     Write program as a Book class   that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */

    String name;
    String size;
    String genre;

    Book(String nameOfBook, String sizeOfBook, String genreOfBook){
        name=nameOfBook;
        size=sizeOfBook;
        genre=genreOfBook;

    }

    Book(String nameOfBook){
        name=nameOfBook;
        size="n/a";
        genre="unknown";
    }

}
