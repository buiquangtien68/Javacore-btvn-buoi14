package service;

import entities.Student;
import utils.Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

public class StudentService {
    Utils utils=new Utils();
    public void inpuStudent(Scanner scanner, Map<Integer, Student> studentMap){
        System.out.println("Mời nhập số hs:");
        int n =Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n ; i++) {
            System.out.println("Nhập tên:");
            String name= scanner.nextLine();
            System.out.println("Nhập điểm:");
            double score=utils.inputDouble(scanner);
            Student student=new Student(name,score);
            studentMap.put(student.getId(),student);
        }
    }
    public void removeStudent(Scanner scanner, Map<Integer,Student> studentMap){
        System.out.println("Mời bạn nhập id:");
        int id=Integer.parseInt(scanner.nextLine());
        studentMap.remove(id);
        System.out.println("Đã xóa thành công");
    }
    public void findByIdStudent(Scanner scanner, Map<Integer,Student> studentMap){
        System.out.println("Mời bạn nhập id:");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Thông tin học sinh là:");
        System.out.println(studentMap.get(id));
    }
    public void calculateScore(Scanner scanner, Map<Integer,Student> studentMap){
        double totalScore=0;
        for (Map.Entry<Integer,Student> entry:studentMap.entrySet()){
            totalScore+=entry.getValue().getScore();
        }
        System.out.println("Điểm trung bình của các hs là: "+(totalScore/studentMap.size()));
    }
}
