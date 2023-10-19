import java.io.File;
import java.util.Scanner;

public class Menu implements FileName {
    Scanner sc = new Scanner(System.in);
    FreeUser freeUser = new FreeUser();

    ProUser proUser = new ProUser();
    ListFreeUser listFreeUser = new ListFreeUser();

    //Kiểm tra file tồn tại không
    public boolean fileExist(String fileName) {
        File file = new File(fileName);
        return file.exists();
    }

    public void loginUser() {
        int playerChoice;
        do {
            System.out.println("====> CLIENT <====");
            System.out.println("1.Đăng nhập\n2.Đăng kí\n3.Quên MK\n0.Thoát");

            playerChoice = Integer.parseInt(sc.nextLine());
            switch (playerChoice) {
                case 0:
                    break;
                case 1:
//                    int count = 0;
//                    listUser.removeAllUser();
//                    //Đăng nhập
//                    do {
//                        if (count == 3) {
//                            System.out.println("Bạn đã nhập sai quá 3 lần!");
//                            askForRegister();
//                            System.out.println("THÔNG BÁO THOÁT RA CLIENT!");
//                            break;
//                        }
//                        login();
//                        if (fileExist(fileUser))
//                            listUser.updateListUserFromFile(fileUser);
//                        //Nếu kiểm tra trong file có tài khoàn này thì đăng nhập thành công
//                        //Nếu flag = true có nghĩa là tải khoàn và mật khẩu đều đúng
//                        if (listUser.checkInputUserFromFile(user.getNameID(), user.getPasswordID())) break;
//                        else {
//                            notificationUser();
//                            count++;
//                        }
//                    } while (true);
//                    //Nếu đăng nhập không thành công thì ra màn hình CLIENT
//                    if (count == 3) break;
//
//                    //Vô game
//                    user.setNamePlayer(listUser.getNamePlayerFromList(user.getNameID()));
//                    user.setGold(listUser.getGoldPlayerFromListByNameID(user.getNameID()));
//                    user.setDiamond(listUser.getDiamondPlayerFromListByNameID(user.getNameID()));
//                    playerChoice();
//                    //Khởi tạo lại User mới để đăng nhập tiếp
//                    listUser.removeAllUser();
//                    user = new User();
//                    break;
                case 2:
                    //Đăng kí
                    register();//Done!
                    break;
                case 3:
                    //forgetPasswordID();
                    break;
                case 110604://Chức năng admin

                    break;
                default:
                    //notificationMess();//Done!
                    break;
            }
        } while (playerChoice != 0);
        System.out.println();
    }

    public void login() {
        System.out.println("====> LOGIN <====");
        freeUser.nhapDuLieu();

        //Cần kiểm tra xem tải khoản pro hay free
    }

    public void register() {
        listFreeUser.xoaHetFreeUser();
        if (fileExist(fileFreeUser)) listFreeUser.capNhatDanhSachFreeUserTuFile(fileFreeUser);
        do {
            System.out.println("====> REGISTER <====");
            freeUser.dangKyDuLieu();
            //Nếu không có trong danh sách thì dừng
            if (!listFreeUser.kiemTraTaiKhoanTuFile(freeUser.getTenDangNhap())) break;
            System.out.println("Tài khoản đã có người sử dụng!\nMời bạn nhập lại tài khoản khác");
        } while (true);
        //Them danh mục mặc định

        //Danh muc chi
        DanhMuc danhMucChi = new DanhMuc();
        ListDanhMuc listDanhMucChi = new ListDanhMuc();
        //Lần 1
        danhMucChi.setTenDanhMucCha("Chi");
        danhMucChi.setMaDanhMuc("CH");
        danhMucChi.setTenDanhMuc("Thiết yếu");
        listDanhMucChi.themDanhMuc(danhMucChi);
        //Lần 2
        danhMucChi = new DanhMuc();
        danhMucChi.setTenDanhMucCha("Chi");
        danhMucChi.setMaDanhMuc("CH");
        danhMucChi.setTenDanhMuc("Biếu tặng");
        listDanhMucChi.themDanhMuc(danhMucChi);
        //Lần 3
        danhMucChi = new DanhMuc();
        danhMucChi.setTenDanhMucCha("Chi");
        danhMucChi.setMaDanhMuc("CH");
        danhMucChi.setTenDanhMuc("Sức khỏe");
        listDanhMucChi.themDanhMuc(danhMucChi);
        //Lần 4
        danhMucChi = new DanhMuc();
        danhMucChi.setTenDanhMucCha("Chi");
        danhMucChi.setMaDanhMuc("CH");
        danhMucChi.setTenDanhMuc("Giải trí");
        listDanhMucChi.themDanhMuc(danhMucChi);
        danhMucChi = new DanhMuc();


        //Danh muc thu
        DanhMuc danhMucThu = new DanhMuc();
        ListDanhMuc listDanhMucThu = new ListDanhMuc();
        //Lần 1
        danhMucChi.setTenDanhMucCha("Thu");
        danhMucChi.setMaDanhMuc("TH");
        danhMucChi.setTenDanhMuc("Lương");
        listDanhMucThu.themDanhMuc(danhMucThu);
        danhMucThu = new DanhMuc();
        //Lần 2
        danhMucChi.setTenDanhMucCha("Thu");
        danhMucChi.setMaDanhMuc("TH");
        danhMucChi.setTenDanhMuc("Thưởng");
        listDanhMucThu.themDanhMuc(danhMucThu);
        danhMucThu = new DanhMuc();

        listFreeUser.themFreeUser(freeUser);
        listFreeUser.capNhatDanhSachFreeUserVaoFile(fileFreeUser);
        listFreeUser.xoaHetFreeUser();
        freeUser = new FreeUser();
    }

    public void updateProUser() {
        if (freeUser instanceof FreeUser) {
            ProUser proUser1 = new ProUser();
            proUser1.setTenDangNhap();
        } else {
            System.out.println("Bạn đã là Pro User rồi !!!");
        }
    }
}
