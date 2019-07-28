#include <stdio.h>
int main() {
	int n;
    scanf("%d",&n);
    for(int cr=1;cr<=n;cr++)
    {
       for(int cc=1;cc<=n;cc++)
       {
         if((cr==cc)||(cr+cc==n+1))
         {
           printf("*");
         }
         else
         {
           printf(" ");
         }
       }
      printf("\n");
    }
	return 0;
}