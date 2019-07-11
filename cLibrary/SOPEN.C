 #include <io.h>
 #include <fcntl.h>
 #include <sys\stat.h>
 #include <process.h>
 #include <share.h>
 #include <stdio.h>

 int main(void)
 {
    int handle;
    int status;

    handle = sopen("c:\\autoexec.bat", O_RDONLY, SH_DENYNO, 
S_IREAD);

    if (!handle)
    {
       printf("sopen failed\n");
       exit(1);
    }

    status = access("c:\\autoexec.bat", 6);
    if (status == 0)
       printf("read/write access allowed\n");
    else
       printf("read/write access not allowed\n");

    close(handle);
    return 0;
}
