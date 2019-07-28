#include<stdio.h>
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
  int idx=re(arr,n,freq);
  int max=midx(freq,n,idx);
  printf("%d",max);
  return 0;
}
int re(int arr[],int n,int freq[])
{
  int i;
  int count=0;
  int fidx=0;
  for(i=0;i<n;i++)
  {
    if(arr[i]==1)
    {
      count++;
    }
    if((arr[i]==0)||(i==n-1))
    {
      freq[fidx]=count;
      count=0;
      fidx++;
    }
  }
  return fidx-1;
}
int midx(int freq[],int n,int idx)
{
  int mno=0;
  if((freq[0]>freq[1])||(idx==0))
  {
    mno=freq[0];
  }
  else
  {
    mno=freq[1];
  }
  for(int i=2;i<idx;i++)
  {
    if(mno<freq[idx])
    {
      mno=freq[idx];
    }
  }
  return mno;
}