package programmer.lp.ds.sgg.factory.factorymethod;

public class VanCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new VanCar();
    }
}
