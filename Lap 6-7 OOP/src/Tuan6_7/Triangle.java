package Tuan6_7;

/**
 * Khai báo lớp Triangle đại diện hình tam giác là lớp con của lớp Shape
 *
 * @author LeMinhHoang
 */
public class Triangle extends Shape {

    private double tungdoTam;	//tung độ tâm của tam giác

    private double hoanhdoTam;	//hoành độ tâm của tam giác

    private double m;	//cạnh thứ nhất của tam giác

    private double n;	//cạnh thứ hai của tam giác

    private double p;	//cạnh thứ ba của tam giác

    Triangle() {
        super();
        setHoanhdoTam(1.0);
        setTungdoTam(1.0);
        setM(1.0);
        setN(1.0);
        setP(1.0);
    }

    public Triangle(double hoanhdoTam, double tungdoTam, double m, double n, double p) {
        setHoanhdoTam(hoanhdoTam);
        setTungdoTam(tungdoTam);
        setM(m);
        setN(n);
        setP(p);
    }

    public Triangle(double hoanhdoTam, double tungdoTam, double m, double n, double p, boolean tomau, boolean dichchuyen) {
        super(tomau, dichchuyen);
        setHoanhdoTam(hoanhdoTam);
        setTungdoTam(tungdoTam);
        setM(m);
        setN(n);
        setP(p);
    }

    /**
     * Set giá trị hoành độ tâm của tam giác
     *
     * @param hoanhdoTam giá trị hoành độ tâm của tam giác
     */
    
    public void setHoanhdoTam(double hoanhdoTam) {
        this.hoanhdoTam = hoanhdoTam;
    }

    /**
     * Lấy giá trị hoành độ tâm của tam giác
     *
     * @return giá trị hoành độ tâm của tam giác
     */
    public double getHoanhdoTam() {
        return hoanhdoTam;
    }

    /**Set giá trị tung độ tâm của tam giác
     *
     * @param tungdoTam giá trị tung độ tâm của tam giác
     */
    public void setTungdoTam(double tungdoTam) {
        this.tungdoTam = tungdoTam;
    }

    /**
     * Lấy giá trị tung độ tâm của tam giác
     *
     * @return giá trị tung độ tâm của tam giác
     */
    public double getTungdoTam() {
        return tungdoTam;
    }

    /**
     * Set giá trị cạnh thứ nhất của tam giác
     *
     * @param M giá trị cạnh thứ nhất của tam giác
     */
    public void setM(double m) {
        this.m = m;
    }

    /**
     * Lấy giá trị cạnh thứ nhất của tam giác
     *
     * @return giá trị cạnh thứ nhất của tam giác
     */
    public double getM() {
        return m;
    }

    /**
     * Set giá trị cạnh thứ hai của tam giác
     *
     * @param N giá trị cạnh thứ hai của tam giác
     */
    public void setN(double n) {
        this.n = n;
    }

    /**
     * Lấy giá trị cạnh thứ hai của tam giác
     *
     * @return giá trị cạnh thứ hai của tam giác
     */
    public double getN() {
        return n;
    }

    /**
     * Set giá trị cạnh thứ ba của tam giác
     *
     * @param P giá trị cạnh thứ ba của tam giác
     */
    public void setP(double p) {
        this.p = p;
    }

    /**
     * Lấy giá trị cạnh thứ ba của tam giác
     *
     * @return giá trị cạnh thứ ba của tam giác
     */
    public double getP() {
        return p;
    }

    /**
     * Tính diện tích của tam giác
     *
     * @param p0: nửa chu vi hình tam giác
     * @param m: cạnh thứ nhất của tam giác
     * @param n: cạnh thứ hai của tam giác
     * @param p: cạnh thứ ba của tam giác
     *
     * @return diện tích của tam giác
     */
    public double getDientich() {
        double p0 = getChuvi() / 2;
        return Math.sqrt(p0 * (p0 - m) * (p0 - n) * (p0 - p));
    }

    /**
     * Tính chu vi của tam giác
     *
     * @param m: cạnh thứ nhất của tam giác
     * @param n: cạnh thứ hai của tam giác
     * @param p: cạnh thứ ba của tam giác
     *
     * @return chu vi của tam giác
     */
    public double getChuvi() {
        return m + n + p;
    }

    /**
     * Trả về các thuộc tính của tam giác
     *
     * @return các thuộc tính của tam giác
     */
    @Override
    public String toString() {
        String output = 
        		"Hoành độ tâm của tam giác là: " + getHoanhdoTam()
                + "\nTung độ tâm của tam giác là: " + getTungdoTam()
                + "\nCạnh thứ nhất của tam giác là: " + getM()
                + "\nCạnh thứ hai của tam giác là: " + getN()
                + "\nCạnh thứ ba của tam giác là: " + getP()
                + "\nDiện tích của tam giác là: " + getDientich()
                + "\nChu vi của tam giác là: " + getChuvi()
                + "\nHình được tô màu: " + isTomau()
                + "\nHình có thể dịch chuyển: " + isDichchuyen();
        return output;

    }
}
