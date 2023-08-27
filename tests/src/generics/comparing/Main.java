package generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(45,87.4f);
        Student rahul = new Student(67,887.4f);
        Student arpit = new Student(7,8.4f);
        Student patanahi = new Student(6,88.4f);
        Student koihai = new Student(99,807.4f);
        Student kya = new Student(670,87.4f);

        Student[] list = {kunal,rahul,arpit,patanahi,koihai,kya};
//        Arrays.sort(list); //this sort method will call compareTo method to make it's decision
        Arrays.sort(list, (student, t1) -> {
            int diff = student.rollno - t1.rollno;
            return diff;
        });
        System.out.println(Arrays.toString(list));
//        if(kunal.compareTo(rahul)<0){
//            System.out.println("rahul has more marks then kunal");
//        }
    }
}
