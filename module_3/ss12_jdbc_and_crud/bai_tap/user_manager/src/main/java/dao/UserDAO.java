package dao;

import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDAO{
    private String jdbcURL="jdbc:mysql://localhost:3306/ss12_demo_jbdc?useSSL=false";
    private String jdbcUsername="root";
    private String jdbcPassword="bach2002";

    private static final String SelectAllUsers="select * from users";
    private static final String Select_User_By_Id="select id,name,email,country from users where id=?";
    private static final String Insert_Users="insert into users (name,email,country) Values (?,?,?)";
    private static final String Delete_Users="delete from users where id=?";
    private static final String Update_Users="update users set name=?,email=?,country=? where id=?";
    private static int amount=0;
    protected Connection getConnection()
    {
        Connection connection=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);

        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public void insertUser(User user) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement= connection.prepareStatement(Insert_Users);
        preparedStatement.setString(1,user.getName());
        preparedStatement.setString(2,user.getEmail());
        preparedStatement.setString(3,user.getCountry());
        System.out.println(preparedStatement);
        preparedStatement.executeUpdate();
    }

    @Override
    public User selectUser(int id) throws SQLException {
        User user=null;
        try{
            Connection connection= getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(Select_User_By_Id);
            preparedStatement.setInt(1,id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next())
            {
                String name= rs.getString("name");
                String email=rs.getString("email");
                String country=rs.getString("country");
                user=new User(id,name,email,country);
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }

     return user;
    }

    @Override
    public List<User> selectAllUsers() {
        List<User> users=new ArrayList<>();
        Connection connection = getConnection();
        try
        {
            PreparedStatement preparedStatement= connection.prepareStatement("select * from users");
            System.out.println(preparedStatement);
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next())
            {
                int id = rs.getInt("id");
                String name= rs.getString("name");
                String email=rs.getString("email");
                String country=rs.getString("country");
                User user=new User(id,name,email,country);
                users.add(user);
                amount++;
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDelete=false;
        try{
            Connection connection=getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(Delete_Users);
            preparedStatement.setInt(1,id);
            rowDelete=preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdate=false;
        try{
            Connection connection=getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(Update_Users);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,user.getCountry());
            preparedStatement.setInt(4,user.getId());
            rowUpdate=preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdate;
    }

    public int getAmount()
    {
        return amount;
    }
}
