import java.util.Scanner;

public abstract class User {
    private String tenDangNhap;
    private String matKhau;
    private String email;

    private int soLuongDanhMuc;

    public User() {
    }

    public User(String tenDangNhap, String matKhau, String email) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.email = email;
    }

    public User(String tenDangNhap, String matKhau, String email, int soLuongDanhMuc) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.email = email;
        this.soLuongDanhMuc = soLuongDanhMuc;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSoLuongDanhMuc() {
        return soLuongDanhMuc;
    }

    public void setSoLuongDanhMuc(int soLuongDanhMuc) {
        this.soLuongDanhMuc = soLuongDanhMuc;
    }

    public void nhapDuLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tài khoản: ");
        setTenDangNhap(sc.nextLine().toLowerCase());
        System.out.print("Nhập mật khẩu: ");
        setTenDangNhap(sc.nextLine());
    }

    public void dangKyDuLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tài khoản: ");
        setTenDangNhap(sc.nextLine().toLowerCase());
        System.out.print("Nhập mật khẩu: ");
        setTenDangNhap(sc.nextLine());
        System.out.print("Nhập email: ");
        setTenDangNhap(sc.nextLine());
    }

    //Kiểm tra tài khoản
    public boolean kiemTraTaiKhoan(String taiKhoan) {
        return taiKhoan.equals(getTenDangNhap());
    }

    //Kiểm tra mật khẩu
    public boolean kiemTraMatKhau(String matKhau) {
        return matKhau.equals(getMatKhau());
    }
}
