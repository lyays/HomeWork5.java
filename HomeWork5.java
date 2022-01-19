/**
 * GU_QA_1524 (08.06.2021)
 * Java 1. Homework #5
 *
 * @author Nurgalina Lyaysan
 * @version 10.01.2022 - 10.01.2021
 *
 */

import java.util.Arrays;

class HomeWork5 {
    public static void main(String[]args) {
        Person[]persArray = new Person[5];
        persArray[0] = new Person("Ivanov I.I", "Director", "ivan@gmail.ru", "89091111111", 80, 42);
        persArray[1] = new Person("Sidorod S.S", "Engineer", "sidorov@gmail.ru", "89092111112", 50, 38);
        persArray[2] = new Person("Petrov P.P", "Manager", "petrov@gmail.ru", "89093111113", 60, 35);
        persArray[3] = new Person("Kozlov K.K", "Driver", "kozlov@gmail.ru", "89094111114", 30, 47);
        persArray[4] = new Person("Kapustin K.I", "Worker", "kapustin@gmail.ru", "89095111115", 35, 32);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println(persArray[i]);
            }
        }
    }
}

class Person {
    private String fullName;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    Person(String fullName, String position, String email, String telephone, int salary, int age) { //конструктор
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

     @ Override
    public String toString() {
        return (fullName + ", " + position + ", " + email + ", " + telephone + ", " + salary + ", " + age);
    }
}
