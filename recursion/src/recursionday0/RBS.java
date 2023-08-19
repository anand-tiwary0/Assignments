package recursionday0;

public class RBS {

    public static int rbs(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }

        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] < arr[mid]){
            //means left side is sorted;
            if(target < arr[mid] && target >=arr[start]){
                end = mid -1;
                return rbs(arr,target, start,end);
            }
            else{
                start = mid + 1;
                return rbs(arr,target,start,end);
            }
        }
        if(target<=arr[end] && target >arr[mid]){
            start = mid + 1;
            return rbs(arr,target,start,end);
        }
        return rbs(arr,target,start,mid-1);
        }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,1,2,3};
        int target = 3;
        System.out.println(rbs(arr,target,0,arr.length-1));
    }
}
