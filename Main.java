package org.example.HW4;

/*Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавление нового сотрудника в справочник*/

public class Main {

    public static void main(String[] args) {
        StaffList s1 = new StaffList();
        Worker e1 = new Worker(1,"123","Pavel",10);
        Worker e2 = new Worker(2,"456","Ivan",5);
        Worker e3 = new Worker(3,"789","Oleg",5);
        s1.add(e1);
        s1.add(e2);
        s1.add(e3);
        s1.SearchBySeniority(5);
        System.out.println();
        s1.SearchByName("Pavel");
        System.out.println();
        s1.SearchById(1);
        System.out.println();
        s1.newWorker(4,"111","Petr",1);

    }
}
