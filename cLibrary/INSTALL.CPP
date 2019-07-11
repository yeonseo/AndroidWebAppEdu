// C++ ¶¥¸å ¹A 3 Š¥ µ¹A ¬éÃ¡ Ïa¡‹aœ‘
// 1Š¥ ¬éÃ¡ Ïa¡‹aœ‘·i ¹¡‹q ®¸÷Ðe ˆõ·±
// arj ´sÂ‚·a¡ •A·¡ÈáŸi ¥¡‰ÅÐa‰¡ ´sÂ‚·i Î‰´á º‹¡ e Ðe”a.
// 1994.11.28

#include <graphics.h>
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <dir.h>
#include <dos.h>
#include <errno.h>
#include <ctype.h>
#include <string.h>
#include "shhan.h"

void readpcx16p(char *,int,int);       /* 16 ¬‚ pcxŸi ·ª“e Ðq® */
void readline16p(FILE *,int,int,int);
void readpalette16(char *);
void hom(int,int,int,int,int,int,int);
void dan(int,int,int,int,int,int,int,int);
void bar2(int l,int t,int r,int b);
#define he0 *h1
#define he1 *h1+h2


char buf[128];
ffblk ffb;
int result;
char cwd[80];       // ÂAÁ¡ ¸b´ó·i ¯¡¸bÐe —¡BÉ¡Ÿ¡
char cwd2[80];      // arj.exe· ‰w¡Ÿi ¥¡‰ÅÐi ¢…¸a ¤µi
int disk;           // ÂAÁ¡ ¸b´ó·i ¯¡¸bÐe —aœa·¡¤á
char command[128];  // ¡ww ¢…¸aµi
int chapter;        // ¸w¥i¡ ´sÂ‚·i Î‰ ˆõ·¥ˆaŸi ‹¡´âÐe”a.
char drive[3],path[66],name[9],ext[5];
int gd=0,gm;
int h1,h2;

