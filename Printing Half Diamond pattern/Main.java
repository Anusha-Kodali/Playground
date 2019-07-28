#include <stdio.h>
int main() {
	int n;
    scanf("%d",&n);
    for(int rno=1;rno<=n;rno++)
    {
      for(int s=1;s<=(n-rno);s++)
      {
        printf(" ");
      }
      for(int c=1;c<=(2*rno-1);c++)
      {
        printf("*");
      }
      printf("\n");
    }
	return 0;
}