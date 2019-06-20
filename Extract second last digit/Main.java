#include<stdio.h>
int main()
{
  int a;
  scanf("%d" , &a);

  int c = (a/10)%10;
 
  printf("%d", c);
  return 0;
}