package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 464);
        Book headFirst = new Book("Head First Java", 688);
        Book theWitcher = new Book("The Last Wish", 288);
        Book placebo = new Book("You Are the Placebo", 392);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = headFirst;
        books[2] = theWitcher;
        books[3] = placebo;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println("Swap books [0] and [3]:");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println("Show only book \"Clean Code\":");
        for (Book book : books) {
            if ("Clean Code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}
