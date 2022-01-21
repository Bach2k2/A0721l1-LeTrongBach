package repository.service;

import model.Service;
import repository.DBRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class SerRepository implements ISerRepository {
    private DBRepository dbRepository = new DBRepository();

    private static String SELECT_ALL_SERVICE = "select * from dich_vu";
    private static String INSERT_SERVICE = "insert into " + " dich_vu values (?,?,?,?,?,?,?,?,?,?,?)";
    private static String UPDATE_SERVICE = "update dich_vu set ten_dich_vu=?,dien_tich=?,chi_phi_thue=?,so_nguoi_toi_da=?" +
            ",ma_kieu_thue=?,ma_loai_dich_vu=?,tieu_chuan_phong=?,mo_ta_tien_nghi_khac=?,dien_tich_ho_boi=?,so_tang=? where ma_dich_vu=?";
    private static String SELECT_SERVICE_BY_ID = "select * from dich_vu where ma_dich_vu=?";
    private static String DELETE_SERVICE = "delete from dich_vu where ma_dich_vu=?";

    @Override
    public List<Service> getServiceList() {
        List<Service> serviceList = new LinkedList<>();
        try {
            PreparedStatement preparedStatement = dbRepository.getAConnect().prepareStatement(SELECT_ALL_SERVICE);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int serId = rs.getInt("ma_dich_vu");
                String serName = rs.getString("ten_dich_vu");
                int area = rs.getInt("dien_tich");
                double cost = rs.getDouble("chi_phi_thue");
                int maxPeople = rs.getInt("so_nguoi_toi_da");
                int rentType = rs.getInt("ma_kieu_thue");
                int typeId = rs.getInt("ma_loai_dich_vu");
                String standard = rs.getString("tieu_chuan");
                String description = rs.getString("mo_ta_tien_nghi_khac");
                int poolArea = rs.getInt("dien_tich_ho_boi");
                int numOfFloor = rs.getInt("so_tang");
                Service service = new Service(serId, serName, area, cost, maxPeople, rentType, typeId, standard, description, poolArea, numOfFloor);
                serviceList.add(service);
            }
            return serviceList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return serviceList;
    }

    @Override
    public Service getServiceById(int id) {
        Service service = null;
        try {
            PreparedStatement preparedStatement = dbRepository.getAConnect().prepareStatement(SELECT_SERVICE_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String serName = rs.getString("ten_dich_vu");
                int area = rs.getInt("dien_tich");
                double cost = rs.getDouble("chi_phi_thue");
                int maxPeople = rs.getInt("so_nguoi_toi_da");
                int rentType = rs.getInt("ma_kieu_thue");
                int typeId = rs.getInt("ma_loai_dich_vu");
                String standard = rs.getString("tieu_chuan");
                String description = rs.getString("mo_ta_tien_nghi_khac");
                int poolArea = rs.getInt("dien_tich_ho_boi");
                int numOfFloor = rs.getInt("so_tang");
                service = new Service(id, serName, area, cost, maxPeople, rentType, typeId, standard, description, poolArea, numOfFloor);
            }
            return service;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return service;
    }

    @Override
    public void insertService(Service service) {
        try {
            PreparedStatement preparedStatement = dbRepository.getAConnect().prepareStatement(INSERT_SERVICE);
            preparedStatement.setInt(1,service.getSerId());
            preparedStatement.setString(2,service.getSerName());
            preparedStatement.setInt(3,service.getArea());
            preparedStatement.setDouble(4,service.getCost());
            preparedStatement.setInt(5,service.getMaxPeople());
            preparedStatement.setInt(6,service.getRentType());
            preparedStatement.setInt(7,service.getTypeId());
            preparedStatement.setString(8,service.getStandard());
            preparedStatement.setString(9,service.getDescription());
            preparedStatement.setInt(10,service.getPoolArea());
            preparedStatement.setInt(11,service.getNumOfFloor());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean updateService(Service service) {
        boolean updateRow = false;
        try {
            PreparedStatement preparedStatement = dbRepository.getAConnect().prepareStatement(UPDATE_SERVICE);
            preparedStatement.setString(1,service.getSerName());
            preparedStatement.setInt(2,service.getArea());
            preparedStatement.setDouble(3,service.getCost());
            preparedStatement.setInt(4,service.getMaxPeople());
            preparedStatement.setInt(5,service.getRentType());
            preparedStatement.setInt(6,service.getTypeId());
            preparedStatement.setString(7,service.getStandard());
            preparedStatement.setString(8,service.getDescription());
            preparedStatement.setInt(9,service.getPoolArea());
            preparedStatement.setInt(10,service.getNumOfFloor());
            preparedStatement.setInt(11,service.getSerId());
            updateRow = preparedStatement.executeUpdate() > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return updateRow;
    }

    @Override
    public boolean deleteService(Service service) {
        boolean deleteRows = false;
        try {
            PreparedStatement preparedStatement = dbRepository.getAConnect().prepareStatement(DELETE_SERVICE);
            preparedStatement.setInt(1,service.getSerId());
            deleteRows = preparedStatement.executeUpdate() > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return deleteRows;
    }
}
