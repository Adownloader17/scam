#include<stdio.h>
#include<conio.h>
#define size 100
int stack[size];
int top=-1;
void push(int value)
{
 top++;
 stack[top]=value;
}
 int pop()
 {
 int a;
 a=stack[top];
 top--;
 return a;
 }
 int is_operand(char ch)
 {
 if(ch>='a'&&ch<='z'||
ch>='A'&&ch<='Z')
 return 1;
 else
 return 0;
 }
 int main()
 {
 char postfix[size],ch;
 int i=0,op1,op2,result,m;
 clrscr();
 printf("\n Enter a postfix expression:");
 gets(postfix);
 while(postfix[i]!='\0')
 {
 ch=postfix[i];
 if(is_operand(ch)==1)
 {
 printf("\n Enter the value of
%c=",ch);
 scanf("%d",&m);
 push(m);
 }
 else
 {
 op2=pop();
 op1=pop();
 switch(ch)
 {
 case '+' : result=op1+op2;
 push(result);
 break;
 case '-' : result=op1-op2;
 push(result);
 break;
 case '*' :result=op1*op2;
 push(result);
 break;
 case '/' : result=op1/op2;
 push(result);
 break;
 }
 }
 i++;
 }
 result=pop();
 printf("\n The result is =
%d",result);
 getch();
 return 0;
 }