void main()
{
char ch;
getcwd(cwd,80);      // ¸b´ó·i ¯¡¸bÐe ‰w¡Ÿi ¥¡‰ÅÐe”a.
disk=getdisk();
registerbgidriver(EGAVGA_driver);
registerbgidriver(Herc_driver);
initgraph(&gd,&gm,"");
if (gd==7) {h1=0;h2=1;} else {h1=1;h2=0;}
shset(gd,1);
setfillstyle(1,7);
bar2(0,0,getmaxx(),getmaxy());

hom(15,5,625,195,8,15,1);
readpcx16p("won.pcx",20,10);      // ‹aŸ± ·ª´á —i·±
dan(85,200,555,255,15,8,1,1);     // ¬éÃ¡ ´e¢… Â‰b
dan(90,205,550,250,8,15,1,1);
setfillstyle(1,11he0);
bar2(91,206,549,249);
shhan(100,210,"C++·i ˆõ·a¡ AÌáœå¯aÍe· µ¹A Ìa·©·i Ða—a",0,11,0,0);
shhan(100,226,"—¡¯aÇaµA ¬éÃ¡Ðs“¡”a. ´aœ »©¢…µA ·w”sÐ º¯³¯¡¶a.",0,11,0,0);

dan(85,260,555,380,15,8,1,1);    // ¡A¯¡»¡ ”ÑÁÀw
dan(90,265,550,375,8,15,1,1);
do {
ch=0;
setfillstyle(1,1he0);
bar2(91,266,549,374);
shhan(100,270,"¬éÃ¡Ði —¡BÉ¡Ÿ¡Ÿi ·³bÐa¯³¯¡¶a.",15,1,0,0);
shmode(1);
strcpy(buf,"c:\\cpp3ex");
shget(100,290,buf,15,1,80,1);
result=findfirst(buf,&ffb,FA_DIREC);        // —¡BÉ¡Ÿ¡ˆa ·¶“e»¡ ¥¥”a.
if (result) {
  shhan(100,270,"—¡BÉ¡Ÿ¡ˆa ´ô¯s“¡”a.  e—iŒa¶a?",15,1,0,0);
  shhan(100,290,"M: e—k  R:¸·³b  C:¬éÃ¡ Âá­¡",15,1,0,0);
  ch=getch();
  ch=tolower(ch);
  if (ch=='m')
    {
    if (mkdir(buf))
      {
      setfillstyle(1,1);
      bar(91,266,549,374);
      shhan(100,270,"—¡BÉ¡Ÿ¡ ·¡Ÿq·¡ ¸i¡µ ·³b–A´ö¯s“¡”a.",15,1,0,0);
      shhan(100,290,"”a¯¡ ·³bÐ º¯³¯¡¶a.",15,1,0,0);
      delay(1500);
      ch='r';
      continue;
      }
    setfillstyle(1,1he0);
    bar(91,266,549,374);
    shhan(100,270,"—¡BÉ¡Ÿ¡Ÿi  e—i´ö¯s“¡”a.",15,1,0,0);
    shhan(100,290,"·¡ —¡BÉ¡Ÿ¡µA µ¹A Ìa·©·i ¬éÃ¡Ðs“¡”a.",15,1,0,0);
    delay(1000);
    }
  if (ch=='c')
    {
    closegraph();
    exit(0);
    }
  }
}while (ch=='r');


fnsplit(buf,drive,path,name,ext);
setdisk(tolower(drive[0])-'a');     // ¬éÃ¡Ði —¡BÉ¡Ÿ¡¡ ·¡•·
chdir(buf);
setfillstyle(1,1he0);
bar(91,266,549,374);
/*   3Š¥·e ¢¹¡ˆå xµ³­e·a¡ ´sÂ‚·i Î…”a.
shhan(100,270,"¸w¥i¡ —¡BÉ¡Ÿ¡Ÿi Š¬÷ÐiŒa¶a?",15,1,0,0);
shhan(100,290,"´a“¡¡e Ñe¸ —¡BÉ¡Ÿ¡µA ¡¡– ¬éÃ¡ÐiŒa¶a",15,1,0,0);
shhan(100,310,"C:¸w¥i¡   A:¡¡–",15,1,0,0);
ch=getch();
  if (ch=='c') chapter=1;
    else chapter=0;
*/
chapter=1;
setfillstyle(1,1he1);
bar(95,195,545,255);
setfillstyle(1,15he0);
bar(100,200,540,250);
shhan(120,220,"¬éÃ¡Ÿi ¯¡¸bÐs“¡”a. ´¢ 1¦…·¡ ­¡¶a–S“¡”a.",0,15,0,0);
delay(2000);
closegraph();
clrscr();
if (cwd[2]=='\\' && cwd[3]==0)   // žËa —¡BÉ¡Ÿ¡ ÀáŸ¡
  {
  if (disk==0) strcpy(cwd2,"a:");
  if (disk==1) strcpy(cwd2,"b:");
  }
else strcpy(cwd2,cwd);
if (chapter==1)
sprintf(command,"%s%s%s%s",cwd2,"\\arj x -y ",cwd2,"\\cpp3ex");
 else sprintf(command,"%s%s%s%s",cwd2,"\\arj e -y ",cwd2,"\\cpp3ex");
result=system(command);
delay(500);
setdisk(disk);    // ÂAÁ¡ ¸b´ó —¡BÉ¡Ÿ¡¡ ¥¢ŠáÐe”a.
chdir(cwd);

initgraph(&gd,&gm,"");
setfillstyle(1,7);
bar2(0,0,getmaxx(),getmaxy());
dan(85,260,555,380,15,8,1,1);
dan(90,265,550,375,8,15,1,1);
setfillstyle(1,1he0);
bar2(91,266,549,374);
if (result==-1) {
  switch (errno) {
    case ENOMEM:shhan(100,300,"¡A¡¡Ÿ¡ˆa ¦¹¢Ðs“¡”a.",15,1,0,0);
	 break;
    case ENOENT:shhan(100,300,"Ìa·©·¡ ´ô¯s“¡”a.",15,1,0,0);
	 break;
    case E2BIG:shhan(100,300,"Ïa¡‹aœ‘·¡ á¢ Çs“¡”a.",15,1,0,0);
	 break;
    case ENOEXEC:shhan(100,300,"¯©Ð— Ìa·© µ¡ŸA·³“¡”a.",15,1,0,0);
	 break;
    }
  shhan(100,320,"arj ·AË©Ÿ¡Ë¡Ÿi ¬a¶wÐaµa »¢¸ó ¬éÃ¡Ða¯³¯¡¶a.",15,1,0,0);
  }
else
  {
  shhan(100,300,"¬éÃ¡ˆa µÅža–A´ö¯s“¡”a. ˆq¬aÐs“¡”a.",15,1,0,0);
  shhan(100,320,"µ¹A· ¬a¶w¤w¤ó·e ¥¥¢…·i Àq‰¡ Ða¯³¯¡¶a.",15,1,0,0);
  }
hom(15,5,625,195,8,15,1);
readpcx16p("won.pcx",20,10);
delay(1000);
getch();
closegraph();
}


