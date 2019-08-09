///*
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <Windows.h>
#define MAX 10000
#define MIN 0
int number=0, flag=0, total=0;
int price[6]={1000,1500,1500,2000,500,500};
char *menu[6]={"아메리카노", "카페라떼","아이스 아메리카노", "아이스 카페라떼", "콜라", "사이다"};
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
					}//end of for:음료선택
				}//if(flag==1)
			}//end of for: 현금입력
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
			}//end of for: 음료선택
		}///YS end of switch
	}//end of for: 전체
	return 0;
}

void print_menu(void)
{
	printf("\n");
	printf("****************************메뉴***************************\n");
	printf("|=============||=====================|====================|\n");
	printf("| 뜨거운 커피 ||     1.아메리카노    |     2. 카페라떼	  |\n");
	printf("|             ||       [1000원]      |       [1500원]     |\n");
	printf("|-------------||---------------------|--------------------|\n");
	printf("| 차가운 커피 || 3.아이스 아메리카노 | 4. 아이스 카페라떼 |\n");
	printf("|             ||       [1500원]      |       [2000원]     |\n");
	printf("|-------------||---------------------|--------------------|\n");
	printf("|  탄산음료   ||     5.콜      라    |     6.사 이 다     |\n");
	printf("|             ||        [500원]      |       [500원]      |\n");
	printf("|=============||=====================|====================|\n");
	printf("  0.잔돈반환 \n");
	printf("\n");
	printf("어서오세요!\n");
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
	printf("추가 주문을 하시겠습니까?(Y/N): ");
	return;
}
void order_complete(void)
{
	printf("~~~음료 준비중~~~\n");
	Sleep(3000);
	printf("%s가 준비되었습니다. 맛있게 드세요!\n",menu[number-1]);
	return;
}
void minus_balance(void)
{
	printf("금액이 부족합니다. 현재 잔액은 %d원입니다. 금액을 더 넣어 주세요.\n",total);
	return;
}
void return_charge(void)
{
	printf("잔돈 %d원을 반환합니다.\n", total);
	return;
}
int more_price(void)
{
	char select=0;
	do
	{
		printf("금액을 더 입력하시겠습니까?(Y/N): ");
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
		printf("더 주문하시겠습니까?(Y/N): ");
		select=input_select();
		if(select=='y' || select=='Y')
		{
			break;
		}
		else if (select=='n' || select=='N')
		{
			printf("이용해주셔서 감사합니다.\n");
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
	printf("현재 입력하신 금액은 총 %d원 입니다. ",total);
	return;
}
void print_balance(void)
{
	printf("현재 잔액은 총 %d원 입니다.\n",total);
	return;
}
void input_card(void)
{
	char select=0;
	do
	{
		printf("Y를 눌러 카드를 넣어주세요: ");
		select=input_select();
		total=random_balance();
	}while(select!='y'&& select!='Y');
	return;
}
void select_menu(void)
{
	printf("음료를 선택해 주세요(1~6): ");
	//return; ///YS
}
void select_pay(void)
{
	do
	{
		printf("결제 방식을 선택해 주세요(1.현금/2.카드):");
		number=input_number();
	}while(number<0 || number>2);
	return;
}
void put_money(void)
{
	printf("금액을 입력해 주세요(500,1000,5000,10000원 권 이용):");
	return;
}
void wrong_messege(void)
{
	printf("잘못된 입력 단위입니다.\n");
	return;
}
void greeting(void)
{
	printf("이용해주셔서 감사합니다.\n");
	return;
}
void card_paying(void)
{
	printf("결제 중입니다. 카드를 제거하지 마세요...\n");
	return;
}
void card_paid(void)
{
	printf("결제가 완료되었습니다. 카드를 받으세요.\n");
	return;
}
void paid_receipt(void)
{
	printf("영수증을 출력하시겠습니까?(Y/N):");
	return;
}
void get_receipt(void)
{
	printf("영수증을 받으세요.\n");
	return;
}
void card_overdraw(void)
{
	printf("잔액이 부족합니다. 카드를 받으세요.\n");
	return;
}
//*/