#include<stdio.h>
void ro(int l[],int s,int it);
int main()
{
  int s,l[10],it,i;
  scanf("%d",&s);
  for(i=0;i<s;i++)
  {
    scanf("%d",&l[i]);
  }
  scanf("%d",&it);
  ro(l,s,it);
  return 0;
        }
 void ro(int l[],int s,int it)
 {
    int i,j;
   int ot,et,oti,eti;
   oti=(s%2==0)?s-2:s-1;
   eti=(s%2==0)?s-1:s-2;
   for(i=0;i<it;i++)
   {
     ot=l[oti];
     for(j=oti;j>=0;j=j-2)
     {
       l[j]=l[j-2];
     }
     l[0]=ot;
     et=l[1];
     for(j=1;j<s;j=j+2)
     {
       l[j]=l[j+2];
     }
     l[eti]=et;
   }
   for(i=0;i<s;i++)
   {
     printf("%d ",l[i]);
   }
}