#include <stdio.h>
#include <stdlib.h>
#include <dir.h>
#include <dos.h>
int main(void)
{
  struct dfree free;
  long avail,total;
  getdfree(0,&free);
  
avail=(long)free.df_avail*(long)free.df_bsec*(long)free.df_sclu
s;
  
total=(long)free.df_total*(long)free.df_bsec*(long)free.df_sclu
s;
  printf("Current drive's total space is %ld bytes\n",total);
  printf("Current drive's available space is %ld 
bytes\n",avail);
  return 0;
}
