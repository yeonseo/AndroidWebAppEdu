/*
#include <stdio.h>
#include <windows.h>

//salade
char* saladeName[5] = { " ","�⺻(�ʼ�)","�丶��","�ø���","��Ʈ" };
int saladePrice[5] = { 0,1500,500,500,500 };
int saladeStore[5]={0,10,10,10,10};  //��ǰ�� ���� ��ȣ�� �迭 ��ȣ�� �����ֱ� ���ؼ� [0]ĭ�� ���� NULL�ΰ����� �ϳ� �����.
int saladeUser[5] = {0,};

char* sourceName[5] = { " ","�߻��&�ø���","�ø������","��ϸӽ�Ÿ��","ĥ��" };
int sourcePrice[5] = { 0,1000,500,500,500 };
int sourceStore[5] = { 0,10,10,10,10 };  //��ǰ�� ���� ��ȣ�� �迭 ��ȣ�� �����ֱ� ���ؼ� [0]ĭ�� ���� NULL�ΰ����� �ϳ� �����.
int sourceUser[5] = {0,};

char* toppingName[5] = { " ","���","�����߰�����","�����߰�����","��������" };
int toppingPrice[5] = { 0,1000,500,500,500 };
int toppingStore[5] = { 0,10,10,10,10 };  //��ǰ�� ���� ��ȣ�� �迭 ��ȣ�� �����ֱ� ���ؼ� [0]ĭ�� ���� NULL�ΰ����� �ϳ� �����.
int toppingUser[5] = {0,};

//ī��� ����
int payCard = 150000;
int payCoin = 0;
int payValue = 0;

//�Է¹ޱ�
int selectMenu=' ';
int input_char();
int input_int();

//�޴� ȭ�� ����
void select_menu_print(void);
//��ǰ������
void salade_menu_print(void);
void topping_menu_print(void);
void source_menu_print(void);
void user_collection(void);
//������� ����
void pay_menu_print(void);
void pay_coin(void);
void pay_card(void);
void salade_out(void);
void user_default(void);
int main(void)
{
	for(;;)
	{
		select_menu_print();
		pay_menu_print();
		printf("\n\n\n\n\n\n");
		user_default();
	}
	return 0;
}
//�Է¹ޱ�
int input_char(void)
{
	selectMenu=0;
	while(getchar()!='\n');
	scanf("%c",&selectMenu);
	return selectMenu;
}
int input_int(void)
{
	selectMenu=0;
	scanf("%d",&selectMenu);
	return selectMenu;
}
//�޴� ȭ�� ����
void select_menu_print(void)
{
	printf("��                   *������ �����*                   ��\n");
	printf("��     ���ϴ� ���� ������ �����带 ����� �Ծ��     ��\n");
	printf("�ڰ��� ���������� ��ٱ��Ͽ� ���� �޴��� ������ �ּ���.��\n");
	printf("�ڸ�� ������ ���� �Ŀ�, E.��������(���)�� �����մϴ�.��\n");
	printf("��                                                     ��\n");
	printf("��     A.ä��, B.����, C.�ҽ� �Է�  E.��������(���)   ��\n");
	printf("�������� ���� : ");
	
	for(;;)
	{
		selectMenu=input_char();
		switch(selectMenu)
		{
		case 65 : case 97 : salade_menu_print(); break;
		case 66 : case 98 : topping_menu_print(); break;
		case 67 : case 99 : source_menu_print(); break;
		default : printf("������ �̵��� 'A', 'B', 'C', 'E' �߿� �Է����ּ���.");
		}
		if(selectMenu==69||selectMenu==101) break;
		selectMenu=0;
	}
}
//��ǰ ������
void salade_menu_print(void)
{
	int i=0;
	printf("*********************************\n");
	printf("*             ä ��             *\n");
	printf("*********************************\n");

	for(i=1 ; i<5 ; i++) printf("%d. %14s  : %5d�� (�������� : %2d) \n",i, saladeName[i], saladePrice[i], saladeStore[i]-saladeUser[i]);
	printf("1-4 �� �޴� �߿��� �޴��� ����ּ���.( 0 : ���� ȭ��)\n");
	printf("\n*���� ��ٱ���*\n");
	for(i=0;i<5;i++)
	{
		if(saladeUser[i]!=0) printf("%14s : %2d��\n",saladeName[i],saladeUser[i]);
	}
	selectMenu=input_int();
	if(selectMenu!=0)
	{
		saladeUser[selectMenu]++;
		salade_menu_print();
	}
	if(selectMenu==0) select_menu_print();
}
void topping_menu_print(void)
{
	int i=0;
	printf("*********************************\n");
	printf("*             �� ��             *\n");
	printf("*********************************\n");

	for(i=1 ; i<5 ; i++) printf("%d. %14s  : %5d�� (�������� : %2d) \n",i, toppingName[i], toppingPrice[i], toppingStore[i]-toppingUser[i]);
	printf("1-4 �� �޴� �߿��� �޴��� ����ּ���.( 0 : ���� ȭ��)\n");
	printf("\n*���� ��ٱ���*\n");
	for(i=0;i<5;i++)
	{
		if(toppingUser[i]!=0) printf("%14s : %2d��\n",toppingName[i],toppingUser[i]);
	}
	selectMenu=input_int();
	if(selectMenu!=0)
	{
		toppingUser[selectMenu]++;
		topping_menu_print();
	}
	if(selectMenu==0) select_menu_print();
}
void source_menu_print(void)
{
	int i=0;
	
	printf("*********************************\n");
	printf("*             �� ��             *\n");
	printf("*********************************\n");

	for(i=1 ; i<5 ; i++) printf("%d. %14s  : %5d�� (�������� : %2d) \n",i, sourceName[i], sourcePrice[i], sourceStore[i]-sourceUser[i]);
	printf("1-4 �� �޴� �߿��� �޴��� ����ּ���.( 0 : ���� ȭ��)\n");
	printf("\n*���� ��ٱ���*\n");
	for(i=0;i<5;i++)
	{
		if(sourceUser[i]!=0) printf("%14s : %2d��\n",sourceName[i],sourceUser[i]);
	}
	selectMenu=input_int();
	if(selectMenu!=0)
	{
		sourceUser[selectMenu]++;
		source_menu_print();
	}
	if(selectMenu==0) select_menu_print();
}
void user_collection(void)
{
	int i=0;
	for(i=1;i<5;i++)
	{
		if(saladeUser[i]!=0) payValue=payValue+saladePrice[i]*saladeUser[i];
		if(toppingUser[i]!=0) payValue=payValue+toppingPrice[i]*toppingUser[i];
		if(sourceUser[i]!=0) payValue=payValue+sourcePrice[i]*sourceUser[i];
	}
	printf("\n**********ä��**********\n");
	for(i=1;i<5;i++)
	{
		if(saladeUser[i]!=0) printf("%14s : %2d��\n",saladeName[i],saladeUser[i]);
	}
	printf("\n**********����**********\n");
	for(i=1;i<5;i++)
	{
		if(toppingUser[i]!=0) printf("%14s : %2d��\n",toppingName[i],toppingUser[i]);
	}
	printf("\n**********�ҽ�**********\n");
	for(i=1;i<5;i++)
	{
		if(sourceUser[i]!=0) printf("%14s : %2d��\n",sourceName[i],sourceUser[i]);
	}
}
//������� ����
void pay_menu_print(void)
{
	user_collection();
	for(;;)
	{
		int flag=0;
		printf("\n*�� �����ݾ� : %10d�� *�� ���Ա޾� : %10d��\n\n",payValue,payCoin);
	
		printf("��������� ������ �ּ���.\n1.���� 2.ī��   : ");
		selectMenu=input_int();
		switch (selectMenu)
		{
		case 1: printf("����");pay_coin(); if(payCoin>=payValue) flag=1; break;
		case 2: printf("ī��");pay_card(); if(payCard>=payValue) flag=1; break;
		case 123456789: break;//�����ڸ��
		}
		if(flag==1)
		{
			salade_out(); break;
		}
		printf("�����ݾ��� ���ڸ��ϴ�. ���縦 �ٽ� �����Ͻý��ϱ�?\n(1:�������� 2:����) : ");
		selectMenu=input_int();
		if(selectMenu==1) continue;
		else break;
	}//end of for
}
void pay_coin(void)
{
	for( ; ; )
	{
		int inputMoney=0;
		printf("\n���� ���Աݾ� : %5d\n",payCoin);
		printf("���� ���� ȭ�� : 100,500,1000,5000,10000");
		printf("������ �ݾ��� �Է��ϼ��� : ");
		
		inputMoney=input_int(); 
		switch(inputMoney)
		{
		case 100: case 500: case 1000: case 5000: case 10000:
			payCoin=payCoin+inputMoney; break;
		default: printf("\a������������:-0\n��� �Է��Ͻ� %d�� ��ȿ�Դϴ�!\n",inputMoney); break;
		}
		printf("�ݾ��� �Է��Ͻðڽ��ϱ�?����� ���� �ФФ�");
		selectMenu=input_char();
		printf("%d %c",selectMenu,selectMenu);
		if(selectMenu==89||selectMenu==121) continue;
		else break;
	}
}
void pay_card(void)
{
	for( ; ; )
	{
		int inputMoney=0, payCardNumber=0, payCardPassword=0,flag=0;
		printf("\n���� ���Աݾ� : %5d\n",inputMoney);
		printf("ī�� ��ȣ�� �Է����ּ���.(16�ڸ�)\n");
		payCardNumber=input_int();
		printf("��й�ȣ�� �Է����ּ���.(4�ڸ�)\n");
		payCardPassword=input_int();
		
		switch(payCardNumber)
		{
		case 1234: if(payCardPassword==1234) flag=1; break;
		//case 1234123412341234: if(payCardPassword==1234) payCard=150000; break;
		//case 1111222233334444: if(payCardPassword==1234) payCard=150000; break;
		default: printf("\n\n\a������������:-0\n��� �Է��Ͻ� ī��� ��ȿ���� �ʽ��ϴ� :-0\n"); break;
		}
		if(flag==1) break;
	}
}
void salade_out(void)
{
	printf("\n\n\n");
	if(payCoin>0)
	{
		printf("�١��ܵ� �غ� �ߡڡ�\n");
		Sleep(1000);
		printf("���� ��!! %d���� ��ȯ�ϰ� �����մϴ�.\n",payCoin-payValue);
	}
	if(payCoin==0)
	{
		printf("�١�ī����οϷ�ڡ�\n");
		payCard=payCard-payValue;
	}
	printf("********************\n");
	printf(" ������ ��ǰ �غ��� \n");
	Sleep(1000);
	printf("�١ڽż��ѻ�����ڡ�\n");
	
	user_collection();
	Sleep(5000);
}
void user_default(void)
{
	int i=0;
	for(i=1;i<5;i++)
	{
		saladeStore[i]=saladeStore[i]-saladeUser[i];
		saladeUser[i]=0;
		toppingStore[i]=toppingStore[i]-toppingUser[i];
		toppingUser[i]=0;
		sourceStore[i]=sourceStore[i]-sourceUser[i];
		sourceUser[i]=0;
	}
	payCoin=0;
	payValue=0;
}

//*/

