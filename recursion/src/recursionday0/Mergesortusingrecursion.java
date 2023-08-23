//package recursionday0;
//
//import java.util.Arrays;
//
//public class Mergesortusingrecursion {
//    public static void main(String[] args) {
//        int[] arr = {8,3,4,12,5,6};
//        int[] sortedarray = mergesort(arr);
//        System.out.println(Arrays.toString(sortedarray));
//    }
//
//    public static int[] mergesort(int[] arr){
//        return helper(arr,0,arr.length-1);
//    }
//
//    public static int[] helper(int[] arr,int start,int end){
//        if(arr.length == 1){
//            return arr;
//        }
//        int mid = start + (end - start)/2;
//        //sort left half and store that result into an array
//        int[] sortedleft = helper(arr,start,mid);
//        int[] sortedright = helper(arr,mid+1,end);
//        //meriging both part
//        return merge(sortedleft,sortedright);
//    }
//
//    public static int[] merge(int[] sortedleft,int[] sortedright){
//        int lefts = 0;
//        int rights = 0;
//        int currentindex = 0;
//        int[] arr = new int[sortedleft.length + sortedright.length];
//        return helpers(arr,sortedleft,sortedright,lefts,rights,currentindex);
//    }
//
//    public static int[] helpers(int[] arr,int[] left,int[] right,int lefts ,int rights,int index){
//        if(lefts>=left.length-1 || rights >= right.length-1){
//            //ensure all remains are merged in the array and then return the array to above call basically this will be
//            //final version of the array
//            while((left.length-1)-lefts>=0){
//                arr[++index] = left[lefts++];
//            }
//            while(right.length-1 - rights>=0){
//                arr[++index] = right[rights++];
//            }
//
//            return arr;
//        }
//
//        if(left[lefts]>=right[rights]){
//            arr[index] = right[rights];
//            return helper(arr,left,right,lefts,++rights,++index);
//        }
//            arr[index] = left[lefts];
//            return helper(arr,left,right,++lefts,rights,++index);
//    }
//
//
//
//}
