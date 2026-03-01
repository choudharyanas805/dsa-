package basic_cheeze_JAVA;

public class ascii_type {
    static void main() {
        /* ascii values means
        a=97,b=98,c=99....z=122.
        A=65,B=66 , C=67,...Z=90
        0= 48,1=49,2=50...9=57

        in this most imp is a,A,0 values
         */

        /* jab ham chnge krtai hai covert iskoh boltai hai
        typecasting - ek datatype se doosra data typeconversion
         */

        char ch = 'A';
        int b = ch;        // implicit typecasting
        System.out.println(b);


        char anas = 'a';
        int c = (int) anas;  // explicit typecasting boltai hai
        System.out.println(c);

        //direct method mostly use hota hai

        char harsh='3';
        System.out.println((int)harsh);

        // same jada tar 99 percent use this method
        char ali = '3';
        System.out.println(ali+0);  // ham (ali*1) same work doing ..


        // ak ham apsai mai multiple bhi krwa saktai ho..
        System.out.println(ali*2);

        // int to char
        int a = 65;
        char karan = (char) a;
        System.out.println(karan);

        //or
        int e = 65;
        System.out.println((char)e);

    }
}
