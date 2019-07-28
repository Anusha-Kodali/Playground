#include<stdio.h>
int main()
{
  int n;
  scanf("%d\n",&n);
  n=n%10000;
  n=n%1000;
  n=n%100;
  n=n/10;
  printf("%d",n);
  return 0;
}