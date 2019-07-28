#include <stdio.h>
int main() {
    int n;
    scanf("%d",&n);
    int val=n;
    for(int cr=1;cr<=n;cr++)
    {
       for(int cc=val;cc>=1;cc--)
       {
         printf("%d",cc);
       }
      val--;
      printf("\n");
    }
	return 0;
}