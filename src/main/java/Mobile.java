public class Mobile {

    private String name;
    private String color;
    private String brand;


    public Mobile(String name,String color,String brand){
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void makeCall(String message){
        System.out.print("Message : "+message+", "+message);
    }
}
