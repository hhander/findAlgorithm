public class binarySearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearchNum(arr,5));
    }

    public static int binarySearchNum(int[] arr,int key)
    {
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
                return mid;
            }
        }
        return -1;
    }
}
