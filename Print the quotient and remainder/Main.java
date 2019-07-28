#include<stdio.h>
int main()
{
  int n=365,q,r;
  q=n/4;
  r=n%4;
  printf("Quotient: %d\n",q);
  printf("Remainder: %d",r);
  return 0;
}