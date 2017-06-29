import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int n = s.nextInt();
        int w,h;
        String a[] = new String[n];
        for(int i=0;i<=n-1;i++){
            w = s.nextInt();
            h = s.nextInt();
            if(w<l || h<l){
                a[i] = "UPLOAD ANOTHER";
                continue;
            }if(w>=l && h>=l){
                if(w==h){
                    a[i] = "ACCEPTED";
                    continue;
                }else{
                    a[i] = "CROP IT";
                }
            }
        }
        for(int i=0;i<=n-1;i++){
            System.out.println(a[i]);
        }
    }
}
/*
Execution Time : 0.109731 S
*/
