public class recursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5,6,7,8,9};
        System.out.println(recursiveBinary(arr,0,arr.length - 1,5));
    }

    public static int recursiveBinary(int[] arr,int left,int right,int findValue)
    {
        if(left > right)
        {
            return -1;
        }
        int mid = (left + right) / 2;
        if(arr[mid]>findValue)
        {
            return recursiveBinary(arr,left,mid - 1,findValue);
        }
        else if(arr[mid]<findValue)
        {
            return recursiveBinary(arr,mid+1,right,findValue);
        }
        else
        {
            return mid;
        }
    }
}
