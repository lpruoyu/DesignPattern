package programmer.lp.ds.sgg.builder;

public abstract class AbstractPhoneBuilder {
    protected AbstractPhone phone;
    public AbstractPhone build() {
        return phone;
    }

    public abstract AbstractPhoneBuilder cpu(String cpu);
    public abstract AbstractPhoneBuilder mem(String mem);
    public abstract AbstractPhoneBuilder dis(String dis);
    public abstract AbstractPhoneBuilder cam(String cam);
}
