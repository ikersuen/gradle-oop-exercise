public class iPhone extends Mobile {
    public iPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void makeACall(String message){
        if(message.length() > 10){
            System.out.print("<iPhone> Message cannot be sent\n");
        }else {
            super.makeACall(message);
        }
    }
}
