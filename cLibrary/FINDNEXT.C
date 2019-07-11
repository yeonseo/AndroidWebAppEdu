#include <dir.h>
#include <dos.h>
#include <stdio.h>
#include <stdlib.h>
void main()
{
struct ffblk exe;      // file검색을 위한 구조체 정의
int flag;              // 검색 결과 보관
int total=0;           // 총 검색된 file의 갯수
flag=findfirst("*.exe",&exe,~FA_HIDDEN);
if (flag==-1) {        // file이 하나도 없을 경우
  printf("EXE file Not found !!  Merong! \n");
  exit(0);
  }
printf ("\nEXE file finder\n\n");
while (!flag) {        // 더이상 없을 때까지 계속 찾음
  total++;
  printf("%s\n",exe.ff_name);
  flag=findnext(&exe);     // 다음 file을 찾음
  }
printf("\ntotal EXE file is %d files\n",total);
}
