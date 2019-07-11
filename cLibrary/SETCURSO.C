#include <stdio.h>
#include <conio.h>
void main()
{
_setcursortype(_NORMALCURSOR);
printf("Normal cursor type.\n");
getch();
_setcursortype(_SOLIDCURSOR);
printf("Big cursor type.\n");
getch();
_setcursortype(_NOCURSOR);
printf("No cursor type.\n");
getch();
_setcursortype(_NORMALCURSOR);
}
