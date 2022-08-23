package programmer.lp.ds.sgg.singleton;

// 静态内部类式
public final class Singleton04 {
    private Singleton04() {}
    private static final class InstanceHolder {
        private static final Singleton04 INSTANCE = new Singleton04();
    }
    public static Singleton04 getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
