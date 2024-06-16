public class App {

    public static void main(String[] args) {
        System.out.println("Task 1");
        Author authorOne = new Author("Иван", "Иванов");
        Author authorTwo = new Author("Петр", "Петров");
        Book bookOne = new Book(authorOne, "Закат", 1875);
        Book bookTwo = new Book(authorTwo, "Рассвет", 2010);

        printBook(bookOne);
        System.out.println("Книга до изменения года: ");
        printBook(bookTwo);
        bookTwo.setYear(2013);
        System.out.println("Книга после изменения года:");
        printBook(bookTwo);

        System.out.println(bookOne);
        System.out.println(authorOne);
        System.out.println(bookTwo);
        System.out.println(authorTwo);

        System.out.println(bookOne.equals(bookOne));

    }

    private static void printBook(Book book) {
        System.out.printf("Название книги: %s%nАвтор книги: %s%nГод книги: %s%n----%n",
                book.getName(),book.getAuthor().getFullName(), book.getYear());
    }

}
