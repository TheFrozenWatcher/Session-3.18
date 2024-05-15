package com.ra.baitap3_ss17.untiy;

import com.ra.baitap3_ss17.Model.Category;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public class DaoCatalog {
    public List<Category> getList() {
        Connection conn = GetConnection.getConn();
        List<Category> list = new ArrayList<>();
        try {
            PreparedStatement pre = conn.prepareStatement("select * from category");
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                list.add(Category.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .status(rs.getBoolean(3))
                        .build());
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            GetConnection.close(conn);
        }
    }
    public void delete(int id){
        Connection connection = GetConnection.getConn();
        PreparedStatement pre = null;
        try {
            pre = connection.prepareStatement("delete from category where id=?");
            pre.setInt(1,id);
            pre.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            GetConnection.close(connection);
        }

    }
    public void update(Category category){
        Connection connection = GetConnection.getConn();
        PreparedStatement pre = null;
        try {
            pre=connection.prepareStatement("update category set name=?,status=? where id = ?");
            pre.setString(1,category.getName());
            pre.setBoolean(2,true);
            pre.setInt(3,category.getId());
            pre.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            GetConnection.close(connection);
        }
    }
    public void insert(Category category){
        Connection connection = GetConnection.getConn();
        PreparedStatement pre = null;
        try {
            pre=connection.prepareStatement("insert into category (name,status) values(?,true)");
            pre.setString(1,category.getName());
            pre.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            GetConnection.close(connection);
        }
    }

}

