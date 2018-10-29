package Tuan6_7;

/**
 * Khai báo lớp Circle đại diện hình tròn là lớp con của lớp Shape
 *
 * @author LeMinhHoang
 */
public class Circle extends Shape {

    private double hoanhdoTam;	//hoành độ tâm của hình tròn

    private double tungdoTam;	//tung độ tâm của hình tròn

    private double bankinh;	//bán kính của hình tròn

    final double Pi = 3.1415;	//số Pi

    Circle() {
        super();
        setTungdoTam(1.0);
        setHoanhdoTam(1.0);
        setBankinh(1.0);
    }

    public Circle(double hoanhdoTam, double tungdoTam, double bankinh) {
        setHoanhdoTam(hoanhdoTam);
        setTungdoTam(tungdoTam);
        setBankinh(bankinh);
    }

    public Circle(double hoanhdoTam, double tungdoTam, double bankinh, boolean tomau, boolean dichchuyen) {
        super(tomau, dichchuyen);
        setHoanhdoTam(hoanhdoTam);
        setTungdoTam(tungdoTam);
        setBankinh(bankinh);
    }

    /**
     * Set giá trị hoành độ tâm hình tròn
     *
     * @param HoanhdoTam hoành độ tâm của hình tròn
     */
    public void setHoanhdoTam(double hoanhdoTam) {
        this.hoanhdoTam = hoanhdoTam;
    }

    /**
     * Lấy giá trị hoành độ tâm hình tròn
     *
     * @return giá trị hoành độ tâm của hình tròn
     */
    public double getHoanhdoTam() {
        return hoanhdoTam;
    }

    /**
     * Set giá trị tung độ tâm hình tròn
     *
     * @param tungdoTam giá trị tung độ tâm của hình tròn
     */
    public void setTungdoTam(double tungdoTam) {
        this.tungdoTam = tungdoTam;
    }

    /**
     * Lấy giá trị tung độ tâm hình tròn
     *
     * @return giá trị tung độ tâm của hình tròn
     */
    public double getTungdoTam() {
        return tungdoTam;
    }

    /**
     * Set giá trị bán kính hình tròn
     *
     * @param bankinh giá trị bán kính của hình tròn
     */
    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    /**
     * Lấy giá trị bán kính hình tròn
     *
     * @return giá trị bán kính của hình tròn
     */
    public double getBankinh() {
        return bankinh;
    }

    /**
     * Tính diện tích của hình tròn
     *
     * @param bankinh: bán kính của hình tròn
     * @param PI: số pi
     *
     * @return diện tích của hình tròn
     */
    public double getDientich() {
        return Pi * bankinh * bankinh;
    }

    /**
     * Tính chu vi của hình tròn
     *
     * @param bankinh: bán kính của hình tròn
     *
     * @return chu vi của hình tròn
     */
    public double getChuvi() {
        return Pi * bankinh * 2;
    }

    /**
     * trả về các thuộc tính của hình tròn
     *
     * @return các thuộc tính của hình tròn
     */
    @Override
    public String toString() {
        String output = 
        		"Hoành độ tâm của hình tròn là: " + getHoanhdoTam()
                + "\nTung độ tâm của hình tròn là: " + getTungdoTam()
                + "\nBán kính của hình tròn là: " + getBankinh()
                + "\nDiện tích của hình tròn là: " + getDientich()
                + "\nChu vi của hình tròn là: " + getChuvi()
                + "\nHình được tô màu: " + isTomau()
                + "\nHình có thể di chuyển: " + isDichchuyen();
        return output;
    }

}
