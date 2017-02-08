import java.util.*;

public class BankAccount {

    int pinNumber;

    int counter;

    int cardNumber;

    Scanner s=new Scanner(System.in);

 

    public BankAccount()

    {

        this.pinNumber = 8612;

        this.counter=0;

       	this.cardNumber = 50141154;

    }

    public void verifyPin()

    {

        System.out.println("Enter your pin number");

        int pin=s.nextInt();

        if(pin==pinNumber)

 	{

            Transaction t =new Transaction();

            t.transaction();

        }

 	else

 	{

            System.out.println("The pin you entered is invalid. Please try again");

            System.out.println("To continue - Press 1");

            System.out.println("Press any other key to Discontinue");

            int l=s.nextInt();

            counter++;

            if(l==1)

            {

                if(counter<3)

   		{

                    verifyPin();

  		}

                else if(counter == 3)

 		{

                    System.out.println("Too many attempts - Cannot process the card");

   		}

            }

            else

            {

                System.out.println("Thank you for using the ATM");

            }

 	}

    }



}
