/*
//움직이는 글자 광고판 프로그램


#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <Windows.h>

void moving_character_signboard(char file_name[], int line_length);
void gotoxy(int x, int y);
void draw_rectangle(int c, int r);

int main(void)
{
        char file_name[20];
		int line_length, repeat;
        printf("움직이는 글자 광고판\n\n");
        printf("광고내용이 들어있는 파일 이름을\n");
        printf("입력하고 Enter>");
        scanf("%s", file_name);
        printf("광고판에 표시할 문자수를 \n");
        printf("입력하고 Enter>");
        scanf("%d", &line_length);
        do
        {
               printf("반복 횟수 입력(1번 이상) >");
               scanf("%d", &repeat);
        } while (repeat < 1);

        for(int i=0; i<repeat; i++)
               moving_character_signboard(file_name, line_length);
        return 0;
}

 

void gotoxy(int x, int y)
{
        COORD Pos = { x - 1, y - 1 };
        SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), Pos);
}



//움직이는 글자의 광고판 출력 함수 moving_character_signboard

void moving_character_signboard(char file_name[], int line_length)
{
        char *ptr, chr[121];
        int i, j, length, count = 0, countx;
        FILE *fp;
        ptr = (char*)malloc(line_length);
        gotoxy(1, 9);
        draw_rectangle(line_length / 2, 1);
        fp = fopen(file_name, "r");
        if (fp == NULL)
        {
               printf("file open error!");
               exit(1);
        }
        while (!feof(fp))
        {
               //파일로부터 1줄을 읽어들여 배열 chr에 저장
               fgets(chr, 120, fp);
               length = strlen(chr); //length는 읽어들인 문자열의 전체 길이
               ptr[line_length] = '\0'; //동적으로 할당한 포인터 ptr의 제일 마지막 부분에 NULL 삽입
               for (j = 0; j < line_length; j++) //0에서부터 line_length까지 반복

               {
                       count = 0;
                       for (i = 0; i < line_length - j - 1; i++)  //앞부분에 공백 삽입
                              ptr[i] = ' ';

                       for (i = line_length - j - 1; i < line_length; i++) //뒷부분에 chr의 문자를 이동하여 ptr에 저장

                       {

                              ptr[i] = chr[count];

                              count++;

                       }

                       gotoxy(3, 10); //화면의 적절한 위치로 이동

                       Sleep(200); //시간지연

                       printf("%s", ptr); //포인터에 저장된 문자열 출력

               }

               count = 1; //화면에 표시할 다음문자의 위치를 1로 함, 즉 chr[1]을 화면에 출력할 첫번째 문자로 지정

               for (j = line_length - 2;j < length; j++)

               {

                       countx = 0;

                       //화면에 출력할 문자열의 개수만큼 배열 chr[]에 저장된 문자들을 오른쪽에서 왼쪽으로 이동하여 포인터 ptr에 저장

                       for (i = count; i < count + line_length; i++)

                       {

                              ptr[countx] = chr[i];

                              countx++;

                       }

                       count++;

                       if ((length - line_length) <= count) //배열 chr[]에 저장된 마지막 line_length개 이전까지만 위의 과정을 반복

                              break;

                       gotoxy(3, 10);

                       Sleep(200);

                       printf("%s", ptr);

               }

               for (j = 0; j < line_length; j++) //line_length번만큼 다음 문장을 반복

               {

                       for (i = 0; i < line_length - j - 1; i++) //마지막 포인터 ptr에 저장된 문자들을 왼쪽 방향으로 이동

                              ptr[i] = ptr[i + 1];

                       for (i = line_length - j - 1; i < line_length; i++) //이동할때마다 오른쪽에는 공백을 저장

                              ptr[i] = ' ';

                       gotoxy(3, 10);

                       Sleep(200);

                       printf("%s", ptr);

               }

        }

        gotoxy(1, 12);

        fclose(fp);

}

 


//직사각형 그리기 함수


void draw_rectangle(int c, int r)

{

        int i, j;

        unsigned char a = 0xa6;

        unsigned char b[7];

        for (i = 1; i < 7; i++)

               b[i] = 0xa0 + i;

 

        printf("%c%c", a, b[3]);

        for (i = 0; i < c; i++)

               printf("%c%c", a, b[1]);

        printf("%c%c", a, b[4]);

        printf("\n");

        for (i = 0; i < r; i++)

        {

               printf("%c%c", a, b[2]);

               for (j = 0; j < c; j++)

                       printf("  ");;

               printf("%c%c", a, b[2]);

               printf("\n");

        }

        printf("%c%c", a, b[6]);

        for (i = 0; i < c; i++)

               printf("%c%c", a, b[1]);

        printf("%c%c", a, b[5]);

        printf("\n");

}//*/