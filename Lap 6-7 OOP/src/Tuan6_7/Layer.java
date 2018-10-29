package Tuan6_7;

/**
 * Khai báo lớp trừu tượng Layer là lớp con của lớp Diagram
 *
 * @author LeMinhHoang
 */
public abstract class Layer extends Diagram {

    /**
     * hàm xóa đối tượng thuộc lớp Triangle
     *
     * @param x: đối tượng
     *
     * @return đối tượng sau khi xóa
     */
    public static Diagram xoaTriangle(Object x) {
        if (x instanceof Triangle) {
            x = null;
        }
        return (Diagram) x;
    }

    private boolean kiemtra;	//kiểm tra xem hình có được vẽ trên Diagram hay không

    Layer() {
        setKiemtra(false);
    }

    public Layer(boolean kiemtra) {
        setKiemtra(kiemtra);
    }

    /**
     * Set hình có được vẽ trên Diagram hay không
     *
     * @param kiemtra hình có được vẽ hay không
     */
    public void setKiemtra(boolean kiemtra) {
        this.kiemtra = kiemtra;
    }

    /**
     * Hàm isKiemtra kiểm tra hình có được vẽ hay không
     *
     * @return true nếu hình được vẽ và false nếu hình không được vẽ
     */
    public boolean isKiemtra() {
        return kiemtra;
    }

    /**
     * Trả về kết quả hình có được vẽ trên Diagram hay không
     * 
     *
     * @return kết quả hình có được vẽ trên Diagram hay không
     */
    @Override
    public String toString() {
        String output = "Hình được vẽ trên Diagram: " + isKiemtra();
        return output;
    }
}
