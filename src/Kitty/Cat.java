package Kitty;

import java.util.HashMap;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "\nИмя: "+ name  +
                "\nВозраст: " + age+"\n";
    }


}
//    Создайте класс Cat с полями имя, возраст.
//        Создайте коллекцию HashMap<String, Cat>.
//        Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
//        Вывести результат на экран, каждый элемент с новой строки.
//        Реализуйте все известные вам методы HashMap.
//        Выведите результат на консоль.
