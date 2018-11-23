public class iPhone extends Mobile {

    public iPhone (String name,String color,String brand){
        super( name, color, brand);
    }

    @Override
    public void makeCall(String message){
        System.out.print("<iPhone>Message : "+message+", "+message);
    }
}
