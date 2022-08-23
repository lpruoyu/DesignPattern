package programmer.lp.ds.sgg.factory.simple;
/**
 * 简单工厂
 * 1、产品数量极少
 */
public class SimpleCarFactory {
    // 好像具有扩展性，但是没有解决实际问题
    public AbstractCar newCar(String type) {
        //核心方法：一切从简
        if ("van".equals(type)) {
            return new VanCar();
        } else if ("mini".equals(type)) {
            return new MiniCar();
        }
        //违反开闭原则。更多的产品，应该直接扩展出一个新类来造
        return null;
    }
}
