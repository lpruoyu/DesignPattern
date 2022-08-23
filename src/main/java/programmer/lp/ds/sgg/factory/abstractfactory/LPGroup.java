package programmer.lp.ds.sgg.factory.abstractfactory;

// LP集团，生产车、生产口罩
public interface LPGroup {
    AbstractCar newCar();
    AbstractMask newMask();
}
