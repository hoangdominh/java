package BaiTap2_SvaeBinaryFile.Model;

import java.io.Serializable;

public class Product implements Serializable {
    private int maSanPham;
    private String tenSanPham;
    private String hangSanXuat;
    private double gia;
    private String moTa;

    public Product() {
    }

    public Product(int maSanPham, String tenSanPham, String hangSanXuat, double gia, String moTa) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.gia = gia;
        this.moTa = moTa;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public double getGia() {
        return gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getFileLine(){
        return maSanPham+","+tenSanPham+","+hangSanXuat+","+gia+","+moTa;
    }

    public void parse(String line){
        String[] params = line.split(",");

        maSanPham = Integer.parseInt(params[0]);
        tenSanPham = params[1];
        hangSanXuat = params[2];
        gia = Double.parseDouble(params[3]);
        moTa = params[4];
    }
    @Override
    public String toString() {
        return "Product{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", gia=" + gia +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}
