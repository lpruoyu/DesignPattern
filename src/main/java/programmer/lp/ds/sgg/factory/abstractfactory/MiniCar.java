package programmer.lp.ds.sgg.factory.abstractfactory;

/**
 * 工厂的具体产品
 */
public class MiniCar extends AbstractCar {
    public MiniCar() {
        this.engine = "Mini-engine";
    }

    @Override
    public void run() {
        System.out.println(engine+"--》嘟嘟嘟....");
    }
}
