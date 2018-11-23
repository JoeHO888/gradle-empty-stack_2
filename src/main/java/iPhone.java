public class iPhone extends Mobile {

    public iPhone (String name,String color,String brand){
        super( name, color, brand);
    }

    @Override
    public void makeCall(String message){
        if (message.length()<=30){
            System.out.print("<iPhone>Message : " + message + ", " + message);
        }else{
            System.out.print("Excess word limit");
        }
    }
}
