/*
//�����̴� ���� ������ ���α׷�


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
        printf("�����̴� ���� ������\n\n");
        printf("�������� ����ִ� ���� �̸���\n");
        printf("�Է��ϰ� Enter>");
        scanf("%s", file_name);
        printf("�����ǿ� ǥ���� ���ڼ��� \n");
        printf("�Է��ϰ� Enter>");
        scanf("%d", &line_length);
        do
        {
               printf("�ݺ� Ƚ�� �Է�(1�� �̻�) >");
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



//�����̴� ������ ������ ��� �Լ� moving_character_signboard

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
               //���Ϸκ��� 1���� �о�鿩 �迭 chr�� ����
               fgets(chr, 120, fp);
               length = strlen(chr); //length�� �о���� ���ڿ��� ��ü ����
               ptr[line_length] = '\0'; //�������� �Ҵ��� ������ ptr�� ���� ������ �κп� NULL ����
               for (j = 0; j < line_length; j++) //0�������� line_length���� �ݺ�

               {
                       count = 0;
                       for (i = 0; i < line_length - j - 1; i++)  //�պκп� ���� ����
                              ptr[i] = ' ';

                       for (i = line_length - j - 1; i < line_length; i++) //�޺κп� chr�� ���ڸ� �̵��Ͽ� ptr�� ����

                       {

                              ptr[i] = chr[count];

                              count++;

                       }

                       gotoxy(3, 10); //ȭ���� ������ ��ġ�� �̵�

                       Sleep(200); //�ð�����

                       printf("%s", ptr); //�����Ϳ� ����� ���ڿ� ���

               }

               count = 1; //ȭ�鿡 ǥ���� ���������� ��ġ�� 1�� ��, �� chr[1]�� ȭ�鿡 ����� ù��° ���ڷ� ����

               for (j = line_length - 2;j < length; j++)

               {

                       countx = 0;

                       //ȭ�鿡 ����� ���ڿ��� ������ŭ �迭 chr[]�� ����� ���ڵ��� �����ʿ��� �������� �̵��Ͽ� ������ ptr�� ����

                       for (i = count; i < count + line_length; i++)

                       {

                              ptr[countx] = chr[i];

                              countx++;

                       }

                       count++;

                       if ((length - line_length) <= count) //�迭 chr[]�� ����� ������ line_length�� ���������� ���� ������ �ݺ�

                              break;

                       gotoxy(3, 10);

                       Sleep(200);

                       printf("%s", ptr);

               }

               for (j = 0; j < line_length; j++) //line_length����ŭ ���� ������ �ݺ�

               {

                       for (i = 0; i < line_length - j - 1; i++) //������ ������ ptr�� ����� ���ڵ��� ���� �������� �̵�

                              ptr[i] = ptr[i + 1];

                       for (i = line_length - j - 1; i < line_length; i++) //�̵��Ҷ����� �����ʿ��� ������ ����

                              ptr[i] = ' ';

                       gotoxy(3, 10);

                       Sleep(200);

                       printf("%s", ptr);

               }

        }

        gotoxy(1, 12);

        fclose(fp);

}

 


//���簢�� �׸��� �Լ�


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