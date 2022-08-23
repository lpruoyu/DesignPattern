package programmer.lp.ds.sgg.factory.abstractfactory;

/**
 * 工厂的具体产品
 */
public class VanCar extends AbstractCar {
    public VanCar() {
        this.engine = "Van-engine";
    }

    @Override
    public void run() {
        System.out.println(engine+"--》嗒嗒嗒....");
    }
}
