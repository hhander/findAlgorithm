public class InsertSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(insertSearch(arr,0,arr.length-1,2));
    }

    public static int insertSearch(int[] arr,int left,int right,int key)
    {
        if(left>right || key<arr[0] || key>arr[arr.length - 1])//防止越界必须要后面的条件  也优化了速度
        {
            return -1;
        }
        System.out.println("一次");
        int mid = left + ((right - left)/(arr[right] - arr[left]))*(key - arr[left]);//自适应mid算法

        if(key>arr[mid])
        {
            return insertSearch(arr,mid +1,right,key);
        }
        else if(key<arr[mid])
        {
            return insertSearch(arr,left,mid - 1,key);
        }
        else
        {
            return mid;
        }
    }
}
