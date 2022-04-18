package Scientific_Calc;
//trying ngrok and jenkins build trigger
//trying it a second time
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Scientific_Calc
{
    private static final Logger log_file = LogManager.getLogger(Scientific_Calc.class);
    private final int num_func;
    public Scientific_Calc()
    {
        num_func = 2;
    }
    //testing GitSCM polling after 500 server error
    //one more trial
    public double sqrot(double num)
    {
        log_file.info("[Sq ROOT] - "+num);
        double res = Math.sqrt(num);
        log_file.info("[OUTPUT- Sq ROOT] - " + res);
        return res;
    }

    public int factorial(int num)
    {
        log_file.info("[Factorial] - "+num);
        int res = 1;
        for(int i=1;i<=num;i++)
            res*=i;
        log_file.info("[OUTPUT- Factorial] - " + res);
        return res;
    }
    public static void main(String [] args)
    {
        Scientific_Calc calculator = new Scientific_Calc();
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Enter 0 for square root of a number");
            System.out.println("Enter 1 for factorial of a number");
            System.out.println("Enter "+calculator.num_func+" for exit");
            int choice;
            try
            {
                choice = sc.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Please enter the correct input");
                continue;
            }
            if(choice>calculator.num_func || choice<0)
            {
                System.out.println("Invalid choice");
                continue;
            }
            if(choice== calculator.num_func)break;
            switch(choice)
            {
                case 0:
                    double num;
                    num = sc.nextDouble();
                    if(num<0)
                    {
                        System.out.println("Enter a non negative number !!");
                        break;
                    }
                    System.out.println("Output - "+calculator.sqrot(num));
                    break;
                case 1:
                    int number;
                    number = sc.nextInt();
                    if(number<0)
                    {
                        System.out.println("Enter a non negative number !!");
                        break;
                    }
                    System.out.println("Output - "+calculator.factorial(number));
                    break;
            }
        }while(true);
    }
}