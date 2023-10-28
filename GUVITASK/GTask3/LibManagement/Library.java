package GUVITASK.GTask3.LibManagement;

public class Library {
    private Book[] books;
    private int capacity;
    private int bookCount;

    Library(int capacity){
        this.capacity = capacity;
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(int bookID, String title, String author){
        if(bookCount < capacity){
            books[bookCount] = new Book(bookID,title,author);
            bookCount++;
            System.out.println("Book added successfully.");
        }
        else{
            System.out.println("Library is full. Cannot add more books.");
        }
    }
    public void removeBook(int rbid){
        for (int i=0;i<bookCount;i++){
            if(books[i].getBookID()==rbid){
                books[i] = null;
                bookCount--;
                System.out.println("Book with ID " + rbid + " removed.");
                return;
            }
        }
        System.out.println("Book with ID " + rbid + " not found.");
    }

    public Book searchBook(int sbid){
        for (int i=0;i<bookCount;i++){
            if(books[i].getBookID()==sbid){
                return books[i];
            }
        }
        return null;
    }
    public void displayBook(){
        if(bookCount==0){
            System.out.println("Library is empty. No books to display.");
        }
        else {
            System.out.println("Books in the library:");
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i]);
            }
        }

    }

}
