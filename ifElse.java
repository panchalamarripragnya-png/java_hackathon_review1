import java.util.Scanner;

class ifElse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int energyGenerated= 10;
        if (energyGenerated >= 10)
        {
            System.out.println("Good Energy Generation");
        }
        else
            System.out.println("Low Energy Generation");
    }
}