#include<stdio.h>
int main()
{
  int a;
  scanf("%d%d" , &a);
  int b= a/100;
  int c = (a/1)%10;
 
  printf("%d", b+c);
  return 0;
}