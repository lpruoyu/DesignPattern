package programmer.lp.ds.sgg.factory.abstractfactory;

public class VanCarFactory extends LPCarCompany {
    @Override
    public AbstractCar newCar() {
        return new VanCar();
    }
}
