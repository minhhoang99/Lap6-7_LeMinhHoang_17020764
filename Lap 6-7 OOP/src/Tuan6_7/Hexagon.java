package Tuan6_7;

/**
 * Khai báo lớp Hexagon đại diện cho hình lục giác đều là lớp con của lớp Shape
 *
 * @author LeMinhHoang
 */
public class Hexagon extends Shape {

    private double hoanhdoTam;	//hoành độ tâm của hình lục giác đều

    private double tungdoTam;	//tung độ tâm của hình lục giác đều

    private double bankinh;	//bán kính của hình lục giác đều

    Hexagon() {
        super();
        setHoanhdoTam(1.0);
        setTungdoTam(1.0);
        setBankinh(1.0);
    }

    public Hexagon(double hoanhdoTam, double tungdoTam, double bankinh) {
        setHoanhdoTam(hoanhdoTam);
        setTungdoTam(tungdoTam);
        setBankinh(bankinh);
    }

    public Hexagon(double hoanhdoTam, double tungdoTam, double bankinh, boolean tomau, boolean dichchuyen) {
        super(tomau, dichchuyen);
        setHoanhdoTam(hoanhdoTam);
        setTungdoTam(tungdoTam);
        setBankinh(bankinh);
    }

    /**
     * Set hoành độ tâm của hình lục giác đều
     *
     * @param hoanhdoTam hoành độ tâm của hình lục giác đều
     */
    public void setHoanhdoTam(double hoanhdoTam) {
        this.hoanhdoTam = hoanhdoTam;
    }

    /**
     * Lấy giá trị hoành độ tâm của hình lục giác đều
     *
     * @return giá trị hoành độ tâm của hình lục giác đều
     */
    public double getHoanhdoTam() {
        return hoanhdoTam;
    }

    /**
     * Set giá trị tung độ tâm của hình lục giác đều
     *
     * @param tungdoTam tung độ tâm của hình lục giác đều
     */
    public void setTungdoTam(double tungdoTam) {
        this.tungdoTam = tungdoTam;
    }

    /**
     * Lấy giá trị tung độ tâm của hình lục giác đều
     *
     * @return giá trị tung độ tâm của hình lục giác đều
     */
    public double getTungdoTam() {
        return tungdoTam;
    }

    /**
     * Set giá trị bán kính của hình lục giác đều
     *
     * @param bankinh giá trị bán kính của hình lục giác đều
     */
    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    /**
     * Lấy giá trị bán kính của hình lục giác đều
     *
     * @return giá trị bán kính của hình lục giác đều
     */
    public double getBankinh() {
        return bankinh;
    }

    /**
     * tính diện tích của hình lục giác đều
     *
     * @param bankinh bán kính của hình lục giác đều
     *
     * @return diện tích của hình lục giác đều
     */
    public double getDientich() {
        return 6 * 1 / 2 * bankinh * bankinh * (Math.sqrt(3) / 2);
    }

    /**
     * tính chu vi của hình lục giác đều
     *
     * @param bankinh bán kính của hình lục giác đều
     *
     * @return chu vi của hình lục giác đều
     */
    public double getChuvi() {
        return 6 * 3 * bankinh;
    }

    /**
     * trả về chuỗi các thuộc tính của hình lục giác đều
     *
     * @return các thuộc tính của hình lục giác đều
     */
    @Override
    public String toString() {
        String output = 
        		"Hoành độ tâm của hình lục giác đều là: " + getHoanhdoTam()
                + "\nTung độ tâm của hình lục giác đều là: " + getTungdoTam()
                + "\nBán kính của hình lục giác đều là: " + getBankinh()
                + "\nDiện tích của hình lục giác đều là: " + getDientich()
                + "\nChu vi của hình lục giác đều là: " + getChuvi()
                + "\nHình được tô màu: " + isTomau()
                + "\nHình có thể di chuyển: " + isDichchuyen();
        return output;
    }
}
