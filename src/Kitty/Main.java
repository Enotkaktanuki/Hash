package Kitty;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(" Momo ", 2);
        Cat cat1 = new Cat(" Popo ", 2);
        Cat cat2 = new Cat(" DartVeider ", 6);
        Cat cat3 = new Cat(" Skyoker ", 4);
        Cat cat4 = new Cat(" Dima ", 2);
        Cat cat5 = new Cat(" Tima ", 4);
        Cat cat6 = new Cat(" Jandos ", 5);
        Cat cat7 = new Cat(" Madina ", 3);
        Cat cat8 = new Cat(" Nura ", 1);
        Cat cat9 = new Cat(" Mambet ", 1);
        List<Cat> cats = new ArrayList<>(Arrays.asList(cat, cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8, cat9));
        HashMap<String, Cat> hashCats = new HashMap<>();
        for(Cat c:cats){
            hashCats.put(c.getName(), c);
        }
//        System.out.println(hashCats);
        hashCats.remove(cat1.getName(),cat1);
//        System.out.println(hashCats);
        hashCats.remove(" Momo ");
        System.out.println(hashCats);



    }
}