package model;

/**
 * Created by kale on 2017/9/21.
 */
public class Series extends Film {
    //含税定价
    private String price;

    public Series(String elementType, String id, String action, String name, String code, String licensingWindowStart, String licensingWindowEnd, String type) {
        super(elementType, id, action, name, code, licensingWindowStart, licensingWindowEnd, type);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
