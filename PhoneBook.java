
import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        /**
         *  Добавление контактов в телефонную книгу
         */
        addContact(phoneBook, "Иванов", "123-456-789");
        addContact(phoneBook, "Петров", "987-654-321");
        addContact(phoneBook, "Сидоров", "555-555-555");
        addContact(phoneBook, "Иванов", "111-222-333");
        addContact(phoneBook, "Петров", "444-444-444");
        addContact(phoneBook, "Иванов", "333-456-789");

        /**
         * Вывод телефонной книги
         */
        printPhoneBook(phoneBook);
    }

    public static void addContact(HashMap<String, List<String>> phoneBook, String name, String phone) {
        List<String> phones = phoneBook.getOrDefault(name, new ArrayList<>());
        phones.add(phone);
        phoneBook.put(name, phones);
    }

    /**
     * Преобразование HashMap в отсортированный список
     * @param phoneBook
     */
    public static void printPhoneBook(HashMap<String, List<String>> phoneBook) {
        List<Map.Entry<String, List<String>>> sortedList = new ArrayList<>(phoneBook.entrySet());
        sortedList.sort((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()));

        /**
         * Вывод телефонной книги
         */
        for (Map.Entry<String, List<String>> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


