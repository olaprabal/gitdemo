import java.util.LinkedList;

public class Utils {
    private LinkedList<Customer> list;
    private Input inp;

    public Utils(){
        list = new LinkedList<Customer>();
        inp = new Input();
    }

    private void insertByAmount(Customer c){
        int insertAtIndex = list.size();
        for(int i=0;i<list.size();++i){
            if(this.list.get(i).getBillAmount()>c.getBillAmount()){
                insertAtIndex = i;
                break;
            }
        }
        this.list.add(insertAtIndex, c);
    }

    public void addCustomer(){
        Customer c = inp.inputCustomerDetail();
        insertByAmount(c);
    }

    public void printAllNodes(){
        for(int i=0;i<list.size();++i){
            list.get(i).printCustomerDetail();
        }
    }

    public void printByName(){
        String name = inp.inputCustomerName();
        for(int i=0;i<list.size();++i){
            if(list.get(i).getName().equals(name)){
                list.get(i).printCustomerDetail();
            }
        }
    }

    public void printTotalByYear(){
        String year = inp.inputYear();
        Double total = 0.0;
        for(int i=0;i<list.size();++i){
            if(list.get(i).getYear().equals(year)){
                total=total+list.get(i).getBillAmount();
            }
        }
        System.out.println("total amount: "+total.toString());
    }
}
