package programmer.lp.ds.sgg.factory.abstractfactory;

public abstract class LPCarCompany implements LPGroup {
    // 汽车工厂不需要生产口罩
    @Override
    public AbstractMask newMask() {
        return null;
    }
}
