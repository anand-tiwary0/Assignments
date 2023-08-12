class Student {
    public int rollno;
    static int totalstudents;
    private float marks;
    //getters and setters for this private property

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public  String name;
    public boolean boyornot;

    //constructor for class
    public Student(int rollno, float marks, String name, boolean boyornot) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
        this.boyornot = boyornot;
        totalstudents++;
    }

    //toString method overriding default to String method
    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                ", boyornot=" + boyornot +
                '}';
    }
}

public class Main{
    public static void main(String[] args) {
        Student student1 = new Student(12, 89.4f,"kumar",true);
        Student student2 = new Student(34,90.4f,"ram",true);
        Student student3 = new Student(122,97.4f,"sita",false);

        System.out.println(student1);  //here default toString() will be overridden by
        System.out.println(student2);//toString() method defined in Student class
        System.out.println(student3);
        student3.setMarks(99.04f);
        System.out.println("marks of student3 using get method ::"+ student3.getMarks());
        //as static var is same variable for all here total student will give total number
        //of students
        System.out.println("total number of students:: " + Student.totalstudents);
    }
}
