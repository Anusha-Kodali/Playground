/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  int s,l[10],i;
  scanf("%d",&s);
  for(int i=0;i<s;i++)
  {
    scanf("%d",&l[i]);
  }
  large(l,s);
  return 0;
}
void large(int l[],int s)
{
  int i,b1=0,b2=0;
  for(i=0;i<s/2;i++)
  {
    b1=b1+l[i];
  }
  for(i=s/2;i<s;i++)
  {
    b2=b2+l[i];
  }
  if(b1==b2)
  {
    printf("Perfect Batch");
  }
  else
  {
    printf("Not a Perfect Batch");
  }
}