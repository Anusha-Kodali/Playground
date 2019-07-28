#include<stdio.h>
#include<string.h>
int main()
{
  char s1[20];
  int i,l;
  int flag=0;
  scanf("%s",s1);
  l=strlen(s1);
  for(i=0;i<l;i++) {
    if(s1[i]!=s1[l-i-1]) {
      flag=1;
      break;
    }
  }
  if(flag)
    printf("%s is not a palindrome",s1);
  else
    printf("%s is a palindrome",s1);
   return 0;
}