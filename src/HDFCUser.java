import java.util.Objects;
import java.util.UUID;

public class HDFCUser implements BankInterface {
        private String name;
        private String accountNo;
        private double balance;
        private String password;
        private static double rateOfInterest;

        public HDFCUser(String name, double balance, String password) {
            //provided by the user;
            this.name = name;
            this.balance = balance;
            this.password = password;
            //we are analysing;
            this.rateOfInterest=8.5;
            this.accountNo=String.valueOf(UUID.randomUUID());
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAccountNo() {
            return accountNo;
        }

        public void setAccountNo(String accountNo) {
            this.accountNo = accountNo;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public static double getRateOfInterest() {
            return rateOfInterest;
        }

        public static void setRateOfInterest(double rateOfInterest) {
            HDFCUser.rateOfInterest = rateOfInterest;
        }

        @Override
        public double checkBalance() {
            return this.balance;
        }

        @Override
        public String addMoney(int amount) {
            balance=balance+amount;
            return"beti paise aa gaye dekh:"+balance;
        }

        @Override
        public String withdrawMoney(int amount, String enteredPassword) {
            if(Objects.equals(enteredPassword,password)){
                if(amount>balance){
                    return "Sorry bhai paise nahi hai itne";
                }else{
                    balance=balance-amount;
                    return"ha beti paise lele";
                }
            } else{
                return"Wrong password";
            }
        }

        @Override
        public double calculateInterest(int years) {
            return(balance*years*rateOfInterest)/100;
        }
    }


