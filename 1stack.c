#include<stdio.h>
#include<conio.h>
#define SIZE 5
void push (int);
void pop ();
void display ();
int stack [SIZE], top=-1;
void main ()
{
int value ,choice;
clrscr ();
while(1)
{
printf("\n menu");
printf("\n 1.push \n 2. pop \n
3.display() \n4 exit");
printf("\n enter your choice=");
scanf ("%d",&choice);
switch(choice)
{
case 1:
printf("\n enter value to insert=");
scanf("%d",&value);
push(value);
break;
case 2:
pop();
break;
case 3:
display();
break;
case 4:
exit(0);
default:
printf("\n wrong selection");
}
}
}
void push(int value)
{
if(top==SIZE-1)
{
printf("\n stack is overflow");
}
else
{
top++;
stack[top]=value;
printf("\n insertion successful");
}
}
void pop()
{
if(top==-1)
{
printf("\n stack is underflow");
}
else
{
printf("\n deleted=%d",stack[top]);
top--;
}
}
void display()
{
if(top==-1)
{
printf("\n stack is empty");
}
else
{
int i;
printf("\n stack element are=");
for(i=top;i>=0;i--)
{
printf("\n%d\n",stack[i]);
}
}
}
