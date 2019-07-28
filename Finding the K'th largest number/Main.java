#include<stdio.h>
int main()
{
   int n;
  scanf("%d",&n);
  int arr[10];
  for(int idx=0;idx<=n-1;idx++)
  {
    scanf("%d",&arr[idx]);
  }
  int k;
  scanf("%d",&k);
  s_sort(n,arr);
  printf("%d",arr[n-k]);
return 0;
}
void s_sort(int n,int arr[])
{
  for(int sidx=0;sidx<=n-2;sidx++)
  {
    int midx=fmi(sidx,arr,n-1);
    swap(sidx,midx,arr);
  }
}
void swap(int sidx,int midx,int arr[])
{
  int temp=arr[sidx];
  arr[sidx]=arr[midx];
  arr[midx]=temp;
}
int fmi(int sidx,int arr[],int eidx)
{
  int midx=0;
  if(arr[sidx]<arr[sidx+1])
  {
    midx=sidx;
  }
  else
  {
    midx=sidx+1;
  }
  for(int i=sidx+2;i<=eidx;i++)
  {
    if(arr[midx]>arr[i])
    {
      midx=i;
    }
  }
  return midx;
}