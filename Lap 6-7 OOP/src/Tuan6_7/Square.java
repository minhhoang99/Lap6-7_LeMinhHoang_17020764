package Tuan6_7;

/**
 * Khai báo lớp Square đại diện hình vuông là lớp con của lớp Shape
 *
 * @author LeMinhHoang
 */
public class Square extends Shape {

    private double hoanhdoTam;	//hoành độ tâm của hình vuông

    private double tungdoTam;	//tung độ tâm của hình vuông

    private double canhhinhvuong;	//cạnh của hình vuông

    Square() {
        super();
        setTungdoTam(1.0);
        setHoanhdoTam(1.0);
        setCanhhinhvuong(1.0);
    }

    public Square(double hoanhdoTam, double tungdoTam, double canhhinhvuong) {
        setHoanhdoTam(hoanhdoTam);
        setTungdoTam(tungdoTam);
        setCanhhinhvuong(canhhinhvuong);
    }

    public Square(double hoanhdoTam, double tungdoTam, double canhhinhvuong, boolean tomau, boolean dichchuyen) {
        super(tomau, dichchuyen);
        setHoanhdoTam(hoanhdoTam);
        setTungdoTam(tungdoTam);
        setCanhhinhvuong(canhhinhvuong);
    }

    /**
     * Set giá trị hoành độ tâm của hình vuông
     *
     * @param HoanhdoTam hoành độ tâm của hình vuông
     */
    public void setHoanhdoTam(double hoanhdoTam) {
        this.hoanhdoTam = hoanhdoTam;
    }

    /**
     * Lấy giá trị hoành độ tâm của hình vuông
     *
     * @return giá trị hoành độ tâm của hình vuông
     */ 
    public double getHoanhdoTam() {
        return hoanhdoTam;
    }

    /**
     * Set giá trị tung độ tâm của hình vuông
     *
     * @param tungdoTam giá trị tung độ tâm của hình vuông
     */
    public void setTungdoTam(double tungdoTam) {
        this.tungdoTam = tungdoTam;
    }

    /**
     * Lấy giá trị tung độ tâm của hình vuông
     *
     * @return giá trị tung độ tâm của hình vuông
     */
    public double getTungdoTam() {
        return tungdoTam;
    }

    /**
     * Set giá trị cạnh của hình vuông
     *
     * @param bankinh giá cạnh của hình vuông
     */
    public void setCanhhinhvuong(double canhhinhvuong) {
        this.canhhinhvuong = canhhinhvuong;
    }

    /**
     * Lấy giá trị cạnh của hình vuông
     *
     * @return giá trị cạnh của hình vuông
     */
    public double getCanhhinhvuong() {
        return canhhinhvuong;
    }

    /**
     * tính diện tích của hình vuông
     *
     * @param canhhinhvuong: cạnh của hình vuông
     *
     * @return diện tích của hình vuông
     */
    public double getDientich() {
        return canhhinhvuong * canhhinhvuong;
    }

    /**
     * tính chu vi của hình vuông
     *
     * @param canhhinhvuong: cạnh của hình vuông
     *
     * @return chu vi của hình vuông
     */
    public double getChuvi() {
        return canhhinhvuong * 4;
    }

    /**
     * trả về các thuộc tính của hình vuông
     *
     * @return các thuộc tính của hình vuông
     */
    @Override
    public String toString() {
        String output = 
        		"Hoành độ tâm của hình vuông là: " + getHoanhdoTam()
                + "\nTung độ tâm của hình vuông là: " + getTungdoTam()
                + "\nDiện tích của hình vuông là: " + getDientich()
                + "\nChu vi của hình vuông là: " + getChuvi()
                + "\nHình được tô màu: " + isTomau()
                + "\nHình có thể di chuyển: " + isDichchuyen();
        return output;
    }

}
