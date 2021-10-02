package ru.mirea.task4.author;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("John", "john@author.com", 'm');

        System.out.println(a1.getName());
        a1.setEmail("john1337@author.com");
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());

        System.out.println(a1.toString());
    }
}
