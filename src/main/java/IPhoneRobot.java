public class IPhoneRobot {
    private iPhone iPhone;

    public IPhoneRobot (iPhone iPhone){
        this.iPhone = iPhone;
    }


    public void makeCall(String message){
        iPhone.makeCall(message);
    }


}
