import java.util.*;
public class Triplet {
    public  static boolean tripletSumboolean(int [] arr,int n,int X){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            int left=i+1;
            int right=n-1;
            int remainingsum=X-arr[i];
            while(left<right){
                if(arr[left]+arr[right]== remainingsum){
                    return true;
                }
                else if(arr[left]+arr[right] > remainingsum){
                    right--;

                }
                else{
                    left++;
                }
            }
        }
        return false;
    }
}
