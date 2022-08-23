package programmer.lp.ds.sgg.factory.abstractfactory;

public abstract class LPMaskCompany  implements LPGroup {
    // 口罩工厂不需要生产汽车
    @Override
    public AbstractCar newCar() {
        return null;
    }
}