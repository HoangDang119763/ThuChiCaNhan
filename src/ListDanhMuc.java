import java.io.*;
import java.util.ArrayList;

public class ListDanhMuc {
    private ArrayList<DanhMuc> listDanhMuc;

    public ListDanhMuc() {
        this.listDanhMuc = new ArrayList<>();
    }

    public ListDanhMuc(ArrayList<DanhMuc> listDanhMuc) {
        this.listDanhMuc = listDanhMuc;
    }

    public void themDanhMuc(DanhMuc danhMuc) {
        this.listDanhMuc.add(danhMuc);
    }

    public void xoaHetDanhMuc() {
        this.listDanhMuc.removeAll(this.listDanhMuc);
    }

    //Cập nhật danh sách từ file
    public void capNhatDanhSachDanhMucTuFile(String fileName) {
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            try {
                while (true) {
                    Object obj = objectIn.readObject();
                    if (obj instanceof DanhMuc) {
                        DanhMuc danhMuc = (DanhMuc) obj;
                        this.listDanhMuc.add(danhMuc);
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
    public void capNhatDanhSachDanhMucVaoFile(String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            for (DanhMuc danhMuc : listDanhMuc) {
                objectOut.writeObject(danhMuc);
            }
            objectOut.close();
            fileOut.close();
            //System.out.println("Đã lưu thành công!");
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println("Lưu thất bại!");
        }
    }
}
