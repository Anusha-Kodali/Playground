#include <stdio.h>
int main(){
	int n;
    scanf("%d",&n);
    int t=0;
    for(int r=1;r<=n;r++)
    {
       for(int c=1;c<=r;c++)
       {
         if(t==0)
         {
           printf("*");
           t=1;
         }
         else
         {
           printf("#");
           t=0;
         }
       }
      printf("\n");
    }
  	return 0;
}