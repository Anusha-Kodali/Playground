#include<stdio.h>
int main()
{
  int i,c=0;
  int arr_size;
  scanf("%d",&arr_size);
  int arr[20];
  for(int id=0;id<=arr_size-1;id++)
  {
    scanf("%d",&arr[id]);
  }
  for(i=0;i<arr_size;i++)
  {
    if(arr[i]>0)
    {
      arr[c++]=arr[i];
    }
  }
  while(c<arr_size){
    arr[c++]=0;
  }
  for(i=0;i<arr_size;i++)
  {
    printf("%d ",arr[i]);
  }
  return 0;
 }