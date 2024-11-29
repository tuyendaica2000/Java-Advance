package bai2_Colection_Set_Map_Generic;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Interface List
        // p1: ArrayList

        ArrayList<String> list = new ArrayList<>();
        // Thêm ptu vào trong mảng
        list.add("Nguyễn");
        list.add("Văn");
        list.add("Tuyến");

        //Xóa pt trong mảng
        list.remove(1);
        list.add(0,"Họ tên: ");
        list.add(3,"Giới tính: Nam");
        list.set(1,"Nguyễn \nVăn ");

        // Wrap: đổi chỗ phần tử.
        String tmp = list.get(2);
        list.set(2, list.get(3));
        list.set(3,tmp);

        //Cách 1: Duyệt từng ptu trong mảng
        for (int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
       /* // Cách 2:
        for (String item : list){
            System.out.print(item);
        }

        // Cách 3: dùng cú pháp lambda
        list.forEach(System.out::print);
        System.out.println(" ");

        //Cách 4:
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item);
        }

        // Cách 5:
        System.out.println("Cái này sử dụng cú pháp của JAVA 8 .");
        list.stream().forEach(System.out::println);*/
        // p2: Vector giống với ArrayList
        Vector<String> list2 = new Vector<>();
        // p3: LinkList
        LinkedList<String> list3 = new LinkedList<>();

        // Map
        HashMap<String ,String> map = new HashMap<>();
        map.put("Họ tên", "Nguyễn Văn Tuyến");
        map.put("Độ tuổi", "23 tuoi");
        map.put("giới tính", "Nam");
        System.out.println(map.get("Họ tên"));

        HashMap<String, Student> studentList = new HashMap<>();
        Student std = new Student("641156", "Tuyen");
        studentList.put(std.rollNo,std);

        std = new Student("641155", "MeMe");
        studentList.put(std.rollNo,std);

        Student std2 = studentList.get("641156");
        System.out.println(std2);

        //Duyệt các ptu trong Hashmap
        Set<String > keys = map.keySet();
        keys.forEach((key) -> {
            System.out.println("Key: " + key + ": "+ map.get(key));
        });


        //Queues
        PriorityQueue<String>   queue = new PriorityQueue<>();
        queue.offer("A1");
        queue.offer("A2");
        queue.offer("A3");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
