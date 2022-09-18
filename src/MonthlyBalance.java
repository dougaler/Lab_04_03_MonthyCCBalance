public class MonthlyBalance {
    public static void main(String[] args) {
        double InitialBalance = 5000;
        double Interest = 0.17;
        double FinalBalance1;
        double FinalBalance2;

        FinalBalance1 = InitialBalance + (InitialBalance * Interest);
        FinalBalance2 = FinalBalance1 + (FinalBalance1 * Interest);

        System.out.println("The Balance after 1 month with an initial balance of " + InitialBalance + " and an interest of " + Interest + " is " + FinalBalance1 + " and after two months is " + FinalBalance2);
        
    }
}