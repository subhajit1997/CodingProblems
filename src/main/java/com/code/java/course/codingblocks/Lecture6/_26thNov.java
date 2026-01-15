package com.code.java.course.codingblocks.Lecture6;

public class _26thNov {
    public static void main(String[] args) {
        //Binary System
        //->  Base 2
        //->  0,1

        //convert binary number to decimal number
        int input =1101101;
        int decimal=0;
        int raise = 0;
        while (input!=0) {
            int r = input%10;
            decimal = decimal+ r*(int)Math.pow(2, raise);
            raise++;
            input = input/10;
        }
        System.out.println(decimal);

        //convert decimal to binary
        int input1= 109;
        int binary = 0;
        int position=0;
        while (input1>0) {
            int digit = input1%2;
            binary = binary+digit*(int)Math.pow(10, position++);
            input1 = input1/2;
        }
        System.out.println(binary);
        //convert decimal to binary
        int input2= 109;
        int binary2 = 0;
        int mul2=1;
        while (input2>0) {
            int digit = input2%2;
            binary2 = binary2+digit*mul2;
            mul2  = mul2*10;
            input2 = input2/2;
        }
        System.out.println(binary2);

        /*
        
        Any to any:

    public static int anyToDecimal(int num,int src){
        int decimal=0;
        int mul =1;
        while (num!=0) {
            int r = num%10;
            decimal = decimal + r*mul;
            mul = mul*src;
            num = num/10;
        }
        return decimal;
    }
    public static int decimalToAny(int num,int dest){
        int result =0;
        int mul =1;
        while (num!=0) {
            int digit = num%dest;
            result = result + digit*mul;
            mul = mul*10;
            num = num/dest;
        }
        return result;
    }
        
        */
        //Data Type
        /*
        Bit - smallest unit of memory 
        Data Type
            |
           \|/
primary                                  non-primary
--------------------                    ---------------
boolean -   1bit
byte    -   1byte   -   8bits
short   -   2bytes   -   16bits
int     -   4bytes   -   32bits
long    -   8bytes   -   64bits

float   -   4bytes   -   32bits
double  -   8bytes   -   64bits

char    -   2bytes  -   16bits


1          ,1,   1 ,   1,    1,   1,   1,  1 
128        ,64,  32,   16,   8,   4,   2,  1 = 255
--------
    |
   \|/
msb signed bit -> 1(-ve numb)/0 (+ve number) 

cannot store in signed bit , so max number we can store is n-1, as nth is signed bit
-2^(n-1)   to   2^(n-1) -1         (-1 in case of positive as considering for 0)

how float/double store docs? -> read white paper


        int i = 1000000000; -> works
        int i = 10000000000;  -> error
        
        long l = 10000000000; ->  error
        long also gives error but long is bigger , why error?
          -> As the number we mention 10000000000 , java thinks it as int , so we use type casting 10000000000l
        long l = 10000000000l;  -> correct

        float f = 2.2; ->error 
        why error above float?
        -> for 2.2 java coniders default is decimal , so we need type casting
         float f = 2.2f;  -> correct

         doubel d = 2.2;  -> correct 


        for(byte i=0;i<128;i++){
            System.out.println(i);
        } -> This gives infinite loop as when it reaches 127 that is max value, it resets to one again , 
         so, 0,1,......126,127,-128,.... infinite


        */
    }   
}