/*
// ������ ���Ǳ�



int main()
{
	for( ��� ;��� ��� 0g�϶����� ; ���-- )
	������� üũ�� �� �� ��������� ���� ��ǰ�� �ڵ����� ���;
	payMethod = 0 ���¿����� ��� ��ư�� �۵����� ���� (Sleep(5000); printf:���� ������ �ּ���)

	
	
	
	payMethod() //��������� ���� �������� ī��orNFC �������� ����
	{
		for(��� ������ �� ����)
		{
			switch()
			{
			case 1 (����):	chash() ȣ�� 
				{
					if payMethod = 1 ������ �ݾ��� �Ǵ� ��ǰ�鸸 Ȱ��ȭ�ǰ�, ������ �� ����
									 ����� ����,Ȱ��ȭ�� �Ͼ��, �ݾ��� ���ڸ��� �Ķ���
					���g>0g �� ��ǰ���� ���, ǰ���� ��ǰ�� ���� ����
					do
					{
						int �޴� ����() �Լ� ȣ��
						(if ���԰��� > ��ǰ����)
							- ���Աݾ� - ��ǰ���� ��
						else �ݾ��� �����մϴ�. �ݾ��� �����Ͻðڽ��ϱ�? (Y/N)
							Y :  �� �ݾ� = �� �ݾ� + ������ �ݾ�
							N : �޴� ���� continue;
					}while(�����ڰ� ������ �� ����)
				}

			case 2 (ī��):	��� ������ �� ���� (���� �� ����)
				do
				{
					int �޴� ����() �Լ� ȣ��

					�޴� ���� �Ϸ� ��, �����ϰڴٰ� �ϸ� �׶� ���� ����. ������ �Ϸ�Ǿ� ��ǰ��ȯ
					���g>0g �� ��ǰ���� ���

					do
					{
						- ��ǰ���� ����
					}while(�����ڰ� ������ �� ����)


					if �������ɱݾ� > ��ǰ����
						- ��ǰ ��ȯ
					else �ܰ� �ݾ��� �����մϴ�. �ٸ�������� �����Ͻðڽ��ϱ�? (Y/N)
						Y : payMethod() ȣ��
						N : �ٽô��
				}while(�����ڰ� ������ �� ����)


				�ǸŰ� �ǰ� ���� 
				���=���-������ ��ǰ ��;
				��� Ȯ��;
				�ٽ� �ֹ����� �غ�
			case 123456789 (�����ڸ��): ��� ��� ��������
									printf()
			}

		}
	}
	if(��� ��� = 0)
	{
		printf: ��� ��ǰ�� ǰ���Դϴ�.
		void alram()
		{
			printf("System : �Ǹ��ڿ��� ��� ���� �˶��� �������Դϴ�.")
			
			do
			{
				//send(clnSock,message,int strlem(message),0);
				int strlem(message)
				{
				//1�ð� �������� �˶�
				printf("��� 0�̾߾�~ ���ȷȴٱ�������");
				Sleep(5000);
				
				}
			}while(Ȯ��)
		}
	}
}

int payValue()
{
	���� �����ݾ� :	payValue = payValue + menuSellect();
	return payValue;
}

menuRemains()
{
	static menu��!!
��� :		�� ����/��ǰ 1���� ����
			������ �� �ִ� ��ǰ�� ��� ���� �ÿ���
			���԰� 0�� ��ǰ�� ǰ��ǥ��

}
int �޴� ����()
{
	ȭ��ǥ�� ���� �޴� �������� �ٲ� �����	(���Ǳ��� Ű �Է°��� ������ define �� �� ���)
	ȭ��ǥ �� ������ �� ����&����, �ִ����������� ���� �Ѿ�ų� �ּ����������� ���� �۾�����
	0 or �ִ밪���� �ʱ�ȭ �ؼ� �޴������������� ����� 
	switch (page)
	{
	case 0: main
	case 1: ä��
	case 2: ����
	case 3: �ҽ�
	case 4: ���̵�	
	}
}
int vegitSellect()
{
ä�� ���� : 	�Է��� ��ǰ�� ��ȣ�� ������ return
		switch()
		{
		case 1 �⺻: 1500; (�ʼ� ����)
		case 2 ����丶��: 500;
		case 3 ����: 500;
			.
			.
		}

}
int topingSellect()
{
���� ���� : 	�Է��� ��ǰ�� ��ȣ�� ������ return
		switch()
		{
		case 1 ���: 1000;
		case 2 ��ġ: 1000;
			.
			.
			.
		}

}
int sourceSellect()
{
�ҽ� ���� : 	�Է��� ��ǰ�� ��ȣ�� ������ return
		switch()
		{
		case 1 �߻��: 500;
		case 2 �ø���: 500;
			.
			.
			.
		}

}
int sideSellect()
{
���̵� ���� : �Է��� ��ǰ�� ��ȣ�� ������ return
		switch()
		{
		case 1 ����: 700;
		case 2 ź���: 1000;
			.
			.
			.
		}

}
int dishSellect()
{
�׸�&���� ���� : 	�Է��� ��ǰ�� ��ȣ�� ������ return

ex)�԰� ������ = �ּ� �Ա� ������ * (ä�� �߰����� +300ml, ���� �߰����� 100ml)
		switch()
		{
		case 1 ���Ǳ� ���� ���� �׸�: dish++; 4000; //���ض� ������~
		case 2 ��ȸ�� �׸�: 1000;
		case 3 ����: 700;
		case 4 ��ȸ�� ��Ƽ��: 100;
		case 5 ���ι�(����) : 100;
			.
			.
			.
		}

if(dish==0) �׸��� �������� ������ ���ȳ���&������ ��ǰ�� ��� �԰ݻ���� ����

}


outputGoods()
{
	����� ��� if�� �ֹ������� �ִ��� Ȯ���� �� ������ŭ ��µ�
	����
	�׸� (���� Ȯ��, �ڽ��� ���ö��� ���� �ߴٸ� �׸� ������ Ȯ�� �� �� (�ƴϸ� �׸� �߰��ֹ� ����) //length=length -moveLength �� ���� �� ��������...!! )
	ä��	 (printf :	ä�Ұ� ���� �ǵ��� ��¦ ���� �ּ���. (�����ڰ� ��� �� ����)
					�׸� ���̸� Ȯ���� ��, ������ ��� �� ������ next�� �������ּ���
					Next : ���� ��ǰ ���
					No   : �׸� �߰��ֹ� ���� or ��� ������ ��ǰ ���� ������
	����	 (printf :	ä�Ұ� ���� �ǵ��� ��¦ ���� �ּ���. (�����ڰ� ��� �� ����)
					�׸� ���̸� Ȯ���� ��, ������ ��� �� ������ next�� �������ּ���
					Next : ���� ��ǰ ���
					No   : �׸� �߰��ֹ� ���� or ��� ������ ��ǰ ���� ������
	�ҽ� (������ / ���� �Ѹ��� ����)
	����	
	���̵� �޴�
	������ ���
}
*/

