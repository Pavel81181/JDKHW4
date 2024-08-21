package org.example.HW4;

public class Worker {
    private int id;
    private String phone;
    private String name;
    private int seniority;

    public Worker(int id, String phone, String name, int seniority) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.seniority = seniority;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public String toString() {
        return "№=" + id + ", Телефон= " + phone + ", Имя=" + name + ", стаж=" + seniority;
    }
}