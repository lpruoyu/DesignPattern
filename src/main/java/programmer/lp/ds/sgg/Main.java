package programmer.lp.ds.sgg;

import programmer.lp.ds.sgg.builder.AbstractPhone;
import programmer.lp.ds.sgg.builder.AbstractPhoneBuilder;
import programmer.lp.ds.sgg.builder.HuaweiPhoneBuilder;
import programmer.lp.ds.sgg.builder.VivoPhone;
import programmer.lp.ds.sgg.factory.abstractfactory.CommonMaskFactory;
import programmer.lp.ds.sgg.factory.abstractfactory.LPGroup;
import programmer.lp.ds.sgg.factory.abstractfactory.MiniCarFactory;
import programmer.lp.ds.sgg.factory.abstractfactory.N95MaskFactory;
import programmer.lp.ds.sgg.singleton.Singleton04;
import programmer.lp.ds.sgg.singleton.Utils;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        System.out.println(VivoPhone.builder().cam("1亿像素")
                .cpu("骁龙8888")
                .dis("1T")
                .mem("512G")
                .build());

        AbstractPhoneBuilder builder = new HuaweiPhoneBuilder();
        final AbstractPhone phone =
                 builder.cam("1亿像素")
                        .cpu("骁龙8888")
                        .dis("1T")
                        .mem("512G")
                        .build();
        System.out.println(phone);
    }

    public static void main1(String[] args) {
        LPGroup group = new MiniCarFactory();
        group.newCar().run();

        group = new N95MaskFactory();
        group.newMask().protectedMe();
        group = new CommonMaskFactory();
        group.newMask().protectedMe();

//        AbstractCarFactory factory = new MiniCarFactory();
//        factory.newCar().run();
//        factory = new VanCarFactory();
//        factory.newCar().run();
//        factory = new RacingCarFactory();
//        factory.newCar().run();

//        SimpleCarFactory sf = new SimpleCarFactory();
//        sf.newCar("van").run();
//        sf.newCar("mini").run();
    }

    public static void main2(String[] args) throws Exception {
        System.out.println(Utils.getThreadPool() == Utils.getThreadPool());
        System.getProperties();
    }

    private static void bad()
            throws Exception {
        // 反射可以破坏单例模式，解决：静态内部类式
        final Class<?> clazz = Class.forName("programmer.lp.ds.sgg.singleton.Singleton04");
        final Constructor<?> defaultConstructor = clazz.getDeclaredConstructor();
        defaultConstructor.setAccessible(true);
        final Object o = defaultConstructor.newInstance();
        System.out.println(o == Singleton04.getInstance());
    }
}
