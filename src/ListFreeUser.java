import java.io.*;
import java.util.ArrayList;

public class ListFreeUser {
    private ArrayList<FreeUser> listFreeUser;

    public ListFreeUser() {
        this.listFreeUser = new ArrayList<>();
    }

    public ListFreeUser(ArrayList<FreeUser> listFreeUser) {
        this.listFreeUser = listFreeUser;
    }

    public void themFreeUser(FreeUser freeUser) {
        this.listFreeUser.add(freeUser);
    }

    public void xoaHetFreeUser() {
        this.listFreeUser.removeAll(this.listFreeUser);
    }

    //Cập nhật danh sách từ file
    public void capNhatDanhSachFreeUserTuFile(String fileName) {
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            try {
                while (true) {
                    Object obj = objectIn.readObject();
                    if (obj instanceof FreeUser) {
                        FreeUser freeUser = (FreeUser) obj;
                        this.listFreeUser.add(freeUser);
                    }
                }
            } catch (EOFException e) {
                //
            }
            objectIn.close();
            fileIn.close();
            //System.out.println("Cập nhật thành công!");
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println("Lỗi khi cập nhật ArrayList!");
        }
    }

    //Lưu danh sách vào file
    public void capNhatDanhSachFreeUserVaoFile(String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            for (FreeUser freeUser : listFreeUser) {
                objectOut.writeObject(freeUser);
            }
            objectOut.close();
            fileOut.close();
            //System.out.println("Đã lưu thành công!");
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println("Lưu thất bại!");
        }
    }

    //Kiểm tra tài khoản người dùng nhập có đúng không (nếu đã đăng kí) và chưa đăng kí
    public boolean kiemTraTaiKhoanMatKhauTuFile(String taiKhoan, String matKhau) {
        boolean flag = false;
        for (FreeUser freeUser : listFreeUser) {
            if (freeUser.kiemTraTaiKhoan(taiKhoan) && freeUser.kiemTraMatKhau(matKhau)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    //Kiểm tra tài khoản
    public boolean kiemTraTaiKhoanTuFile(String taiKhoan) {
        boolean flag = false;
        for (FreeUser freeUser : listFreeUser) {
            if (freeUser.kiemTraTaiKhoan(taiKhoan)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    //Kiểm tra mật khẩu
    public boolean kiemTraMatKhauTuFile(String matKhau) {
        boolean flag = false;
        for (FreeUser freeUser : listFreeUser) {
            if (freeUser.kiemTraMatKhau(matKhau)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
