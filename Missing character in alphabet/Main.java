// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include<stdio.h>
#include<string.h>
int main()
{
  char s[100];
  int i=0,j=0,c[26]={0};
  scanf("%[^\n]s",s);
  while(s[i]!='\0')
  {
    if(s[i]>='a' && s[i]<='z') {
      j=s[i]-'a';
      c[j]++;
    }
    i++;
  }
  for(i=0;i<26;i++)
  {
    if(c[i]==0)
    {
      printf("%c ",i+'a');
      c[i]=0;
    }
  }
   return 0;
}