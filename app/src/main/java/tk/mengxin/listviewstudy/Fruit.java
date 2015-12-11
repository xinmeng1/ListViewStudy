package tk.mengxin.listviewstudy;

/**
 * Created by Android Studio.
 * User: Xin Meng
 * Date: 11/12/2015
 * Time: 23:04
 * Version: V 1.0
 */

public class Fruit {

    private String name;
    private int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }
    public int getImageId() {
        return imageId;
    }
}
