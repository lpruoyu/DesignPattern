package programmer.lp.ds.sgg.factory.abstractfactory;

public class MiniCarFactory extends LPCarCompany {
    @Override
    public AbstractCar newCar() {
        return new MiniCar();
    }
}
