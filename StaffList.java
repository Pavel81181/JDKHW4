package org.example.HW4;



import java.util.*;


public class StaffList {

    ArrayList<Worker> list;

    StaffList(){
        list = new ArrayList<>();
    }

    public void SearchBySeniority(int seniority){
        for (Worker worker : list) {
            if (worker.getSeniority() == seniority) {
                System.out.println(worker.toString());
            }
        }
    }
    public void SearchByName(String name){
        for (Worker worker : list) {
            if (Objects.equals(worker.getName(), name)) {
                System.out.println(worker.getPhone());
            }
        }
    }

    public void SearchById(int id){
        for (Worker worker : list) {
            if (worker.getId() == id) {
                System.out.println(worker.toString());
            }
        }
    }

    public void newWorker(int id, String phone, String name, int seniority){
        list.add(new Worker(id, phone, name, seniority));
    }

    public void add(Worker w1) {
        list.add(w1);
    }


}