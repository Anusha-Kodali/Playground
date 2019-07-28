#include <stdio.h>
int main() {
	int n,count=1;
    scanf("%d",&n);
    for(count=1;count<=n;count=count+1)
    {
      if(count%2==1)
        printf("%d\n",count);
    }
	return 0;
}