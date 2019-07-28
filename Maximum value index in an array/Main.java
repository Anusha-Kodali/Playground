// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int s,l[10],i;
  scanf("%d",&s);
  for(i=0;i<s;i++)
  {
    scanf("%d",&l[i]);
  }
  large(l,s);
  return 0;
}
void large(int l[],int s)
{
  int i,lar,m;
  lar=l[0];
  m=0;
  for(i=1;i<s;i++)
  {
    if(lar<l[i])
    {
      m=i;
    }
  }
  printf("%d",m);
}