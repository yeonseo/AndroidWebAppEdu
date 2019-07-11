#include <sys\stat.h>
#include <string.h>
#include <fcntl.h>
#include <io.h>
void main(void)
{
  #define STDOUT 1
  int nul, oldstdout;
  char msg[] = "This is a test";
  nul = open("DUMMY.FIL", O_CREAT | O_RDWR,
     S_IREAD | S_IWRITE);
  oldstdout = dup(STDOUT);
  dup2(nul, STDOUT);
  close(nul);
  write(STDOUT, msg, strlen(msg));
  dup2(oldstdout, STDOUT);
  close(oldstdout);
}
