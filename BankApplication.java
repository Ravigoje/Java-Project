import java.util.Scanner;

class BankAccount 
{
    
    Scanner sc = new Scanner(System.in);

    private String accountHolderName;
    private String address;
    private long adharNumber;
    private String panNumber;
    private int upiPin;
    private double balance;
    private long phoneNumber;

    BankAccount(String accountHolderName, String address, long adharNumber, String panNumber, int upiPin, double balance, long phoneNumber) 
    {
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.adharNumber = adharNumber;
        this.panNumber = panNumber;
        this.upiPin = upiPin;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountHolderName() 
    {
        return accountHolderName;
    }

    public void setAccountHolderName(String updateAccountHolderName) 
    {
        this.accountHolderName = updateAccountHolderName;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress(String updateAddress) 
    {
        this.address = updateAddress;
    }

    public int getUpiPin()
    {
        return upiPin;
    }
    public void setUpi(int updateUpiPin) 
    {
        this.upiPin = updateUpiPin;
    }

    public long getPhone() 
    {
        return phoneNumber;
    }
    public void setPhone(long updatePhoneNumber) 
    {
        this.phoneNumber = updatePhoneNumber;
    }


    public double getBalance() 
    {
        System.out.println("Enter UPI PIN first : ");
        int pin = sc.nextInt();

        if(pin==upiPin)
        {
        return balance;
        }
        else
        {
            System.out.println("Invalid Pin");
        }
        return 0;
    }

    public void setBalance(double updateBalance)
    {
        balance = updateBalance;
    }

    public void deposit(double amount) 
    {
        balance =balance+ amount;
        System.out.println("Amount deposited successfully. Updated balance: " + balance);
    }

    public void withdraw(double amount) 
    {
        if (balance >= amount) 
        {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully. Updated balance: " + balance);
        } 
        else 
        {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
}

public class BankApplication 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        BankAccount obj = null;
        boolean exit = false;
        double bankBalance = 0; // Declare cbal outside the switch statement

        while (!exit) 
        {
            System.out.println();
            System.out.println("1. Create Account");
            System.out.println("2. Existing User");
            System.out.println("3. Exit");
            System.out.println();
            System.out.println("Choose option");
            int num = sc.nextInt();
            System.out.println();

            switch (num) 
            {
                case 1: 
                    {
                        System.out.println("Enter Name : ");
                        String accountHolderName = sc.next();
                        System.out.println();
                        System.out.println("Enter Address : ");
                        String address = sc.next();
                        System.out.println();
                        System.out.println("Enter Adhar Card Number : ");
                        long adharNumber = sc.nextLong();
                        System.out.println();
                        System.out.println("Enter Pan Number : ");
                        String panNumber = sc.next();
                        System.out.println();
                        System.out.println("Enter Upi Pin : ");
                        int upiPin = sc.nextInt();
                        System.out.println();
                        System.out.println("Enter Balance : ");
                        double balance = sc.nextDouble();
                        System.out.println(); 
                        System.out.println("Enter Phone Number : ");
                        long phoneNumber = sc.nextLong();
                        System.out.println();
                        System.out.println("Bank Account Created Successfully");

                        obj = new BankAccount(accountHolderName, address, adharNumber, panNumber, upiPin, balance, phoneNumber);
                    }
                    break;

                case 2: 
                    {
                        if (obj != null) 
                        {
                            System.out.println();
                            System.out.println("1. Check Balance");
                            System.out.println("2. Deposit Amount");
                            System.out.println("3. Withdrawal Amount");
                            System.out.println("4. Update Account");
                            System.out.println("5. Logout");
                            System.out.println();
                            System.out.println("Choose option");
                            int num1 = sc.nextInt();
                            System.out.println();

                            switch (num1) 
                            {
                                case 1: 
                                    {
                                        System.out.println("Balance is : " + obj.getBalance());
                                    }
                                    break;

                                case 2: 
                                    {
                                        System.out.println();
                                        System.out.println("Enter Amount for Deposite : ");
                                        double deposit = sc.nextDouble();
                                        System.out.println();
                                        obj.deposit(deposit);
                                    }
                                    break;

                                case 3: 
                                    {
                                        System.out.println();
                                        System.out.println("Enter Amount for Withdrawal : ");
                                        double withdrawal = sc.nextDouble();
                                        System.out.println();
                                        obj.withdraw(withdrawal);
                                    }
                                    break;

                                case 4: 
                                    {
                                        System.out.println();
                                        System.out.println("Update Your Information : ");
                                        System.out.println("1. Account Holder Name");
                                        System.out.println("2. Address");
                                        System.out.println("3. UPI Pin");
                                        System.out.println("4. Phone Number");
                                        System.out.println();
                                        System.out.println("Choose option");
                                        int num2 = sc.nextInt();
                                        System.out.println();

                                        switch (num2) 
                                            {
                                                case 1: 
                                                    {
                                                        System.out.println("Enter New name:");
                                                        String userName = sc.next();
                                                        obj.setAccountHolderName(userName);
                                                    }
                                                    break;

                                                case 2: 
                                                    {
                                                        System.out.println();
                                                        System.out.println("Enter New Address : ");
                                                        String userAddress = sc.next();
                                                        obj.setAddress(userAddress);
                                                    }
                                                    break;

                                                case 3: 
                                                    {
                                                        System.out.println();
                                                        System.out.println("Enter New UPI PIN : ");
                                                        int userUpiPin = sc.nextInt();
                                                        obj.setUpi(userUpiPin);
                                                    }
                                                    break;

                                                case 4: 
                                                    {
                                                        System.out.println("Enter New Phone Number:");
                                                        long uphone = sc.nextLong();
                                                        obj.setPhone(uphone);
                                                    }
                                                    break;

                                                default: System.out.println();
                                                         System.out.println("Incorrect Option");
                                                    
                                            }
                                    }
                                    break;

                                case 5: 
                                    {
                                        System.out.println();
                                        obj = null;
                                        System.out.println("Logged out successfully");
                                        System.exit(0);
                                    }
                                    break;

                                default : System.out.println("Incorrect Option");
                            }
                    } 
                    else 
                    {
                        System.out.println("Create account first");
                    }
                }
                break;

                case 3: 
                    {
                        System.out.println();
                        exit = true;
                        System.out.println("Exit Successfully");
                    }
                break;

                default:
                    System.out.println("Incorrect Option");
            }
        }        
    }
}