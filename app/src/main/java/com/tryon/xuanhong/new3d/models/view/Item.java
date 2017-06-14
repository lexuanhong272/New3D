package com.tryon.xuanhong.new3d.models.view;

/**
 * Created by Pinky on 26-Apr-17.
 */

public class Item {
    public String ten;
    public String mota;
    public Integer gia;
    public Integer hinh;

    public Item(String mota, Integer gia, String ten, Integer h) {
        this.mota = mota;
        this.gia = gia;
        this.ten = ten;
        this.hinh = h;
    }
}
