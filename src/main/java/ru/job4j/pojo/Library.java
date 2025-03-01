package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code: A Handbook of Agile Software Craftsmanship", 464);
        Book introductionToAlgorithms = new Book("Introduction to Algorithms", 1312);
        Book designPatterns = new Book("Design Patterns: Elements of Reusable Object-Oriented Software", 416);
        Book thePragmaticProgrammer = new Book("The Pragmatic Programmer: Your Journey to Mastery", 352);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = introductionToAlgorithms;
        books[2] = designPatterns;
        books[3] = thePragmaticProgrammer;
        for (Book book : books) {
            System.out.println("Название: " + book.getName() + ", количество страниц: " + book.getNumberOfPages());
        }
        System.out.println("Replace books with index 0 and 3");
        int index1 = 0;
        int index2 = 3;
        Book temp = books[index1];
        books[index1] = books[index2];
        books[index2] = temp;
        for (Book book : books) {
            System.out.println("Название: " + book.getName() + ", количество страниц: " + book.getNumberOfPages());
        }
        System.out.println("Print books with name cleanCode");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(cleanCode.getName())) {
                System.out.println("Book with name cleanCode: " + books[i].getName() + " and its index is: " + i);
            }
        }
    }
}
