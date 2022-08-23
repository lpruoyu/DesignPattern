package programmer.lp.ds.sgg.singleton;

// 饿汉式
public final class Singleton01 {
    private Singleton01() {}
    private static final Singleton01 INSTANCE = new Singleton01();
    public static Singleton01 getInstance() {
        return INSTANCE;
    }
}
