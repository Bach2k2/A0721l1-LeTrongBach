package repository;

import model.Ground;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GroundRepos {
    private static String SELECT_ALL_GROUND="select ma_mat_hang,ten_trang_thai,dien_tich,tang,loai_mat_bang,gia,ngay_bat_dau,ngay_ket_thuc from mat_bang ";
    private static String SELECT_A_GROUND_BY_ID="SELECT ma_mat_hang,ten_trang_thai,dien_tich,tang,loai_mat_bang,gia,ngay_bat_dau,ngay_ket_thuc from mat_bang WHERE ma_mat_bang=?";
    private static String INSERT_GROUND="INSERT INTO mat_bang( ma_mat_hang,ma_trang_thai,dien_tich,tang,ma_loai_mat_bang,gia,ngay_bat_dau,ngay_ket_thuc) values(?,?,?,?,?,?,?,?)";
    private static String UPDATE_GROUND="UPDATE FROM mat_bang set ma_trang_thai=?,dien_tich=?,tang=?,ma_loai_mat_bang=?,gia=?,ngay_bat_dau=?,ngay_ket_thuc=? where ma_mat_bang=?";
    private static String DELETE_GROUND="DELETE FROM mat_bang where ma_mat_bang=?";

    private static DBRepos dbRepos=new DBRepos();
    public static List<Ground> selectAllGround()
    {
        List<Ground> groundList=new ArrayList<>();
        try
        {
            PreparedStatement preparedStatement= dbRepos.getAConnect().prepareStatement(SELECT_ALL_GROUND);
            ResultSet rs=preparedStatement.executeQuery();

        }catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        return groundList;
    }
}
