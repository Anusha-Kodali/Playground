#include <stdio.h>
int main() {
	int n;
    scanf("%d",&n);
    for(int cr=1;cr<=n;cr++)
    {
      for(int cc=1;cc<=n;cc++)
      {
        if(((cr%2==0)&&(cc==1))||((cr%2==1)&(cc==n)))
        {
          printf("%d",cr+1);
        }
        else
        {
          printf("%d",cr);
        }
      }
      printf("\n");
    }
	return 0;
}