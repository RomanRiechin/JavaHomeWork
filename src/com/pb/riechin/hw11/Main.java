package com.pb.riechin.hw11;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        mapper.registerModule(module);

        System.out.println("Работа с телефонной книгой (по полю name):");
        System.out.println("1 - добавление контакта");
        System.out.println("2 - удаление контакта");
        System.out.println("3 - поиск контакта");
        System.out.println("4 - редактирование контакта");
        System.out.println("5 - список всех контактов на экран");
        System.out.println("6 - сортировка контактов по имени");

        int numb = scanner.nextInt();

        switch (numb) {
            case 1:
                addContact();
                break;
            case 2:
                delContact();
                break;
            case 3:
                findContact();
                break;
            case 4:
                correctContact();
                break;
            case 5:
                getContacts();
                break;
            case 6:
                sortContacts();
                break;
        }
    }

    public static void writeToFile(List<Contacts> contactsList) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        writer.writeValue(new File("/contacts.json"), contactsList);
    }

    public static String readFile() throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = Files.newBufferedReader(Path.of ("/contacts.json"));
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        String contactsJson = sb.toString();
        return contactsJson;
    }

    public static void addContact() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Contacts> contactsListNew = mapper.readValue(readFile(), new TypeReference<List<Contacts>>() {
        });

        System.out.println("Для добавления контакта");
        System.out.println("Введите имя: ");
        String name = scanner.next();
        System.out.println("Введите дату рождения: ");
        String dateOfBirth = scanner.next();
        System.out.println("Введите номер телефона в формате '+380': ");
        String telNumb = scanner.next();
        System.out.println("Введите адрес: ");
        String address = scanner.next();

        Contacts ContactsNew = new Contacts(name, dateOfBirth, telNumb, address, LocalDateTime.now());
        contactsListNew.add(ContactsNew);
        writeToFile(contactsListNew);
        System.out.println("Контакт успешно добавлен");
    }

    public static void delContact() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Contacts> contactsListNew = mapper.readValue(readFile(), new TypeReference<List<Contacts>>() {
        });
        System.out.println("Для удаления контакта");
        System.out.println("Введите имя: ");
        String nameDelete = scanner.next();
        for (int i = 0; i < contactsListNew.size(); i++) {
            Contacts contacts = contactsListNew.get(i);
            if (contacts.getName().equals(nameDelete)) {
                contactsListNew.remove(contacts);
                System.out.println("Контакт успешно удален");
                writeToFile(contactsListNew);
            } else continue;
        }
    }

    public static void findContact() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Contacts> peopleListNew = mapper.readValue(readFile(), new TypeReference<List<Contacts>>() {
        });
        System.out.println("Для поиска контакта");
        System.out.println("Введите имя: ");
        String nameFind = scanner.next();
        readFile();

        for (int i = 0; i < peopleListNew.size(); i++) {
            Contacts contacts = peopleListNew.get(i);
            if (contacts.getName().equals(nameFind)) {
                System.out.println(peopleListNew.get(i).toString());
            } else continue;
        }
    }

    public static void correctContact() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Contacts> peopleListNew = mapper.readValue(readFile(), new TypeReference<List<Contacts>>() {
        });
        System.out.println("Для редактирования контакта");
        System.out.println("Введите имя: ");
        String nameCorrect = scanner.next();
        System.out.println("Введите новый номер телефона:");
        String telNumbCorrect = scanner.next();
        for (Contacts contacts : peopleListNew) {
            if (contacts.getName().equals(nameCorrect)) {
                contacts.setTelNumb(telNumbCorrect);
                writeToFile(peopleListNew);
                System.out.println("Номер телефона изменен успешно");
            } else continue;
        }
    }

    public static void getContacts() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Contacts> peopleListNew = mapper.readValue(readFile(), new TypeReference<List<Contacts>>() {
        });
        System.out.println("Все Ваши контакты:");
        System.out.println(peopleListNew);
    }

    public static void sortContacts() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Contacts> contactsListNew = mapper.readValue(readFile(), new TypeReference<List<Contacts>>() {
        });
        contactsListNew.sort(Comparator.comparing(p -> p.getName()));
        System.out.println(contactsListNew);
    }
}