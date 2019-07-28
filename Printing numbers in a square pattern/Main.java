#include <stdio.h>
int main(){
	int n;
    scanf("%d",&n);
    int num=1;
    for(int r=1;r<=n;r++)
    {
      for(int c=1;c<=n;c++)
      {
        printf("%d",num);
      }
      printf("\n");
      num=num+1;
    }
  	return 0;
}