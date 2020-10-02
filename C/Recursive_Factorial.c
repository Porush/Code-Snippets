#include <stdio.h>

int facto(int n){
    if(n<0){
        return -1;
    }
    else if(n==1){
        return 1;
    }
    else{
        return n*facto(n-1);
    }
}

int main()
{
    int n = 5; 
    int f;
    printf("*****FACTORIAL OF N*****\nEnter an integer number n: ");
    scanf("%d",&n);
    f = facto(n);
    printf("\nFactorial of  5: %d",f);
    return 0;
}
