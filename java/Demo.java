class Student{
    int id;
    String name;

    public void show(){
        System.out.println(this.id+","+this.name+"\n");
    }
}

public class Demo {
    public static void main(String[] args) {
        // System.out.println("Hello to 3 week");
        Student obj = new Student();
        obj.id = 101;
        obj.name = "Alex";
        obj.show();
    }
}