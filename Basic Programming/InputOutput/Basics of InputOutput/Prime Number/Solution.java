import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Solution obj = new Solution();
        int a[] = obj.primeArray(n);
        for(int i=0;i<=a.length-1;i++){
            if(a[i]==0)break;
            System.out.print(a[i]+" ");
        }
    }
    public int[] primeArray(int n){
        int a[] = new int[n];
        int k=0;
        int x = 2;
        boolean prime;
        for(int i = 2;i<=n-1;i++){
            prime = true;
            for(int j=2;j<=i-1;j++){
                if(i%j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                a[k++] = i;
            }
        }
        return a;
    }
}
/*
Execution Time : 0.109513 S
*/
