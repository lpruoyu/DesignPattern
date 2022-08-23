package programmer.lp.ds.sgg.builder;

public class AbstractPhone {
    protected String cpu;
    protected String mem;
    protected String cam;
    protected String dis;

    @Override
    public String toString() {
        return "AbstractPhone{" +
                "cpu='" + cpu + '\'' +
                ", mem='" + mem + '\'' +
                ", cam='" + cam + '\'' +
                ", dis='" + dis + '\'' +
                '}';
    }

    public String getCpu() {
        return cpu;
    }

    public String getMem() {
        return mem;
    }

    public String getCam() {
        return cam;
    }

    public String getDis() {
        return dis;
    }
}
