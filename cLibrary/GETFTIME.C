#include <stdio.h>
#include <io.h>
#include <stdlib.h>
#include <fcntl.h>
void main(void)
{
int handle;
struct ftime ft;
handle=open("c:\\command.com",O_RDONLY | O_BINARY);
if (handle==-1)
   {
   printf("file not found\n");
   exit(0);
   }
getftime(handle, &ft);
printf("\nCOMMAND.COM's\n");
printf("File time: %u:%u:%u\n",
      ft.ft_hour, ft.ft_min,ft.ft_tsec * 2);
printf("File date: %u/%u/%u\n",
      ft.ft_month, ft.ft_day,ft.ft_year+1980);
close(handle);
}
