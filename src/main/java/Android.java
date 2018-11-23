public class Android extends Mobile {

    public Android (String name,String color,String brand){
        super( name, color, brand);
    }

    @Override
    public void makeCall(String message){
        System.out.print("<Android>Message : "+message+", "+message);
    }
}
