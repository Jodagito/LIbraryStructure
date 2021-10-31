class Borrower(
    var personId: String,
    var libraryId: String,
    var phone: String,
    var dni: String,
    var blocked: Boolean = False,
    var rentedBooksCount: Int = 0,
    var lastBlockedDate: Date = None
) {
    private var borrowedBooks = new ListBuffer[Book]()

    def addBook(book: Book): Unit = {
        borrowedBooks += book
        rentedBooksCount += 1
    }

    def removeBook(book: Book): Unit = {
        borrowedBooks -= book
        rentedBooksCount -= 1
    }

    def getBorrowedBooks: ListBuffer[Book] = borrowedBooks

    def getBorrowedBooksCount: Int = borrowedBooks.length

    def getBorrowedBooksCountByPerson(personId: String): Int = borrowedBooks.count(b => b.personId == personId)

    def getPersonId: String = personId
}
