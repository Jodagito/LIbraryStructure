class Book(
    var title: String,
    var isbn: String,
    var numberPages: Int,
    var format: Format,
    var author: Person,
    var editorial: Editorial,
    var category: Category,
    var edition: String,
    var copies: Number,
    var library: Library,
    var availableCopies: Int
) {
    def getTitle(): String = {
        return title
    }

    def getIsbn(): String = {
        return isbn
    }

    def getNumberPages(): Int = {
        return numberPages
    }

    def getFormat(): Format = {
        return format
    }

    def getAuthor(): Person = {
        return author
    }

    def getEditorial(): Editorial = {
        return editorial
    }

    def getCategory(): Category = {
        return category
    }

    def getEdition(): String = {
        return edition
    }

    def getCopies(): Number = {
        return copies
    }

    def getLibrary(): Library = {
        return library
    }

    def getAvailableCopies(): Int = {
        return availableCopies
    }

    def setTitle(title: String) = {
        this.title = title
    }

    def setIsbn(isbn: String) = {
        this.isbn = isbn
    }

    def setNumberPages(numberPages: Int) = {
        this.numberPages = numberPages
    }

    def setFormat(format: Format) = {
        this.format = format
    }

    def setAuthor(author: Person) = {
        this.author = author
    }

    def setEditorial(editorial: Editorial) = {
        this.editorial = editorial
    }

    def setCategory(category: Category) = {
        this.category = category
    }

    def setEdition(edition: String) = {
        this.edition = edition
    }

    def setCopies(copies: Number) = {
        this.copies = copies
    }

    def setLibrary(library: Library) = {
        this.library = library
    }

    def setAvailableCopies(availableCopies: Int) = {
        this.availableCopies = availableCopies
    }
}
