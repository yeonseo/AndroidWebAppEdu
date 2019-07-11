#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
main()
 {
 int i,j;
 randomize();     /* 난수 루틴의 초기화 */
 clrscr();
 for(;;)     /* 프로그램 전체를 싸고 있는 무한 loop이다. */
    {
     i=random(100);
     printf("\nNow I make one number. What is it?\n");
     while(j!=i)  /* 두수가 다를 때까지 반복한다. */
         {
          printf("Enter a number : ");
         scanf("%d",&j);
         if (j==999) exit(0);
         if(j==i) printf("OK Good.just that number\n");
         else if (j<i) printf("your number is small\n");
         else printf("your number is large\n");
         }
   }
}
