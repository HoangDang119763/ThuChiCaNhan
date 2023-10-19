public class FreeUser extends  User {
    @Override
    public void dangKyDuLieu() {
        super.dangKyDuLieu();
        setSoLuongDanhMuc(20);
    }
}
