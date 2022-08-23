package programmer.lp.ds.sgg.factory.factorymethod;

/**
 * 工厂的具体产品
 */
public class RacingCar extends AbstractCar {
    public RacingCar() {
        this.engine = "Racing-engine";
    }

    @Override
    public void run() {
        System.out.println(engine+"--》嗖嗖嗖....");
    }
}
