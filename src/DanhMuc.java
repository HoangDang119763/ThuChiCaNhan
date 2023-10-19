public class DanhMuc {
    private String maDanhMuc;
    private String tenDanhMuc;
    private String tenDanhMucCha;

    public DanhMuc() {
    }

    public DanhMuc(String maDanhMuc, String tenDanhMuc, String tenDanhMucCha) {
        this.maDanhMuc = maDanhMuc;
        this.tenDanhMuc = tenDanhMuc;
        this.tenDanhMucCha = tenDanhMucCha;
    }

    public String getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public String getTenDanhMucCha() {
        return tenDanhMucCha;
    }

    public void setTenDanhMucCha(String tenDanhMucCha) {
        this.tenDanhMucCha = tenDanhMucCha;
    }


}
