package com.pb.riechin.hw5;

public class Library {

    public static void printReaders(Reader... reader) {
        System.out.println("Список пользователей: ");
        for (Reader value : reader) {
            System.out.println(value.getFullName() + " (" + value.getcardNumber() + ", " + value.getfacultet() + ")");
        }
    }

    public static void printBooks(Book... book) {
        System.out.println("Список книг: ");
        for (Book value : book) {
            System.out.println(value.getTitle() + " (" + value.getAuthor() + " " + value.getDateWriter() + " г.)");
        }
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setTitle("«Программирование. Объектно-ориентированный подход»");
        book1.setAuthor("Зыков С.В.");
        book1.setDateWriter(2019);

        Book book2 = new Book();
        book2.setTitle("Моделирование замкнутых систем автоматического управления");
        book2.setAuthor("Жмудь В.А.");
        book2.setDateWriter(2019);

        Book book3 = new Book();
        book3.setTitle("Системы искусственного интеллекта");
        book3.setAuthor("Бессмертный И.А.");
        book3.setDateWriter(2018);

        Reader reader1 = new Reader();
        reader1.setFullName("Иванов В.М.");
        reader1.setcardNumber(1801);
        reader1.setfacultet("Обработка сала топором");

        Reader reader2 = new Reader();
        reader2.setFullName("Петров А.В.");
        reader2.setcardNumber(210);
        reader2.setfacultet("Физика мягкого тела");

        Reader reader3 = new Reader();
        reader3.setFullName("Кротов А.С.");
        reader3.setcardNumber(112);
        reader3.setfacultet("Нецифровые технологии");

        printBooks(book1, book2, book3);
        printReaders(reader1, reader2, reader3);
        System.out.println("Журнал библиотеки: ");

        reader1.takeBook(3);
        reader1.returnBook(2);
        reader2.takeBook("Системы искусственного интеллекта", "Программирование. Объектно-ориентированный подход");
        reader2.returnBook("Программирование. Объектно-ориентированный подход", "Системы искусственного интеллекта");
        reader3.takeBook(book1, book3);
        reader3.returnBook(book3, book1);
    }
}