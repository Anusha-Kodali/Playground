#include <stdio.h>
int main() {
	int n,l,s=0;
    scanf("%d",&n);
    if(n>10)
    {
    l=n%10;
    }
    while(n>=10)
    {
      n=n/10;
    }
    s=l+n;
    printf("%d",s);
	return 0;
}