import java.util.*;
public class variables {

    //boilerplate
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in); 

        // Hello World code
        //println , \n is used for next line 
        System.out.println("Hello World");
        System.out.print("Hello World \n");
        System.out.println("Hello World");

        // Simple pattern code
        System.out.println(" ****");
        System.out.println(" ***");
        System.out.println(" **");
        System.out.println(" *");

        /* Variables & Literals 
         * Variables = Whose value can be changed
         * Literals = Fixed universal value. NumberLiteral 12345 or CharacterLiteral abcd@#$
        */
        int a = 10 ;
        int b = 3;
        System.out.println(a);
        System.out.println(b);
        String name = "Tony Stark";
        System.out.println(name);

        a = 50;
        System.out.println(a);

        a=b;
        System.out.println(a);

        // Data Types in java primitive, non primitive 

        byte c = 8;  // Rare use
        char ch = 'R';
        boolean TorF = true;
        //float dec = double(10.3);
        int num = 10;
        short sh= 120; // Rare use

         /*Input in JAVA
        String fname = sc.next();
        System.out.println(fname);
        sc.nextLine(); /* Let's imagine you have a friend named Scanner (let's call them "sc"). You and Scanner like to talk to each other. When you talk, you give Scanner some information, and Scanner understands it.

        Now, when you tell Scanner your name using sc.next(), Scanner listens until it hears a special sound (like saying "Enter" on a keyboard). But, after you tell your name, there's a little sound (like pressing "Enter") left that Scanner can still hear.
        
        Then, when you want to tell Scanner your full name using sc.nextLine(), Scanner hears that little leftover sound from before and thinks you said nothing. So, it doesn't wait for your full name because it believes you already finished talking.
        
        To fix this, before you tell your full name, you need to tell Scanner, "Hey, listen for any leftover sounds from before and ignore them." You do this by saying sc.nextLine() once without telling any actual information. Now, when you tell your full name, Scanner listens properly without any confusion. */

        String fullname = sc.nextLine();
        System.out.println(fullname);

        int date= sc.nextInt();
        System.out.println(date);

        Boolean conf= sc.nextBoolean();
        System.out.println(conf);

        short n = sc.nextShort();
        System.out.println(n);

        long l= sc.nextLong();
        System.out.println(l); 

        // Sum of a,b 
        int d = sc.nextInt();
        int e= sc.nextInt();
        int sum = d+e;
        System.out.println(sum);

        // product of a,b
        int f = sc.nextInt();
        int g = sc.nextInt();
        int product= f*g;
        System.out.println(product);

        // Area of Circle 
        int r= sc.nextInt();
        float area= 3.14f *r*r; // With f floating value and without f double value 
        System.out.println(area);

        // Type Conversion 
        int num1 = 25;
        long num2 = a;
    /*    long m = 25;
        int n = m;      this is not posible will show error      */

        //Type Casting 
        float num3 = 23.9f;
        int num4 = (int)num3;
        System.out.println(num4);

        char ch1 ='a';
        int num5 = ch1;
        System.out.println(num5);
        System.out.println(ch1);

        //Type Promotion happens only with expression 
        byte n1 = 2;
        short n2 = 3;
        char n3 = 'd';
        int bt = n1+n2+n3; // This is type promotion only when expressions(+,-*,/) are their 
        byte bt2 = (byte) (n1+n2+n3); // Type Casting is done here
        System.out.println(bt);
        System.out.println(bt2);

        byte bt3 = 5;
         //bt3 = bt3*2; // error because now bt3 is int as written with expression 
         bt3 = (byte) (bt3 * 2);  // Type casting 
         System.out.println(bt3);



    





        






        

    




    }    
}
