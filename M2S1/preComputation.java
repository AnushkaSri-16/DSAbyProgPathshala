public class preComputation {

    public static void sumOfSubarray(int[] array){
        int[] sumOsub= new int[array.length];
        int i=0;
        sumOsub[0]=array[0];
        for(i=1; i<array.length-1; i++)
        {
            sumOsub[i]= sumOsub[i-1] + array[i];           //sumOsub[i]= sumOsub[i] + array[i+1]; throws error
        }
        return array here;
    }

    static int Query(int l, int r)
    {
        
        return sumOsub[r]- sumOsub[l];
    }

    public static void main(String[] args)
    {
        int[] arr= new int[]{1,2,3,4,5,6,7};
        //sum of idx 2 to 5
        sumOfSubarray(arr);
        Query(l,r);

    }
}
