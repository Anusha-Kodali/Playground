#include <stdio.h>
int main() {
	int n,sum=0,count;
    scanf("%d",&n);
    for(count=0;count<=n;count++)
    {
      sum=sum+count;
    }
    printf("%d",sum);
	return 0;
}