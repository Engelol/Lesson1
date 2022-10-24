package org.example.Lesson5;
/*      1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        2. Конструктор класса должен заполнять эти поля при создании объекта.
        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        4. Создать массив из 5 сотрудников.
        Пример:
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person(...);
        ...
        persArray[4] = new Person(...);
        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/

public class Employees {
    String fullName;
    String jobTitle;
    String email;
    String telephone;
    int wage;
    int age;

    public Employees(String fullName, String jobTitle, String email, String telephone, int wage, int age) {
        this.fullName = fullName.toUpperCase();
        this. jobTitle = jobTitle;
        this.email = email;
        this.telephone = telephone;
        this.wage = wage;
        this.age = age;
    }

    void printInfo() {
    System.out.println(String.format("ФИО: %s \nДожность: %s \nEmail: %s \nТелефон: %s \nЗарплата: %s \nВозраст: %s",fullName,jobTitle,email,telephone,wage,age));
    System.out.println();
}

}
