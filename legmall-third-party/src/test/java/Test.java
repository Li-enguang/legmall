import com.leg.thirdparty.component.SmsComponent;

import javax.annotation.Resource;

public class Test {
    @Resource
    SmsComponent smsComponent;


    @org.junit.Test
    public void test() {
        smsComponent.sendCode("17634107762", "1234");
    }

}
