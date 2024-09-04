import java.util.Arrays;

public class Sorting {
    static void shortarr(int arr[])
    {
        // Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={12,12,34,56,64,64,32,45};
        shortarr(arr);
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
}
