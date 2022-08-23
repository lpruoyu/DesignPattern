package programmer.lp.ds.sgg.builder;

public class XiaomiPhoneBuilder extends AbstractPhoneBuilder {

    public XiaomiPhoneBuilder() {
        phone = new XiaomiPhone();
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
