import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        char arr[] = data.toCharArray();
        for(int i=0;i<=data.length()-1;i++){
            if((int)arr[i]>=65 && (int)arr[i]<=90){
                arr[i] = Character.toLowerCase(arr[i]);
            }else{
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        data = new String(arr);
        System.out.println(data);
    }
}

/*
Execution Time : 0.100528 S
*/
