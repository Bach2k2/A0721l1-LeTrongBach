package repository.employee;

import model.Employee;
import repository.DBRepository;

import javax.naming.ldap.PagedResultsControl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmRepository implements IEmRepository {
    DBRepository dbRepository = new DBRepository();
    private static String SELECT_ALL_EMPLOYEE = "select * from nhan_vien";
    private static String SELECT_EMPLOYEE_BY_ID = "select * from nhan_vien where ma_nhan_vien=?";
    private static String INSERT_EMPLOYEE = "insert into nhan_vien(ma_nhan_vien,ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan) values (?,?,?,?,?,?,?,?,?,?,?)";
    private static String UPDATE_EMPLOYEE = "update nhan_vien set ho_ten=?,ngay_sinh=?,so_cmnd=?,luong=?,so_dien_thoai=?,email=?,dia_chi=?,ma_vi_tri=?,ma_trinh_do=?,ma_bo_phan=? where ma_nhan_vien=?";
    private static String DELETE_EMPLOYEE = "delete from nhan_vien where ma_nhan_vien=?";
    private static String SEARCH_EMPLOYEE = "select * from nhan_vien where ten_nhan_vien like";

    @Override
    public List<Employee> selectAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = dbRepository.getAConnect().prepareStatement(SELECT_ALL_EMPLOYEE);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int emId = rs.getInt("ma_nhan_vien");
                String name = rs.getString("ho_ten");
                String birthday = rs.getString("ngay_sinh");
                String idCard = rs.getString("so_cmnd");
                double salary = rs.getDouble("luong");
                String phone = rs.getString("so_dien_thoai");
                String email = rs.getString("email");
                String address = rs.getString("dia_chi");
                int posId = rs.getInt("ma_vi_tri");
                int eDId = rs.getInt("ma_trinh_do");
                int divisionId = rs.getInt("ma_bo_phan");
                //String username = rs.getString("email");
                Employee employee = new Employee(emId, name, birthday, idCard, salary, phone, email, address, posId, eDId, divisionId);
                employees.add(employee);
            }
            return employees;
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return employees;
    }

    @Override
    public Employee selectEmployeeById(int id) {
        Employee employee = null;
        try {
            PreparedStatement preparedStatement = dbRepository.getAConnect().prepareStatement(SELECT_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("ho_ten");
                String birthday = rs.getString("ngay_sinh");
                String idCard = rs.getString("so_cmnd");
                double salary = rs.getDouble("luong");
                String phone = rs.getString("so_dien_thoai");
                String email = rs.getString("email");
                String address = rs.getString("dia_chi");
                int posId = rs.getInt("ma_vi_tri");
                int eDId = rs.getInt("ma_trinh_do");
                int divisionId = rs.getInt("ma_bo_phan");
                employee = new Employee(id, name, birthday, idCard, salary, phone, email, address, posId, eDId, divisionId);
            }
            return employee;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public void insertEmployee(Employee employee) {
        try {
            PreparedStatement preparedStatement = dbRepository.getAConnect().prepareStatement(INSERT_EMPLOYEE);
            preparedStatement.setInt(1, employee.getEmId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getBirthday());
            preparedStatement.setString(4, employee.getIdCard());
            preparedStatement.setDouble(5, employee.getSalary());
            preparedStatement.setString(6, employee.getPhone());
            preparedStatement.setString(7, employee.getEmail());
            preparedStatement.setString(8, employee.getAddress());
            preparedStatement.setInt(9, employee.getPosId());
            preparedStatement.setInt(10, employee.getEDId());
            preparedStatement.setInt(11, employee.getDivisionId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        boolean updateRows = false;
        try {
            PreparedStatement preparedStatement = dbRepository.getAConnect().prepareStatement(UPDATE_EMPLOYEE);

            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getBirthday());
            preparedStatement.setString(3, employee.getIdCard());
            preparedStatement.setDouble(4, employee.getSalary());
            preparedStatement.setString(5, employee.getPhone());
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setString(7, employee.getAddress());
            preparedStatement.setInt(8, employee.getPosId());
            preparedStatement.setInt(9, employee.getEDId());
            preparedStatement.setInt(10, employee.getDivisionId());
            preparedStatement.setInt(11, employee.getEmId());
            updateRows = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return updateRows;
    }

    @Override
    public boolean deleteEmployee(Employee employee) {
        boolean deleteRows = false;
        try {
            PreparedStatement preparedStatement = dbRepository.getAConnect().prepareStatement(DELETE_EMPLOYEE);
            preparedStatement.setInt(1, employee.getEmId());
            deleteRows = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return deleteRows;
    }

    public List<Employee> searchByName(String name) {
        List<Employee> employees = new ArrayList();
        try {
            PreparedStatement preparedStatement = dbRepository.getAConnect().prepareStatement(SEARCH_EMPLOYEE + "%" + "?" + "%");
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int emId = rs.getInt("ma_nhan_vien");
                String emName = rs.getString("ho_ten");
                String birthday = rs.getString("ngay_sinh");
                String idCard = rs.getString("so_cmnd");
                double salary = rs.getDouble("luong");
                String phone = rs.getString("so_dien_thoai");
                String email = rs.getString("email");
                String address = rs.getString("dia_chi");
                int posId = rs.getInt("ma_vi_tri");
                int eDId = rs.getInt("ma_trinh_do");
                int divisionId = rs.getInt("ma_bo_phan");
                Employee employee = new Employee(emId, emName, birthday, idCard, salary, phone, email, address, posId, eDId, divisionId);
                employees.add(employee);
            }
            return employees;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
