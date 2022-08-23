package programmer.lp.ds.sgg.factory.factorymethod;

public class MiniCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new MiniCar();
    }
}
