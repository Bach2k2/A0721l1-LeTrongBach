package dao;

import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDAO{
    private String jdbcURL="jdbc:mysql://localhost:3306/demo?useSSL=false";
    private String jdbcUsername="root";
    private String jdbcPassword="bach2002";

    private static final String SelectAllUsers="select * from user";
    private static final String
    @Override
    public void insertUser(User user) throws SQLException {

    }

    @Override
    public User selectUser(int id) {
        return null;
    }

    @Override
    public List<User> selectAllUsers() {
        List<User> users=new ArrayList<>();
        Connection connection = null;
        try
        {
            PreparedStatement preparedStatement= connection.prepareStatement("select * from user");
            System.out.println(preparedStatement);
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next())
            {
                int id = rs.getInt("id");
                String name= rs.getString("name");
                String email=rs.getString("email");
                String country=rs.getString("country");
                User user=new User(id,name,email,country);
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return false;
    }
}
