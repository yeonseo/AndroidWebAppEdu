#include <io.h>
#include <fcntl.h>
#include <sys\stat.h>
#include <process.h>
#include <share.h>
#include <stdio.h>
void main(void)
{
   int handle, status;
   long length;
   handle = sopen("c:\\autoexec.bat",
      O_RDONLY,SH_DENYNO,S_IREAD);
   length = filelength(handle);
   status = lock(handle,0L,length/2);
   if (status == 0)
      printf("lock succeeded\n");
   else
      printf("lock failed\n");
   status = unlock(handle,0L,length/2);
   if (status == 0)
      printf("unlock succeeded\n");
   else
      printf("unlock failed\n");
   close(handle);
}
