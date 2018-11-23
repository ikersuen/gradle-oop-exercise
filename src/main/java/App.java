public class App {
    public static void main(String[] args) {
        //Story 1
        Mobile myPhone = new Mobile("myMobile", "Green", "Samsung");
        myPhone.makeACall("I want to sleep");
        iPhone myIphone = new iPhone("myIphone", "Black", "Apple");
        myIphone.makeACall("This is a very longgggggggggggggggggggggggggggg message");
        AndroidMobile myAndroid = new AndroidMobile("myAndroid", "Pink", "Nokia");
        myAndroid.makeACall("我們不一樣");

        //Story 2
        myPhone.getBasicInfo();
        myIphone.getBasicInfo();
        myAndroid.getBasicInfo();

        //Story 3 & Story 4
        Person Adam = new Person(myIphone, "Adam");

        Adam.usePhoneToMakeCall("Hello Mummmmmmmmmmmmmmm\n");
        Adam.setMobile(myAndroid);
        Adam.usePhoneToMakeCall("Hello Daddddddddddddddddddddddddddddddddddddddddddddddddd\n");

        IPhoneRobot iphoneRobotTest = new IPhoneRobot(myIphone);
        iphoneRobotTest.useToMakeACall("Skr");

    }
}
