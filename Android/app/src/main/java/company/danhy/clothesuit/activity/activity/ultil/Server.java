package company.danhy.clothesuit.activity.activity.ultil;

public class Server {
// local thanh1  192.168.43.197
 // local thanh2 192.168.8.223
 public static String localhost ="192.168.8.223";
    public static String duongDanLoaiSanPham ="http://"+ localhost +":8080/server/getloaisanpham.php";
    public static String duongDanSanPhamMoiNhat="http://"+ localhost+ ":8080/server/getsanphammoinhat.php";
    public static String duongDanGiay = "http://"+ localhost+ ":8080/server/getsanpham.php?page=";
    public static String duongDanSanPhamFlashSale = "http://"+ localhost+ ":8080/server/getsanphamflashsale.php";
    public static String duongDanThongTinKhachHang ="http://"+ localhost +":8080/server/thongtinkhachhang.php";
    public static String duongDanChiTietDonHang ="http://"+ localhost +":8080/server/chitietdonhang.php";
    public static String signup ="http://"+localhost+":8080/server/signup.php";
    public static String signin ="http://"+ localhost +":8080/server/signin.php";
 }
