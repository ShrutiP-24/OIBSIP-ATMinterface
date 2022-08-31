import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Menu extends Account {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();


	public void getLogin() throws IOException {
		int x = 1;

		do {
			try {

				data.put(123345668, 1482);
				data.put(123456780, 1230);

				System.out.println("\n"+"Welcome to the ATM Project!");

				System.out.print("\nEnter Your Customer Number: ");
				setCustomerNumber(menuInput.nextInt());

				System.out.print("Enter Your Pin Number: ");
				setPinNumber(menuInput.nextInt());
			} catch (Exception e) {
				System.out.println("\n" + "Invalid character(s). Only numbers." + "\n");
				x = 2;
			}
			for (Entry<Integer, Integer> entry : data.entrySet()) {
				if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");
		} while (x == 1);
	}


	public void getAccountType() 
    {
		int balance = 0, withdraw, deposit;  
        Scanner src = new Scanner(System.in);  
        System.out.println("------------------------------------------------");
        System.out.println("Enter the Account User name  : ");
        String Account= src.nextLine();
          
        while(true)  
        {  
            System.out.println("\n"+"**********ATM interface**********"); 
            System.out.println(" \n 1 : View Balance      ");  
            System.out.println(" \n 2 : Deposit       ");  
            System.out.println(" \n 3 : Withdraw  ");  
            System.out.println(" \n 4 : EXIT           ");
            System.out.print(  "\nChoose the operation you want to perform  : "); 
            int choice = src.nextInt();  
            System.out.println(".......................................................................................");
            switch(choice)  
            {  
                case 1: 
                    System.out.println("UserName: "+Account);
                    System.out.println("Balance : "+moneyFormat.format(balance)+ "\n") ;  
                    System.out.println("");  
                    break;  
   
                case 2:  
                    System.out.println("UserName: "+Account);
                    System.out.print("Enter money to be deposited: ");  
                    deposit = src.nextInt();  
                    balance = balance + deposit;  
                    System.out.println("\n!!!Your Money has been successfully depsited!!!");  
                    System.out.println("");  
                    break;  
   
                case 3:  
                    System.out.println("UserName: "+Account);
                    System.out.print("Enter money to be withdrawn: ");  
                    withdraw = src.nextInt();  
                    if(balance >= withdraw)  
                    {  
                        balance = balance - withdraw;  
                        System.out.println("\n!!!Please collect your money!!!");  
                    }   
                    else  
                    {  
                        System.out.println("Insufficient Balance");  
                    }  
                    System.out.println("");  
                    break;
                    
   
                case 4: 
                    System.out.println("\n"+"-------------------*THANK YOU!!!*-------------------"+"\n");
                    System.exit(1);  
            }  
        }  
    }  
}  