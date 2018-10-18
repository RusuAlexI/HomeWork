package exercise.demo.phone.calls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ExerciseDemoPhoneCalls {

    public static void main(String[] args) {

        PhoneCall firstPhoneCall = new IncomingPhoneCall("111-1111-1111");
        firstPhoneCall.informationAboutTheCall();

        PhoneCall secondPhoneCall = new OutgoingPhoneCall(45, "222-2222-2222");
        secondPhoneCall.informationAboutTheCall();

        System.out.println("---------------ArrayList------------");
        PhoneCall[] phoneCallArrayList = new PhoneCall[10];
        phoneCallArrayList[0] = new IncomingPhoneCall("111-1111-1111");
        phoneCallArrayList[1] = new OutgoingPhoneCall(45, "222-2222-2222");
        phoneCallArrayList[2] = new IncomingPhoneCall("333-3333-3333");
        phoneCallArrayList[3] = new OutgoingPhoneCall(89, "444-4444-4444");
        phoneCallArrayList[4] = new IncomingPhoneCall("555-5555-5555");
        phoneCallArrayList[5] = new OutgoingPhoneCall(56, "666-6666-6666");
        phoneCallArrayList[6] = new IncomingPhoneCall("777");
        phoneCallArrayList[7] = new OutgoingPhoneCall(8, "888-8888-8888");
        phoneCallArrayList[8] = new IncomingPhoneCall("999-9999-9999");
        phoneCallArrayList[9] = new OutgoingPhoneCall(56, "555-7778-7777");

        for (PhoneCall phoneCallArrayList1 : phoneCallArrayList) {
            phoneCallArrayList1.informationAboutTheCall();
        }

    }

}
