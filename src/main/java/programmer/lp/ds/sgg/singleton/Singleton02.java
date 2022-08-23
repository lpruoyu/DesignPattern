package programmer.lp.ds.sgg.singleton;

// 懒汉式
public final class Singleton02 {
    private Singleton02() {
    }
    private static volatile Singleton02 INSTANCE;
    public static Singleton02 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton02.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton02();
                }
            }
        }
        return INSTANCE;
    }
}
