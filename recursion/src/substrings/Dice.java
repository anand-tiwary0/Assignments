package substrings;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        int target = 4;
        dice0(target);
        System.out.println(dice1("",target));
//        System.out.println(dice11(0,target));
        System.out.println(face("",7,6));
    }

    private static void dice0(int target) {
        dice0("",target);
    }
    private static void dice0(String p,int target){
        if(target <= 0){
            System.out.println(p);
            return;
        }
        for(int i=1; i<=6 && i<=target; i++){
            String ch = i + "";
            dice0(p+ch,target-i);
        }
    }

    public static ArrayList<String> dice1(String p,int target){
        //here test is done so that -ve target value can also be handled
        if(target <= 0){
            ArrayList<String> processed = new ArrayList<>();
            processed.add(p);
            return processed;
        }
        ArrayList<String> anstillnow = new ArrayList<>();
        for(int i = 1; i<=6 && i<=target; i++){
            String ch = "" + i;
            anstillnow.addAll(dice1(p+ch,target-i));
        }
        return anstillnow;
    }

    public static ArrayList<String> face(String p,int target,int face){
        if(target <= 0){
            ArrayList<String> processed = new ArrayList<>();
            processed.add(p);
            return processed;
        }
        ArrayList<String> anstillnow = new ArrayList<>();
        for(int i =1; i<=face && i<=target; i++){
            String ch = "" + i;
            anstillnow.addAll(face(p+ch,target-i,face));
        }
        return anstillnow;
    }
}
