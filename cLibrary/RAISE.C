/* This example installs a signal handler routine for SIGFPE,
   catches an integer overflow condition, makes an adjustment
   to AX register, and returns.  This example program MAY cause
   your computer to crash, and will produce runtime errors
   depending on which memory model is used.
*/

#pragma inline
#include <stdio.h>
#include <signal.h>

#ifdef __cplusplus
   typedef void (*fptr)(int);
#else
   typedef void (*fptr)();
#endif


void Catcher(int *reglist)
{
   printf("Caught it!\n"); *(reglist + 8) = 3; /* make return 
AX = 3 */
}

int main(void)
{
   signal(SIGFPE, (fptr)Catcher);  /* cast Catcher to 
appropriate type */
   asm     mov     ax,07FFFH       /* AX = 32767 */
   asm     inc     ax              /* cause overflow */
   asm     into                    /* activate handler */

   /* The handler set AX to 3 on return. If that hadn't 
happened,
      there would have been another exception when the next 
'into'
      was executed after the 'dec' instruction. */
   asm     dec     ax              /* no overflow now */
   asm     into                    /* doesn't activate */
   return 0;
}
