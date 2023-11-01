import entities.Student;
import service.StudentService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<Integer, Student> studentMap=new HashMap<>();
        StudentService service=new StudentService();
        service.inpuStudent(scanner,studentMap);
        service.findByIdStudent(scanner,studentMap);
        service.removeStudent(scanner,studentMap);
        service.calculateScore(scanner,studentMap);
        System.out.println(studentMap);
    }
}
