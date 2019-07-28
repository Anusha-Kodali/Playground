#include<stdio.h>
int res(int m)
{
  int s=(m*(m+1))/2;
  return s;
}
int main()
{
  int n;
  scanf("%d",&n);
  int r=res(n);
  printf("%d",r);
  	return 0;
}