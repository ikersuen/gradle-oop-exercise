public class Person {
    private Mobile mobile;
    private String name;

    public Person(Mobile mobile, String name) {
        this.mobile = mobile;
        this.name = name;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void usePhoneToMakeCall(String message){
        this.mobile.makeACall(message);
    }
}
