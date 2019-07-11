 #include <stdio.h>
 #include <string.h>
 #include <alloc.h>

int main(void)
 {
    char *dup, *string = "twin string";
    dup = strdup(string);
    printf("%s\n", dup);
    free(dup);
    return 0;
 }
