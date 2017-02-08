import java.util.*;



public class Transaction {

    atm a = new atm();

    int balance;

    Scanner s=new Scanner(System.in);

    Transaction()

    {

	this.balance=50000;

    }

    public void transaction()

    {

	System.out.println("Choice 1 - withdraw");

        System.out.println("Choice 2 - Balance Enquiry");

        System.out.println("Choice 3 - Print a receipt");

        System.out.println("Press any other key to Discontinue");

        System.out.println("Enter Choice : ");

	int c= s.nextInt();

	switch(c)

	{

            case 1: System.out.println("Enter the amount to be withdrawn");

                int n=s.nextInt();

                withdraw(n);

	        break;

	    case 2: balanceEnquiry();

	        break;

            case 3: a.printReceipt();

                System.out.println("If you want to perform another Transaction Press 'Y'");

                System.out.println("Or Press 'N' to Discontinue");

                Scanner reader = new Scanner(System.in);

                char ch = reader.next().charAt(0);

                if(ch == 'Y')

                {

                    transaction();

                }

                else

                {

                    System.out.println("Thank you for using the ATM");

                }

                break;

            default: System.out.println("Thank you for using the ATM");

                break;

	}

    }

    public void withdraw(int amount)

    {

	if(amount<balance)

	{

            balance=balance-amount;

	}

	else

	{

            System.out.println("Insufficient balance");

	}

	System.out.println("If you want to perform another Transaction Press 'Y'");

        System.out.println("Or Press 'N' to Discontinue");

        Scanner reader = new Scanner(System.in);

	char ch = reader.next().charAt(0);

	if(ch == 'Y')

	{

            transaction();

	}

        else

        {

            System.out.println("Thank you for using the ATM");

        }

    }

    public void balanceEnquiry()

    {

        char ch;

	System.out.println("Current Available Balance is"+ balance);

	System.out.println("If you want to perform another Transaction Press 'Y'");

        System.out.println("Or Press 'N' to Discontinue");

        Scanner reader = new Scanner(System.in);

	ch = reader.next().charAt(0);

	if(ch == 'Y')

	{

            transaction();

	}

        else if(ch=='N')

        {

            System.out.println("Thank you for using the ATM");

        }

        else

        {

            System.out.println("Invalid choice...");

            System.out.println("Thank you for using the ATM");

        }

    }



}
