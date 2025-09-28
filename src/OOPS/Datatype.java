package OOPS;


class Student {
    int rollno;
    String Name;
    float marks;

    Student(int rollno, String Name, float marks){
        this.rollno = rollno;
        this.Name = Name;
        this.marks = marks;

    }

}

public class Datatype {

    public static void main(String[] args)
    {
        Student st = new Student(10, "Vinay", 99);
        System.out.println(st.rollno);




    }
}
