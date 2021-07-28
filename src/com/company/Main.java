package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main {
    static HashMap<String, String> yesterday = new HashMap<>();
    static HashMap<String, String> today = new HashMap<>();
    static ArrayList<String> deletedPages = new ArrayList<>();
    static ArrayList<String> createdPages = new ArrayList<>();
    static ArrayList<String> changedPages = new ArrayList<>();

    static {
        yesterday.put("url1", "html1");
        yesterday.put("url2", "html22");
        yesterday.put("url3", "html3");
        yesterday.put("url4", "html4");
        today.put("url8", "html8");
        today.put("url2", "html2");
        today.put("url3", "html32");
        today.put("url5", "html5");
        today.put("url7", "html7");
    }

    public static void main(String[] args) {
        deletedPages();
        createdPages();
        changedPages();
        System.out.println("Здравствуйте, дорогая и.о. секретаря\n" +
                "За последние сутки во вверенных Вам сайтах произошли следующие изменения:");

        System.out.print("Исчезли следующие страницы: ");
        for (String s :
                deletedPages) {
            System.out.print(s + " ");
        }

        System.out.print("\nПоявились следующие новые страницы: ");
        for (String s :
                createdPages) {
            System.out.print(s + " ");
        }

        System.out.print("\nИзменились следующие страницы: ");
        for (String s :
                changedPages) {
            System.out.print(s + " ");
        }
    }

    public static void deletedPages() {
        Set<String> keys = yesterday.keySet();
        for (String s :
                keys) {
            if (!today.containsKey(s))
                deletedPages.add(s);
        }
    }

    public static void createdPages() {
        Set<String> keys = today.keySet();
        for (String s :
                keys) {
            if (!yesterday.containsKey(s))
                createdPages.add(s);
        }
    }

    public static void changedPages() {
        Set<String> keys = today.keySet();
        for (String s :
                keys) {
            if (yesterday.containsKey(s)) {
                if (!today.get(s).equals(yesterday.get(s)))
                    changedPages.add(s);
            }
        }
    }
}