typedef struct {
   char manufacturer;   /* pcx Ìa·© ÑÂ·¥ 0x0a */
   char version;        /* ¤á¸å¤åÑ¡ 0x05ˆa 5.0 256Äéœá */
   char encoding;       /* ·¥Å¡—· ¤w¤ó 0x01-RLL ·¥Å¡—· */
   char bpp;            /* Ï¢­I”w bit®   */
   int xmin,ymin;       /* ‹aŸ±· ¬wÐa¹Á¶ Ça‹¡ */
   int xmax,ymax;
   int hres;            /* Ð¬w•¡-¸åÑa ·£¡ˆa ´ô·q */
   int vres;
   char palette[48];    /* ÌiAËa ¸÷¥¡ */
   char reserved;       /* µ´¢        */
   char colour_planes;  /* ÏiA·¥ ˆ•® HGC=1,VGA=4 */
   int bpl;             /* º‰”w byte ® */
   int palette_type;
   char filler[58];     /* µ´¢ µwµb */
}PCXHEAD;
/* ¸ñ·i ¿¢“e ¤w¤ó·a¡ 16¬‚ pcxŸi Â‰bÐe”a.            */
/* ­¢•¡ˆa ¹¡‹q “aŸ¡”a.                                */
/* filename-Â‰bÐi pcx Ìa·©,                          */
/* x,y - Â‰bÐi ÑÁ¡e¬w· ¶áÃ¡                         */
void readpcx16p(char *filename,int x,int y)
{
FILE *fp;
PCXHEAD hd;
unsigned int width,depth;   /* ‹aŸ±· Í¢‰Á ‘¼·¡ */
unsigned int bytes;         /* º‰”w byte® */
char palette[768];          /* palette ¸÷¥¡Ÿi ”q“e ¤µi */
int i,j;                 /* ·±¯¡ ¥e®·± */
fp=fopen(filename,"rb");
if (fp==NULL){     /* Ìa·© ˆ¤wµA ¯©ÌÐa¡e exit() */
    return;
    }
fseek(fp,-769l,SEEK_END);   /* 256 ÌiUËa ¸÷¥¡ ˆñ¬a */
 if (fgetc(fp)==0x0c && fread(palette,1,768,fp)== 768)
   {
   printf("not 16 color,but 256 color\n");
   exit(0);
   }
fseek(fp,0l,SEEK_SET);
fread(&hd,1,128,fp);   /* ÑA”á ·ª·q */
if (hd.manufacturer==0x0a && hd.bpp==0x01)
    {
    if (hd.version!=0x03)   /* ÌiAËaˆa ·¶·a¡e ·ª·q */
       readpalette16(hd.palette);
    fseek(fp,128,SEEK_SET); /* ÑA”á ¤a¡ ”a·q ¦Èá ·ª·q */
    for (i=0;i<hd.ymax-hd.ymin+1;i++)
       readline16p(fp,hd.bpl,x,y+i);
    }
}
/* 16¬‚ pcx Ìa·©µA¬á ÌiUËa¸÷¥¡Ÿi ·ª´á ÌiUËaŸi settingÐe”a. */
void readpalette16(char *pal_buf)
{
int i;
struct REGPACK reg;
/* ÌiAËa· ¬w¶á 6byte e ¬a¶wÐe”a. */
return;
for (i=0;i<48;i++) pal_buf[i]>>=2;
for (i=0;i<16;i++)
    {
    reg.r_ax=0x1000;
    reg.r_bx=i*256+i;
    intr(0x10,&reg);
    }
reg.r_ax=0x1012;
reg.r_bx=0;
reg.r_cx=16;
reg.r_es=FP_SEG(pal_buf);
reg.r_dx=FP_OFF(pal_buf);
intr(0x10,&reg);
}
/* readpcx16pµA¬á ¬a¶wÐa“e ¬á§ažË¥,Ðeº‰·i Â‰bÐº…”a. */
/* fp=Â‰bÐi pcx Ìa·©, len= º‰”w byte ®               */
/* x,y - Â‰bÐi ÑÁ¡e¬w· ¶áÃ¡                          */
void readline16p(FILE *fp,int len,int x,int y)
{
int i,j,k,n;     /* ·±¯¡ ¥e®—i */
char temp[1040]; /* ·±¯¡ ¤áÌá */
char col[1040];
n=0;
do
{
  i=fgetc(fp);
/* ´aœ ¬é¡w: ´sÂ‚·¥ ‰w¶ Ða¶á 6 bitŸi iµA ý‰¡ */
/* ‹a ”a·q byteŸi ·ª´á —iµa jµA ý·e Ò jŸi i¤å */
/* ¤e¥¢Ð¬á ¤áÌáµA »³´á ý“e”a. ´sÂ‚·i Î“e   */
/* ‰Á¸÷·¡”a.                                    */
  if ((i&0xc0)==0xc0)       /* ´sÂ‚·¥ ‰w¶ */
    {
    i=i&0x3f;
    j=fgetc(fp);
    while(i--) temp[n++]=j;
    }
    else
    { temp[n++]=i; }     /* ´sÂ‚·¡ ´a“¥ ‰w¶ */
} while (n<len*4);   /* ÐeŒá¤åµA 4plane·i ·ª·q */
for (i=0;i<640;i++) col[i]=0;  /* ¤áÌáŸi »¡¶‘ */
for (i=0;i<4;i++)       /* ÏiA·¥ */
  for (j=0;j<len;j++)     /* ®Íw ¤a·¡Ëa */
    for (k=7;k>=0;k--)     /* §¡Ëa        */
      if (temp[j+i*len]&(1<<k)) col[j*8+7-k]|=(1<<i);
for (i=0;i<len*8;i++)      /* col¤µiµA µÅ¬÷–E ‹aŸ±·i Â‰bÐe”a.*/
  putpixel(x++,y,col[i]);    /* Â‰b ”e¶á“e Ðeº‰·¡”a.            */
}
/* ¦‰²‚ Êá´áaµÁ ·¶“e ´·ˆb·i  e—e”a.                      */
 void dan(int x1,int y1,int x2,int y2,int upcolor,int downcolor,int num,int gap)
 {
 int i,j=0;
 for (i=0;i<num;i++){
 setcolor(upcolor);line(x1-j,y1-j,x1-j,y2+j);line(x1-j,y1-j,x2+j,y1-j);
 setcolor(downcolor);line(x2+j,y2+j,x2+j,y1-j);line(x2+j,y2+j,x1-j,y2+j);
 j+=gap;
 }
 }
/* VGAµA¬á ²‚—i´áˆa ·¶“e Ðe º‰·i  e—e”a.Ó…¬‚‰Á ¤aÈw¥¡”a »¥Ðe¬‚·i */
/* ´aœ¶á¡ ¬aˆbÑw e ‹aaº¡e –E”a.                              */
/* ·¥®“e DAN‰Á ™¢ ˆ{»¡ e gap·e ´ô”a.                            */

void hom(int x1,int y1,int x2,int y2,int upcolor,int downcolor,int num)
{
int i;
for (i=0;i<num;i++)
{
setcolor(upcolor);
rectangle(x1+i,y1+i,x2+i,y2+i);
setcolor(downcolor);
rectangle(x1+i+num,y1+i+num,x2+i+num,y2+i+num);
}
}

void bar2(int l,int t,int r,int b)
{
int i;
int incx=(r-l)/20;
int incy=(b-t)/20;
int cx=(r+l)/2;
int cy=(b+t)/2;
for (i=1;i<10;i++)
  {
  bar(cx-incx*i,cy-incy*i,cx+incx*i,cy+incy*i);
  delay(50);
  }
bar(l,t,r,b);
}
