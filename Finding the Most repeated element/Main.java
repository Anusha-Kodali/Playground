#include<stdio.h>
int mf(int arr[],int n,int freq[])
{
  int mc=0;
  int cc=1;
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(arr[i]==arr[j])
        cc++;
    }
    freq[i]=cc;
    cc=1;
  }
  for(int i=0;i<n;i++)
  {
    if(freq[i]>freq[mc])
      mc=i;
  }
  return arr[mc];
}
int main()
{
  int n;
  scanf("%d",&n);
  int arr[10];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  int freq[n];
  printf("%d",mf(arr,n,freq));
  return 0;
}