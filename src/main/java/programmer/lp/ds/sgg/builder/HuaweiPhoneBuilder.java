package programmer.lp.ds.sgg.builder;

public class HuaweiPhoneBuilder extends AbstractPhoneBuilder {

    public HuaweiPhoneBuilder() {
        phone = new HuaweiPhone();
    }

    @Override
    public AbstractPhoneBuilder cpu(String cpu) {
        phone.cpu = cpu;
        return this;
    }

    @Override
    public AbstractPhoneBuilder mem(String mem) {
        phone.mem = mem;
        return this;
    }

    @Override
    public AbstractPhoneBuilder dis(String dis) {
        phone.dis = dis;
        return this;
    }

    @Override
    public AbstractPhoneBuilder cam(String cam) {
        phone.cam = cam;
        return this;
    }

}
