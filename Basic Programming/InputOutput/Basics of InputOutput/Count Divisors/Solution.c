#include<stdio.h>

int main(){
    int a,b,n;
    scanf("%d %d %d",&a,&b,&n);
    int count = 0;
    int i = a;
    while(i<=b){
        if(i%n==0){
            count++;
        }
        i++;
    }
    printf("%d",count);
    return 0;
}
/*
Execution Time : 0.109758 S
*/
