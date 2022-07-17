import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.function.Function;

public final class Customer {
    private String id;
    private String name;
    private Date purchaseDate;
    private Double billAmount;

    public Customer(String id, String name, Double billAmount) {
        this.id = id;
        this.name = name;
        this.billAmount = billAmount;
    }

    public Customer(String id, String name, Date purchaseDate, Double billAmount){
        this.id = id;
        this.name = name;
        this.purchaseDate = purchaseDate;
        this.billAmount = billAmount;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getYear(){
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        String year = yearFormat.format(this.purchaseDate);
        return year;
    }

    public Double getBillAmount(){
        return this.billAmount;
    }

    public void printCustomerDetail(){
        System.out.print("id: "+(this.id).toString()+",");
        System.out.print("name: "+(this.name).toString()+",");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.print("purchaseDate: "+dateFormat.format(this.purchaseDate)+",");
        System.out.print("amount: "+(this.billAmount).toString()+"\n");
    }
}