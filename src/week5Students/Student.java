package week5Students;

public class Student {
    private String studentNumber;
    private String name;

    public Student(String Name, String StudentNumber){
        this.name = Name;
        this.studentNumber = StudentNumber;
    }

    public String getName(){
        return name;
    }
    
    public String getStudentNumber(){
        return studentNumber;
    }

    public String toString(){
        return name + " (" + studentNumber + ")";
    }
}
