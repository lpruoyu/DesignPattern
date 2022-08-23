package programmer.lp.ds.sgg.singleton;

// 静态内部类式
public final class Singleton05 {
    private Singleton05() {
        // 防止反射创建对象
        if (InstanceHolder.INSTANCE != null) {
            throw new RuntimeException("禁止反射创建单例对象");
        }
    }
    private static final class InstanceHolder {
        private static final Singleton05 INSTANCE = new Singleton05();
    }
    public static Singleton05 getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
