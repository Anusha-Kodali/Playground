#include<stdio.h>
void inc_arr(int n,int a[],int sum[]);
int main()
{
	int n;
    scanf("%d",&n);
    int a[n];
    for(int idx=0;idx<n;idx++)
    {
      scanf("%d",&a[idx]);
    }
  int sum[3*n];
  inc_arr(n,a,sum);
	return 0;
}
void inc_arr(int n,int a[],int sum[])
{
  for(int id1=0;id1<=n-1;id1++)
  {
    int k=a[id1];
    int flag=1;
    for(int id2=id1+1;id2<=n-1;id2++)
    {
      if(a[id2]>k)
      {
        for(int id3=id1;id3<=id2;id3++)
        {
          if(a[id3]>a[id2])
            flag=0;
        }
       if(flag==1)
         printf("%d,%d\n",k,a[id2]);
      }
    flag=1;
    }
  }
}