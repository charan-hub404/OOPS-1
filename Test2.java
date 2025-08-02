package oops1;

class Test2
{
public static void main(String[] args)  
           {
            char ch = 'a';
            int i;
            i = ch;//---> 2 byte into 4 bytes

            System.out.println(ch);//a

            System.out.println(i);//97
            }
}
