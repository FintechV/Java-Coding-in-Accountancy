import java.util.*;

public class AccountingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalRevenue = 0, totalExpense = 0;
        int choice;

        do {
            System.out.println("\n=== ACCOUNTANCY ===");
            System.out.println("1. Record Revenue");
            System.out.println("2. Record Expense");
            System.out.println("3. View Financial Statement");
            System.out.println("4. Audit Simulation");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter revenue amount: ");
                    totalRevenue += sc.nextDouble();
                    break;
                case 2:
                    System.out.print("Enter expense amount: ");
                    totalExpense += sc.nextDouble();
                    break;
                case 3:
                    double netIncome = totalRevenue - totalExpense;
                    System.out.println("\n--- Financial Statement ---");
                    System.out.println("Total Revenue: ₱" + totalRevenue);
                    System.out.println("Total Expenses: ₱" + totalExpense);
                    System.out.println("Net Income: ₱" + netIncome);
                    System.out.println(netIncome >= 0 ? "Status: PROFIT" : "Status: LOSS");
                    break;
                case 4:
                    System.out.println("\nAuditing Records...");
                    if (totalRevenue >= totalExpense)
                        System.out.println("Audit Result: Compliant and stable performance.");
                    else
                        System.out.println("Audit Result: Review expense management strategies.");
                    break;
                case 5:
                    System.out.println("Exiting system. Keep accounting with integrity!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
