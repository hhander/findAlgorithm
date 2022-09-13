import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,5,5,6,7,8,9,9};
        ArrayList<Integer> a = binarySearchNum(arr,5);
        List<Integer> collect = a.stream().distinct().collect(Collectors.toList());


    }

    public static ArrayList<Integer> binarySearchNum(int[] arr,int key)
    {
        ArrayList<Integer> midSum = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;
        while(left<=right)
        {
            int mid = (left + right)/2;
            if(key > arr[mid])
            {
                left = mid + 1;
            }
            else if(key < arr[mid])
            {
                right = mid - 1;
            }
            else
            {
                midSum.add(mid);
                left++;
            }
        }
        return midSum;
    }
}
