public class Occuranceofsecondlargestelent {
    static int frequence_of_second_ele(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        int count=0;
        if(arr.length<2)
        {
            return 0;
        }
        // for(int i=0;i<arr.length;i++)
        for(int r:arr)
        {
            if(r>largest)
            {
                secondlargest=largest;
                largest=r;
            }
            else if (r<largest && r>=secondlargest) {
                secondlargest=r;
            }
        }
        for(int num:arr)
        {
            if(num==secondlargest)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={12,56,56,34,56,56,56,64,64,32,45};
        System.out.printf("secondlargestelent=%d",frequence_of_second_ele(arr));
    }
}
