#include<stdio.h>
int main()
{
  int arr_size;
  scanf("%d",&arr_size);
  int arr[10];
  for(int idx=0;idx<=arr_size-1;idx++)
  {
    scanf("%d",&arr[idx]);
  }
  int s1;
  scanf("%d",&s1);
  int s2;
  scanf("%d",&s2);
  int e1=-1;
  int e2=-1;
  for(int idx=0;idx<=arr_size-1;idx++)
  {
    if(s1==arr[idx])
    {
      e1=idx;
    }
    if(s2==arr[idx])
    {
      e2=idx;
    }
  }
  printf("%d\n",e1);
  printf("%d\n",e2);
  return 0;
}