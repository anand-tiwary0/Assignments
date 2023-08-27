package generics.comparing;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(@NotNull Student student) {
        System.out.println("i am called by .sort method of array");
        int diff = (int)(this.rollno - student.rollno);
        //if diff = 0 both are equal;
        //if diff>0 this is bigger
        //if diff < 0 student is smaller
        return diff;
    }
}
