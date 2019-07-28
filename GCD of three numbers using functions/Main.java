#include <stdio.h>
int main() {
	int n1,n2,n3;
    scanf("%d%d%d",&n1,&n2,&n3);
    int r=g_o_n(n1,n2);
    printf("%d",g_o_n(r,n3));
	return 0;
}
int g_o_n(int n1,int n2)
{
  int min=0,gcd=0;
  if(n1<n2){
    min=n1;
  }
  else{
    min=n2;
  }
  while(min>1){
    if((n1%min==0)&&(n2%min==0)){
      gcd=min;
      break;
    }
  }
  return gcd;
}