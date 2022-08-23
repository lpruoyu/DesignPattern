package programmer.lp.ds.sgg.factory.abstractfactory;

public class CommonMaskFactory extends LPMaskCompany {
    @Override
    public AbstractMask newMask() {
        return new CommonMask();
    }
}
