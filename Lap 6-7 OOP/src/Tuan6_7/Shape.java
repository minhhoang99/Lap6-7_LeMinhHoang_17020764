package Tuan6_7;

/**
 * Khai báo lớp trừu tượng Shape đại diện cho hình học là con của lớp Layer
 *
 * @author LeMinhHoang
 */
public abstract class Shape extends Layer {
	
    private boolean tomau;	//hình được tô màu hay không?

    private boolean dichchuyen;	//hình có thể di chuyển hay không?

    Shape() {
        setTomau(true);
        setDichchuyen(true);
    }

    public Shape(boolean tomau, boolean dichchuyen) {
        setTomau(tomau);
        setDichchuyen(dichchuyen);
    }

    /**
     * Set hình được tô màu hay không
     *
     * @param tomau hình được tô màu hay không
     */
    public void setTomau(boolean tomau) {
        this.tomau = tomau;
    }

    /**
     * hàm isTomau kiểm tra xem hình đã được tô màu hay chưa tô màu
     *
     * @return true nếu hình đã tô màu và false nếu hình chưa tô màu
     */
    public boolean isTomau() {
        return tomau;
    }

    /**
     * Set hình có thể dịch chuyển hay không
     *
     * @param dichchuyen hình có thể dịch chuyển hay không
     */
    public void setDichchuyen(boolean dichchuyen) {
        this.dichchuyen = dichchuyen;
    }

    /**
     * hàm isDichchuyen kiểm tra hình có thể dịch chuyển được hay không
     *
     * @return true nếu hình có thể dịch chuyển và false nếu hình không thể dịch chuyển
     * 
     */
    public boolean isDichchuyen() {
        return dichchuyen;
    }

    /**
     * trả về giá trị đầu ra là chuỗi các thuộc tính của hình
     *
     * @return các thuộc tính của hình
     */
    @Override
    public String toString() {
        String output = "Hình được tô màu: " + isTomau() + "\nHình có thể dịch chuyển: " + isDichchuyen();
        return output;
    }
}
