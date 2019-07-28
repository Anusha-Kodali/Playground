#include <stdio.h>
int main() {
	int n,m=3,i;
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
      printf("%d",i);
        if((i%3==0)&&(i!=n))
           printf(",");
           }
    return 0;
}