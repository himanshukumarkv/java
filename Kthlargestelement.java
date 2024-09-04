import java.util.Arrays;
import java.util.Scanner;

public class Kthlargestelement {
    static int kth(int arr[],int arrSize,int K){
        if (K > arrSize || K <= 0 || arrSize < 1) {
            return -1;  // Return -1 for invalid K or invalid array size
        }
        Arrays.sort(arr);
        
        if(arrSize==2)
        {
            return arr[arrSize-K];
        }
        if (K == 1 || K == arrSize) {
            return arr[arrSize - K];  // K == 1 returns the largest element, K == arrSize returns the smallest element
        }
        int temp,count=0,k=0;

        temp=arr[arrSize-1];
        for(int i=0;i<arrSize;i++)
        {
            
            if (temp!=arr[arrSize-i-1]){
                count++;
                
                if(count==K-1)
                {
                    k=arr[arrSize-i-1];
                    break;
                }
                
            }
            temp=arr[arrSize-i-1];

        }
        return k;
        

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,4,5};
        int n=arr.length;
        Scanner s=new Scanner(System.in);
        int K=s.nextInt();
        System.out.printf("kth element=%d",kth(arr, n, K));
    
    }
    
}
