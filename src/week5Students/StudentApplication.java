package week5Students;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);
        String name;
        String studentNumber;
        String term;

        while (true) {
            System.out.println("Name: ");
            name = input.nextLine();
            if (name.isEmpty()) {
                break; 
            }
            System.out.println("StudentNumber: ");
            studentNumber = input.nextLine();
            if (studentNumber.isEmpty()) {
                break; 
            }
            list.add(new Student(name, studentNumber));
        } 

        for (Student student : list) {
            System.out.println(student.toString());
        }

        System.out.println("Give search term: ");
        term = input.nextLine();
        input.close();
        System.out.println("Result:");

        for(Student student: list){
            if(student.getName().contains(term)){
                System.out.println(student);
            }
        }

    }
}
