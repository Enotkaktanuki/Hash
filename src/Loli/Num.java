package Loli;

import java.util.*;

public class Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Введите цифру: ");
        list.add(scanner.nextInt());
        System.out.println("Введите цифру: ");
        list.add(scanner.nextInt());
        System.out.println("Введите цифру: ");
        list.add(scanner.nextInt());
        System.out.println("Введите цифру: ");
        list.add(scanner.nextInt());
        System.out.println("Введите цифру: ");
        list.add(scanner.nextInt());
        System.out.println("Введите цифру: ");
        list.add(scanner.nextInt());
        System.out.println("Введите цифру: ");
        list.add(scanner.nextInt());
        System.out.println("Введите цифру: ");
        list.add(scanner.nextInt());
        Collections.sort(list);
        System.out.println(list);
        for(int i =0; i<list.size()-1; i++){
            if(list.get(i).equals(list.get(i+1))){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
