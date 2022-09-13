public class SeqSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,6,7,8,9};
        System.out.println(searchNum(arr,45));
    }

    public static int searchNum(int[] arr,int key)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
}
