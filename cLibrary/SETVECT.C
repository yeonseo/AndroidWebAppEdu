#include <dos.h>
void interrupt (*oldhandler)(...);     // 이전 ISR 보관
void interrupt handler(...)    // 이 함수가 새로운 ISR    
{
static int count;
count++;
count %=10;
  poke(0xb800,80*2*11-2,0x7900+count+'0');
oldhandler();
}
void main(void)
{
oldhandler=getvect(0x1c);
setvect(0x1c,handler);          // 인터럽트 설정
keep(0,(_SS+(_SP>>4)-_psp));    // 상주 종료
}
