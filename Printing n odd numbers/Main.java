#include <stdio.h>
int main() {
	int n,count=1,temp=1;
    scanf("%d",&n);
    for(count=1;count<=2*n;count=count+2)
    {
      printf("%d\n",count);
    }
	return 0;
}