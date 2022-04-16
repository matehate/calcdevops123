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
        num_func = 1;
    }

    public double sqrot(double num)
    {
        log_file.info("[Sq ROOT] - "+num);
        double res = Math.sqrt(num);
        log_file.info("[OUTPUT- Sq ROOT] - " + res);
        return res;
    }
    public static void main(String [] args)
    {
        Scientific_Calc calculator = new Scientific_Calc();
        Scanner sc = new Scanner(System.in);
        double num[] = new double[2];
        do
        {
            System.out.println("Enter 0 for square root of a number");
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
                    num[0] = sc.nextDouble();
                    if(num[0]<0)
                    {
                        System.out.println("Enter a non negative number !!");
                        break;
                    }
                    System.out.println(calculator.sqrot(num[0]));
                    break;
            }
        }while(true);
    }
}