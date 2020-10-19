/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

 import java.util.*;
class race 
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int speed[]=new int[6];
        for(int i=1;i<=5 ;i++)
        {
            System.out.println("Enter speed of racer "+i+":");
            speed[i]=s.nextInt();
        }
        int sum=0;
        for(int i=1;i<=5;i++){
            sum+=speed[i];
        }
        double avg=sum/5;
        System.out.println("\n The number and speed of the qualifying racers is as follows:");
        for(int i=1;i<=5;i++){
            if(speed[i]>=avg)
                System.out.println("\n Racer number-"+i+":"+speed[i]);
        }
    }
}