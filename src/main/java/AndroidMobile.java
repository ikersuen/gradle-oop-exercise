public class AndroidMobile extends Mobile {
    public AndroidMobile(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void makeACall(String message){
        if(message.length() > 20){
            System.out.print("<Andriod> Message cannot be sent\n");
        }else {
            super.makeACall(message);
        }
    }
}
