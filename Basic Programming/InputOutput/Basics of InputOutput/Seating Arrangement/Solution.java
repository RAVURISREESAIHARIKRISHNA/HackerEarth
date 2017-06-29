import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int a[] = new int[n];
        String b[] = new String[n];
        int seat,dummy;
        for(int i=0;i<=n-1;i++){
            seat = s.nextInt();
            dummy = seat%12;
            if(dummy == 0)
            a[i] = seat - 11;else{
                a[i] = seat + (13-2*dummy);
            }
            switch(dummy){
                case 1:
                case 0:
                case 6:
                case 7:
                case 12:
                    b[i] = "WS";
                    break;
                case 2:
                case 11:
                case 5:
                case 8:
                    b[i] = "MS";
                    break;
                default:
                    b[i] = "AS";
            }
        }
        for(int i=0;i<=n-1;i++){
            System.out.println(a[i]+" "+b[i]);
        }
    }
}
