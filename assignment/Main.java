import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils u = new Utils();
        while(true){
           Scanner sc = new Scanner(System.in);
           System.out.print("press 1-4 for following queries or any other number to stop queriess:\n");
           System.out.print("1. Add customer data\n");
           System.out.print("2. Print all customers data in sorted order by bill amount\n");
           System.out.print("3. Total purchase amount for specific year\n");
           System.out.print("4. details of specific customer based on name\n");
           int q = sc.nextInt();
           if(q==1){
            u.addCustomer();
           } else if(q==2){
            u.printAllNodes();
           } else if(q==3){
            u.printTotalByYear();
           } else if(q==4){
            u.printByName();
           } else {
            break;
           }
        }
    }
}
