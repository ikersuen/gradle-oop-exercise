public class IPhoneRobot {
    private iPhone iphone;

    public iPhone getIphone() {
        return iphone;
    }

    public void setIphone(iPhone iphone) {
        this.iphone = iphone;
    }

    public IPhoneRobot(iPhone iphone) {
        this.iphone = iphone;
    }

    public void useToMakeACall(String message){
        this.iphone.makeACall(message);
    }
}
