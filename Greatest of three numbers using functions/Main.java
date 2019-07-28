#include <stdio.h>
int main(){
	int n1,n2,n3;
    scanf("%d%d%d",&n1,&n2,&n3);
    int g=g_o_n(n1,n2);
     printf("%d",g_o_n(g,n3));
  	return 0;
}
int g_o_n(int n1,int n2)
{
  int max=0;
  if(n1>n2){
    max=n1;
  }
  else{
    max=n2;
  }
  return max;
}