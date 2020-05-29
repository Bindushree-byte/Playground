#include<stdio.h>
int main()
{
    //Initialization of variables where rev='reverse=0'
    int number, rev = 0, left;

    //input a numbers for user
      
      scanf("%d", &number);

     

     //use this loop for check true condition
     while (number > 0)
     {
       //left is for remider are left
        left= number%10;

       //for reverse of no.
        rev = rev * 10 + left;

        //number /= 10;
        number=number/10;

      }
     //To show the user value
     

      //after reverse show numbers
       printf(" %d\n", rev);

     return 0;
}

