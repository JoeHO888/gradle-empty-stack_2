public class Android extends Mobile {

    public Android (String name,String color,String brand){
        super( name, color, brand);
    }

    @Override
    public void makeCall(String message){
        if (message.length()<=20){
            System.out.print("<Android>Message : " + message + ", " + message);
        }else{
            System.out.print("Excess word limit");
        }
    }
}