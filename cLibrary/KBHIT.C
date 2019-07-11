#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
void main()
{
int x,y;
char ch;
clrscr();
for (;;) {
  x=random(80)+1;
  y=random(24)+1;
  ch=random('Z'-'A')+'A';
  gotoxy(x,y);
  putch(ch);
  if (kbhit())
  {
    gotoxy(10,10);
    printf("     Press 'c' to clear screen      ");
    gotoxy(10,11);
    printf("     Press 'e' to exit program      ");
    getch();
    switch(getch()) {
      case 'e':exit(0);
      case 'c':clrscr();
	       break;
    }
  }
  }
}
