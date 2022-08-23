package programmer.lp.ds.sgg.factory.factorymethod;

public class RacingCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new RacingCar();
    }
}
