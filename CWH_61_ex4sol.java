class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addBooks(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book +" has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available books are:");
        for(String book:books){
            if(book==null)
                continue;
            System.out.println("* "+book);
        }

    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued");
                this.books[i]=null;
                return ;
            }
        }
        System.out.println("This book doesn't exist");

    }
    void returnBook(String book){
        addBooks(book);
    }
}
public class CWH_61_ex4sol {
    public static void main(String[] args) {
        Library centralLibrary=new Library();
        centralLibrary.addBooks("Think and grow Rich");
        centralLibrary.addBooks("Algorithms");
        centralLibrary.addBooks("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("C++");
    }
}
