package mldn.test;

import java.sql.*;

public class text {

    public static void main(String[] args) {
        String sql = "select * from emp";
        Connection conn = null;// 连接数据库
        Statement st = null;// 数据库语句
        ResultSet rs = null;// 数据库结果集

        try {
            // 注册mysql的jdbc的驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?serverTimezone=UTC", "root", "password");
            // 创建Statement对象
            st = conn.createStatement();
            // 这个对象来发送sql语句，返回一个ResultSet对象
            rs = st.executeQuery(sql);
            // 对这个ResultSet进行遍历
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " ");
                System.out.println(rs.getString(2) + " ");
                System.out.println(rs.getString(3) + " ");
                System.out.println(rs.getDate(4) + " ");
                System.out.println();

            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
