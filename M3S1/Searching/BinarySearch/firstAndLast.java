public class firstAndLast {

    public static int firstOcc(int[] arr, int k )
    {
        int low=0, high=arr.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>k)
            {
                high= mid-1;
            }
            else if(arr[mid]<k)
            {
                low= mid+1;
            }
            else
            {
                if(mid==0) {return mid;}
                else if(arr[mid-1]!=k) {return mid;}
                else
                high= mid-1;
            }
        }
        return low;
    }

    public static int lastOcc(int[] arr, int k)
    {
        int low=0, high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>k)
            {
                high= mid-1;
            }
            else if(arr[mid]<k)
            {
                low= mid+1;
            }
            else
            {
                if(mid==arr.length-1) {return mid;}
                else if(arr[mid+1]!=k)
                 {return mid;}
                else
                low= mid+1;
            }
            
        }
        return low;
    }

    
    public static void main(String[] args)
    {
        int[] arr= {1,1,1,2,2,2,2,2,2,2,3,3,3,4,4,4,4,};
        int key=1;
        int freq;
        System.out.println(firstOcc(arr, key));
        System.out.println(lastOcc(arr, key));
        freq= lastOcc(arr, key) - firstOcc(arr, key)+1;
        System.out.println(freq);
    }
}
