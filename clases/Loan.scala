import java.awt.print.Book
class Loan {
    val borrowerId = new Borrowed();
    val starDate= new Date();
    val endDate = new Date();
    val note = String;
    val bookId = new Book();
    def borrow = (Book, Borrower) {
        val starDate = getDate();
        val endDate = stardate + 8;
        val note =  "Cuida siempre tus libros";
        return Loan(Borrower.id, stardate, endDate, note, Book.id);
    }
    def countCurrentLoans(): number {
        return getLoans();
    }
}

case class Loan(borroweId: Borrowed, starDate: Date, endDate: Date, note: String, bookId: Book)


