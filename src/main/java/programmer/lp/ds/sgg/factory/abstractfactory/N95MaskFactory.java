package programmer.lp.ds.sgg.factory.abstractfactory;

public class N95MaskFactory extends LPMaskCompany {
    @Override
    public AbstractMask newMask() {
        return new N95Mask();
    }
}
