///*
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <Windows.h>
#define MAX 10000
#define MIN 0
int number=0, flag=0, total=0;
int price[6]={1000,1500,1500,2000,500,500};
char *menu[6]={"�Ƹ޸�ī��", "ī���","���̽� �Ƹ޸�ī��", "���̽� ī���", "�ݶ�", "���̴�"};
void print_menu(void);
int input_number(void);
char input_select(void);
int random_balance(void);
void order_complete(void);
void minus_balance(void);
void return_charge(void);
int more_price(void);
int more_order(void);
void print_balance(void);
void print_charge(void);
void input_card(void);
void select_menu(void);
void select_pay(void);
void put_money(void);
void order_question(void);
void wrong_messege(void);
void greeting(void);
void card_paying(void);
void card_paid(void);
void paid_receipt(void);
void get_receipt(void);
void card_overdraw(void);
int main()
{
	char select=0;

	for(;;)
	{
		print_menu();
		select_pay();
		switch(number) ///YS switch
		{
		case 1:
			for(;;)
			{
				if(flag==1)
				{
					flag=0;
					break;
				}
				put_money();
				number=input_number();
				if(number==0)
				{
					return_charge();
					Sleep(1000);
					break;
				}
				if(number==500 || number==1000 || number==5000 || number==10000)
				{
					total=total+number;
					print_charge();
					flag=more_price();
				}
				else
				{
					total=total+0;
					wrong_messege();
					print_charge();
					continue;
				}
				if(flag==1)
				{
					flag=0;
					for(;;)
					{
						select_menu();
						number=input_number();
						if(number==0)
						{
							return_charge();
							Sleep(1000);
							flag=1;
							break;
						}
						if(number<1 || number>6) continue;
						total=total-price[number-1];
						if(total>=0)
						{
							order_complete();
							number=0;///YS
							Sleep(1000);
							print_balance();
							//print_charge();
							order_question();
							select=input_select();
							if(select=='y' || select=='Y')
							{
								if(total==0)
								{
									print_balance();
									break;
								}
							}
							else if(select=='n' || select=='N')
							{
								return_charge();
								total=0;
								greeting();
								Sleep(1000);
								flag=1;
								break;
							}
							else break;
						}
						else

						{
							total=total+price[number-1];
							minus_balance();
							break;
						}
					}//end of for:���ἱ��
				}//if(flag==1)
			}//end of for: �����Է�
		case 2:
			input_card();
			for(;;)
			{
				if(flag==1)
				{
					flag=0;
					break;
				}
				select_menu();
				number=input_number();
				if(number<1 || number>6) continue;
				card_paying();
				Sleep(2000);
				total=total-price[number-1];
				if(total>=0)
				{
					card_paid();
					paid_receipt();
					select=input_select();

					if(select=='y' || select=='Y')
					{
						Sleep(2000);
						get_receipt();
						Sleep(1000);
						order_complete();
						flag=more_order();
					}
					else if(select=='n' || select=='N')
					{
						order_complete();
						flag=more_order();
					}
					else continue;

				}//if(total>=0)
				else
				{
					card_overdraw();
					break;
				}
			}//end of for: ���ἱ��
		}///YS end of switch
	}//end of for: ��ü
	return 0;
}

