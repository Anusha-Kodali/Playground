#include<stdio.h>
   int square(int m)
   {
     int r;
     r=m*m;
     return r;
   }
  int main()
  {
    int n;
    scanf("%d",&n);
    int s=square(n);
    printf("%d",s);
   return 0;
}