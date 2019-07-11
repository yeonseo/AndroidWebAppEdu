#include <stdio.h>
#include <graphics.h>
void main()
{
int gd,gm;
char *driver;
detectgraph(&gd,&gm);
switch (gd) {
  case 1:driver="CGA";
	 break;
  case 2:driver="MCGA";
	 break;
  case 3:driver="EGA";
	 break;
  case 4:driver="EGA64";
	 break;
  case 5:driver="EGAMONO";
	 break;
  case 6:driver="IBM8514";
	 break;
  case 7:driver="HERCMONO";
	 break;
  case 8:driver="ATT400";
	 break;
  case 9:driver="VGA";
	 break;
  case 10:driver="PC3270";
	 break;
  }
printf("your graphic board is %s\n",driver);
printf("Now selected mode is %d\n",gm);
}
