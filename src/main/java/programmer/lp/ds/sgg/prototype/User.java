package programmer.lp.ds.sgg.prototype;

import java.io.Serializable;

public class User implements Cloneable, Serializable {
    private static final long serialVersionUID = 342423222322L;
    private String name;
    private Integer id;

    public User() {
        System.out.println("User对象创建");
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
