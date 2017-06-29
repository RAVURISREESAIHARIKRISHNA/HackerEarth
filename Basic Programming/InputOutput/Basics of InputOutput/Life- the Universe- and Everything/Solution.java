import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n;
        while(true){
            n = s.nextInt();
            if(n == 42){
                break;
            }
            System.out.println(n);
        }
    }
}
/*
Execution time : 0.110106 S
*/
