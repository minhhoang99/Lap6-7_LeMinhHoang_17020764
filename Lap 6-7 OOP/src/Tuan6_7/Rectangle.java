package Tuan6_7;

/**
 * Khai báo lớp rectangle đại diện hình chữ nhật là lớp con của lớp Shape
 *
 * @author LeMinhHoang
 */
public class Rectangle extends Shape {

    private double hoanhdoTam;	//hoành độ tâm hình chữ nhật

    private double tungdoTam;	//tung độ tâm hình chữ nhật

    private double dodai;	//chiều dài hình chữ nhật

    private double dorong;	//chiều rộng hình chữ nhật

    Rectangle() {
        super();
        setTungdoTam(1.0);
        setHoanhdoTam(1.0);
        setDodai(1.0);
        setDorong(1.0);
    }

    public Rectangle(double hoanhdoTam, double tungdoTam, double dodai, double dorong) {
        setHoanhdoTam(hoanhdoTam);
        setTungdoTam(tungdoTam);
        setDodai(dodai);
        setDorong(dorong);
    }

    public Rectangle(double hoanhdoTam, double tungdoTam, double dodai, double dorong, boolean tomau, boolean dichchuyen) {
        super(tomau, dichchuyen);
        setHoanhdoTam(hoanhdoTam);
        setTungdoTam(tungdoTam);
        setDodai(dodai);
        setDorong(dorong);
    }

    /**
     * Set giá trị hoành độ tâm của hình chữ nhật
     *
     * @param HoanhdoTam hoành độ tâm của hình chữ nhật
     */
    public void setHoanhdoTam(double hoanhdoTam) {
        this.hoanhdoTam = hoanhdoTam;
    }

    /**
     * Lấy giá trị hoành độ tâm của hình chữ nhật
     *
     * @return giá trị hoành độ tâm của hình chữ nhật
     */
    public double getHoanhdoTam() {
        return hoanhdoTam;
    }

    /**
     * Set giá trị tung độ tâm của hình chữ nhật
     *
     * @param tungdoTam giá trị tung độ tâm của hình chữ nhật
     */
    public void setTungdoTam(double tungdoTam) {
        this.tungdoTam = tungdoTam;
    }

    /**
     * Lấy giá trị tung độ tâm của hình chữ nhật
     *
     * @return giá trị tung độ tâm của hình nhật
     */
    public double getTungdoTam() {
        return tungdoTam;
    }

    /**
     * Set giá trị độ dài của hình chữ nhật
     *
     * @param dodai giá trị độ dài của hình chữ nhật
     */
    public void setDodai(double dodai) {
        this.dodai = dodai;
    }

    /**
     * Lấy giá trị độ dài của hình chữ nhật
     *
     * @return giá trị độ dài của hình chữ nhật
     */
    public double getDodai() {
        return dodai;
    }

    /**
     * Set giá trị độ rộng của hình chữ nhật
     *
     * @param dorong giá trị độ rộng của hình chữ nhật
     */
    public void setDorong(double dorong) {
        this.dorong = dorong;
    }

    /**
     * Lấy giá trị độ rộng của hình chữ nhật
     *
     * @return giá trị độ rộng của hình chữ nhật
     */
    public double getDorong() {
        return dorong;
    }

    /**
     * tính diện tích hình chữ nhật
     *
     * @param dodai: độ dài của hình chữ nhật
     * @param dorong: độ rộng của hình chữ nhật
     *
     * @return diện tích của hình chữ nhật
     */
    public double getDientich() {
        return dodai * dorong;
    }

    /**
     * tính chu vi hình chữ nhật
     *
     * @param dodai: độ dài của hình chữ nhật
     * @param dorong: độ rộng của hình chữ nhật
     *
     * @return chu vi của hình chữ nhật
     */
    public double getChuvi() {
        return (dodai + dorong) * 2;
    }

    /**
     * trả về chuỗi các thuộc tính của hình tròn
     *
     * @return các thuộc tính của hình tròn
     */
    @Override
    public String toString() {
        String output = 
        		"Hoành độ tâm của hình chữ nhật là: " + getHoanhdoTam()
                + "\nTung độ tâm của hình chữ nhật là: " + getTungdoTam()
                + "\nĐộ dài của hình chữ nhật là: " + getDodai()
                + "\nĐộ rộng của hình chữ nhật là: " + getDorong()
                + "\nDiện tích của hình tròn là: " + getDientich()
                + "\nChu vi của hình tròn là: " + getChuvi()
                + "\nHình được tô màu: " + isTomau()
                + "\nHình có thể di chuyển: " + isDichchuyen();
        return output;
    }

}
