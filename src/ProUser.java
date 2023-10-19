public class ProUser extends User {
    private double gioiHanNganSach;

    @Override
    public void dangKyDuLieu() {
        super.dangKyDuLieu();
        setSoLuongDanhMuc(100);
    }
}
