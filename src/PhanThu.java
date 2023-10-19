import java.util.ArrayList;

public class PhanThu {
    private ArrayList<DanhMuc> listThu;

    public PhanThu() {
        this.listThu = new ArrayList<>();
    }

    public PhanThu(ArrayList<DanhMuc> listChi) {
        this.listThu = listChi;
    }

    public themDanhMuc(DanhMuc danhMuc) {
        this.listThu.add(danhMuc);
    }
}
