package programmer.lp.ds.sgg.prototype;

import java.io.*;

public class Person implements Cloneable, Serializable {
    private static final long serialVersionUID = 497940422888L;
    private Dog dog;

    @Override
    public Person clone() {
        try (
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bos);
        ) {
            oos.writeObject(this);
            try (
                    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                    ObjectInputStream ois = new ObjectInputStream(bis);
            ) {
                return (Person) ois.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