void print_menu(void)
{
	printf("\n");
	printf("****************************�޴�***************************\n");
	printf("|=============||=====================|====================|\n");
	printf("| �߰ſ� Ŀ�� ||     1.�Ƹ޸�ī��    |     2. ī���	  |\n");
	printf("|             ||       [1000��]      |       [1500��]     |\n");
	printf("|-------------||---------------------|--------------------|\n");
	printf("| ������ Ŀ�� || 3.���̽� �Ƹ޸�ī�� | 4. ���̽� ī��� |\n");
	printf("|             ||       [1500��]      |       [2000��]     |\n");
	printf("|-------------||---------------------|--------------------|\n");
	printf("|  ź������   ||     5.��      ��    |     6.�� �� ��     |\n");
	printf("|             ||        [500��]      |       [500��]      |\n");
	printf("|=============||=====================|====================|\n");
	printf("  0.�ܵ���ȯ \n");
	printf("\n");
	printf("�������!\n");
	return;
}
int input_number(void)
{
	number=0; ///YS
	scanf("%d",&number);
	while(getchar()!='\n');
	return number;
}
char input_select(void)
{
	char select=0;
	scanf("%c",&select);
	while(getchar()!='\n');
	return select;
}
int random_balance(void)
{
	srand((unsigned)time(NULL));
	total=rand()%(MAX-MIN+1)+MIN;
	return total;
}
void order_question(void)
{
	printf("�߰� �ֹ��� �Ͻðڽ��ϱ�?(Y/N): ");
	return;
}
void order_complete(void)
{
	printf("~~~���� �غ���~~~\n");
	Sleep(3000);
	printf("%s�� �غ�Ǿ����ϴ�. ���ְ� �弼��!\n",menu[number-1]);
	return;
}
void minus_balance(void)
{
	printf("�ݾ��� �����մϴ�. ���� �ܾ��� %d���Դϴ�. �ݾ��� �� �־� �ּ���.\n",total);
	return;
}
void return_charge(void)
{
	printf("�ܵ� %d���� ��ȯ�մϴ�.\n", total);
	return;
}
int more_price(void)
{
	char select=0;
	do
	{
		printf("�ݾ��� �� �Է��Ͻðڽ��ϱ�?(Y/N): ");
		select=input_select();
		if(select=='y' || select=='Y') break;
		else if(select=='n' || select=='N')
		{
			flag=1;
			break;
		}
	}while(select!='y' && select!='Y' && select!='n' && select!='N');
	return flag;
}
int more_order(void)
{
	char select=0;
	for(;;)
	{
		printf("�� �ֹ��Ͻðڽ��ϱ�?(Y/N): ");
		select=input_select();
		if(select=='y' || select=='Y')
		{
			break;
		}
		else if (select=='n' || select=='N')
		{
			printf("�̿����ּż� �����մϴ�.\n");
			Sleep(1000);
			flag=1;
			total=0;
			break;
		}
		else continue;
	}
	return flag;
}
void print_charge(void)
{
	printf("���� �Է��Ͻ� �ݾ��� �� %d�� �Դϴ�. ",total);
	return;
}
void print_balance(void)
{
	printf("���� �ܾ��� �� %d�� �Դϴ�.\n",total);
	return;
}
void input_card(void)
{
	char select=0;
	do
	{
		printf("Y�� ���� ī�带 �־��ּ���: ");
		select=input_select();
		total=random_balance();
	}while(select!='y'&& select!='Y');
	return;
}
void select_menu(void)
{
	printf("���Ḧ ������ �ּ���(1~6): ");
	//return; ///YS
}
void select_pay(void)
{
	do
	{
		printf("���� ����� ������ �ּ���(1.����/2.ī��):");
		number=input_number();
	}while(number<0 || number>2);
	return;
}
void put_money(void)
{
	printf("�ݾ��� �Է��� �ּ���(500,1000,5000,10000�� �� �̿�):");
	return;
}
void wrong_messege(void)
{
	printf("�߸��� �Է� �����Դϴ�.\n");
	return;
}
void greeting(void)
{
	printf("�̿����ּż� �����մϴ�.\n");
	return;
}
void card_paying(void)
{
	printf("���� ���Դϴ�. ī�带 �������� ������...\n");
	return;
}
void card_paid(void)
{
	printf("������ �Ϸ�Ǿ����ϴ�. ī�带 ��������.\n");
	return;
}
void paid_receipt(void)
{
	printf("�������� ����Ͻðڽ��ϱ�?(Y/N):");
	return;
}
void get_receipt(void)
{
	printf("�������� ��������.\n");
	return;
}
void card_overdraw(void)
{
	printf("�ܾ��� �����մϴ�. ī�带 ��������.\n");
	return;
}
//*/