/*
#include <stdio.h>

int store[5]={0,30,30,30,30};  //��ǰ�� ���� ��ȣ�� �迭 ��ȣ�� �����ֱ� ���ؼ� [0]ĭ�� ���� NULL�ΰ����� �ϳ� �����.
char *productName[5]={" ","�ݶ�","���̴�","�ֽ�","��ȭ��"};
int productPrice[5]={0,1000,1500,2000,1500};
int totalMoney=0; //���������� �� �ݾ� ���

int print_menu(void);
void input_money(void);


int main()
{
	int number=0; //�޴����� (1-4��)
	char select=' '; //�ֹ��߰� ���� Ȯ��
	//��ǰȭ�� ���

	//�������Ǳ� ���� ���α׷� ���ѷ���
	for( ; ; )
	{
		//1. �ݾ��Է�
		input_money();
		printf("���� �ݾ� : %d\n",totalMoney); //����� ���ư����� �߰�����
		//2. ��ǰ����
		number=print_menu();
		if(number==5)//���Ḧ ������ �� ����
		{
			if(totalMoney>0)
			{
				printf("%d ���� ��ȯ�ϰ� �����մϴ�.\n",totalMoney);
				totalMoney=0;
			}
			break;
		}


		//������ �޴��� ����Ѵ�. (������ �����Ѵ�.)
		for(;;)
		{
			if(totalMoney<productPrice[number])
			{
				printf("���� ���Աݾ� : %d , ��ǰ�ݾ� : %d\n",totalMoney, productPrice[number]);
				printf("����� ��̸Ӵ�.. ������ �ݾ� : %d \n",totalMoney, productName[number]);
				input_money();
			}
			else
			{
				printf("\n%s�� �帮�ɴϴ�. \n���ְ� �弼�� :-)\n",productName[number]);
				store[number]--;
				totalMoney=totalMoney-productPrice[number];

				printf("�� �ֹ��Ͻðڽ��ϱ�?");
				while(getchar()!='\n');
				scanf("%c",&select);
				if(select=='y'||select=='Y')
				{
					number=print_menu();
					continue;
				}
				else 
				{
					printf("%d ���� ��ȯ�ϰ� �����մϴ�.\n",totalMoney);
					totalMoney=0;
					break;
				}
			}
			break;
		}//end of for2
		printf("�����մϴ�. ����... ����ؿ�....\n\n\n");
	}//end of for1
	return 0;
}

//�ݾ� �Է��ϴ� �Լ�
void input_money(void)
{
	int money=0;
	char addMoneyAnswer=' ';

	for( ; ; )
	{
		printf("���������Ǳ��\n���� ���Աݾ� : %5d  �ݾ��� �Է� 100,500,1000,5000,10000 : ",totalMoney);
		scanf("%d",&money);
		switch(money)
		{
		case 100: case 500: case 1000: case 5000: case 10000:
			totalMoney=totalMoney+money; break;
		default: printf("������������:-0\n �Ѿ׿� ��ȯ����!\n");
		}

		printf("�ݾ��� �ٽ� �Է��Ͻðڽ��ϱ�?(Y/N)");
		while(getchar()!='\n');
		scanf("%c",&addMoneyAnswer);
		//printf("%c",addMoneyAnswer);  //�� ��� Ȯ���ϱ�
		while(getchar()!='\n');
		if(addMoneyAnswer=='y'||addMoneyAnswer=='Y') continue;
		else break;
	}//end of for
}
//��ǰ���� �Լ�
int print_menu(void)
{
	int sellectNumber=0;
	
	for(;;)
	{
		printf("1. �ݶ� : %d, 2,.���̴� : %d, 3.�ֽ� : %d, 4.��ȭ�� : %d \n",store[1],store[2],store[3],store[4]);
		printf("��ǰ��ȣ 1������ 4������ �����ϼ���.(��� : 5)");
		scanf("%d", &sellectNumber);
		//printf("%d",sellectNumber); //����� ���ư����� �߰�����
	
		//���ǰ��Ȯ��
		if((sellectNumber>=1 && sellectNumber<=4))
		{
			
			if (store[sellectNumber]<=0)
			{
				printf("%s�� %d���� ǰ���Դϴ�. �ٽ� �Է��ϼ���.",productName[sellectNumber],store[sellectNumber]);
				continue;
			}
			break;
		}
		if(sellectNumber==5) break; //���Ḧ ������ �� ����
	}
	return sellectNumber;
}


//*/