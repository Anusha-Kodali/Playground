#include<stdio.h>
int insertion_sort(int n,int l[]);
int main()
{
   int n;
   scanf("%d",&n);
  int l[n];
  for(int idx=0;idx<n;idx++)
  {
    scanf("%d",&l[idx]);
  }
  insertion_sort(n,l);
  return 0;
}
int insertion_sort(int n,int l[])
{
  for(int id1=1;id1<n/2;id1++)
  {
    int k=l[id1];
    int id2=id1-1;
    while((id2>=0)&&(l[id2]>k))
    {
      l[id2+1]=l[id2];
      id2--;
    }
    l[id2+1]=k;
  }
  for(int id1=n/2;id1<n;id1++)
  {
    int k=l[id1];
    int id2=id1-1;
    while((id2>=n/2)&&(l[id2]<k))
    {
      l[id2+1]=l[id2];
      id2--;
    }
    l[id2+1]=k;
  }
  for(int i=0;i<n;i++)
  {
    printf("%d ",l[i]);
  }
  return 0;
}