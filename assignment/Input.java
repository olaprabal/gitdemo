import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Input {

    private Scanner sc;

    public Input(){
        this.sc = new Scanner(System.in);
    }

    protected void finalize(){
        System.out.println("scanner closed");
        sc.close();
    }

    private String readString(){
        this.sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        return string1;
    }

    private int readInteger(){
        this.sc = new Scanner(System.in);
        int int1 = sc.nextInt();
        return int1;
    }

    private Double readDouble(){
        this.sc = new Scanner(System.in);
        Double double1 = sc.nextDouble();
        return double1;
    }

    public Customer inputCustomerDetail(){
        String id = inputCustomerId();
        String name = inputCustomerName();
        Date date = inputPurchaseDate();
        Double amount = inputBillAmount();
        return new Customer(id,name,date,amount);
    }

    public String inputCustomerId(){
        String id = "";
        boolean isValid = false;
        while(!isValid){
            System.out.println("Enter Customer Id:");
            isValid = true;
            try{
                id = this.readString();
            } catch(InputMismatchException a) {
                isValid = false;
                System.out.println(a);
            }
        }
        return id;
    }

    public String inputCustomerName(){
        String name = "";
        boolean isValid = false;
        while(!isValid){
            System.out.println("Enter Customer name:");
            isValid = true;
            try{
                name = this.readString();
            } catch(InputMismatchException a) {
                isValid = false;
                System.out.println(a);
            }
        }
        return name;
    }

    public String inputYear(){
        String year = "";
        boolean isValid = false;
        while(!isValid){
            System.out.println("Enter year:");
            isValid = true;
            try{
                year = this.readString();
            } catch(InputMismatchException a) {
                isValid = false;
                System.out.println(a);
            }
        }
        return year;
    }

    public Date inputPurchaseDate(){
        String date = "";
        Date dateParsed = null;
        boolean isValid = false;
        while(!isValid){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            System.out.println("Enter Customer date(dd-MM-yyyy):");
            isValid = true;
            try{
                date = this.readString();
                try {
                    dateParsed = dateFormat.parse(date);
                } catch (ParseException e) {
                    date = "";
                    isValid = false;
                    e.printStackTrace();
                }
            } catch(InputMismatchException a) {
                date = "";
                isValid = false;
                System.out.println(a);
            }
        }
        return dateParsed;
    }

    public Double inputBillAmount(){
        Double amount = 0.0;
        boolean isValid = false;
        while(!isValid){
            System.out.println("Enter Customer amount:");
            isValid = true;
            try{
                amount = this.readDouble();
            } catch(InputMismatchException a) {
                isValid = false;
                System.out.println(a);
            }
        }
        return amount;
    }
}
