public class Person {

    private Mobile mobile;

    public Person (Mobile mobile){
        this.mobile = mobile;
    }


    public void makeCall(String message){
        mobile.makeCall(message);
    }

    public void setMobile(Mobile mobile){
        this.mobile = mobile;
    }

    public String getBasicInfo(){
        return "phone: "+this.mobile;
    }

}
