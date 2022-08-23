package programmer.lp.ds.sgg.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 单例应用：线程池（系统只应该存在一个线程池）
public final class Utils {
    private static final int THREADS_COUNT = 10;
    private Utils() {}
    public static ExecutorService getThreadPool() {
        return ExecutorServiceInstanceHolder.INSTANCE;
    }
    private static final class ExecutorServiceInstanceHolder {
        private static final ExecutorService INSTANCE = Executors.newFixedThreadPool(THREADS_COUNT);
    }
}
