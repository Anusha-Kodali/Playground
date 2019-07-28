#include <stdio.h>
int main() {
	int n;
    scanf("%d",&n);
    int val=1;
    for(int cr=1;cr<=n;cr++)
    {
       for(int s=1;s<=(n-cr);s++)
       {
         printf(" ");
       }
      for(int cc=1;cc<=cr;cc++)
      {
        printf("%d ",val);
        val++;
      }
      printf("\n");
    }
	return 0;
}