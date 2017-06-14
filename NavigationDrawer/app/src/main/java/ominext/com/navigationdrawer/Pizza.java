package ominext.com.navigationdrawer;

/**
 * Created by LuongHH on 3/24/2017.
 */

public class Pizza {
    private String name;
    private int imageResourceId;
    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.mipmap.ic_launcher),
            new Pizza("Funghi", R.mipmap.ic_launcher_round)
    };
    private Pizza(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
}