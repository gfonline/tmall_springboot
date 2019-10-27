package com.gfonline.tmall.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestMall {
    // 测试数据
    public static void main (String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e){
            e.printStackTrace();
        }
        try {
            String password = "gcxxy1995125";
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tmall_springboot?useUnicode=true&characterEncoding=utf8",
                    "root", password);
            Statement s = c.createStatement();

            for (int i = 1; i <= 10; i++) {
                String sqlFormat = "insert into category values (null, '测试分类%d')";
                String sql = String.format(sqlFormat, i);
                s.execute(sql);
            }
            System.out.println("已成功创建10条测试数据");
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
