#include <stdio.h>
#include <graphics.h>
#include <conio.h>
void main()
{
int gd=0,gm;

clrscr();
printf("Now you are in text mode\n");
printf("Press any key to enter graphic mode\n");
getch();
initgraph(&gd,&gm,"");
circle(320,300,50);
outtextxy(100,100,"Now you are in graphic mode");
outtextxy(100,140,"Press any key to return text mode");
getch();
closegraph();
printf("Now return text mode\n");
getch();
}
