import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        double ans = 1;
        for(int i=0;i<=n-1;i++){
            a[i] = s.nextInt();
            ans = (ans*a[i])%((Math.pow(10,9))+7);
        }
        System.out.println((int)ans);    }
}
/*
Execution Time: 0.1305 S
*/
