#include <mem.h>
#include <conio.h>
#include <stdio.h>
#include <dos.h>
#define video 0xB800
char buf[80*25*2];
void main(void)
{
  printf("Press any key to clear screen\n");
  getch();
  movedata(video, 0, FP_SEG(buf), FP_OFF(buf), 80*25*2);
  clrscr();
  printf("press any key to restore screen\n");
  getch();
  movedata(FP_SEG(buf), FP_OFF(buf),video,0,80*25*2);
}
