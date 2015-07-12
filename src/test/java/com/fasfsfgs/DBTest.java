package com.fasfsfgs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Ignore;
import org.junit.Test;
import org.postgresql.ds.PGPoolingDataSource;

public class DBTest {

  @Ignore
  @Test
  public void testConnection() throws SQLException {
    Connection conn =
        DriverManager.getConnection("jdbc:postgresql://localhost/testdb", "testdbuser", "123456");

    String sql = "select * from despesa";
    PreparedStatement st = conn.prepareStatement(sql);
    ResultSet rs = st.executeQuery();
    System.out.println("select executado");
    while (rs.next()) {
      System.out.println(rs.getString(1));
    }
    rs.close();
    st.close();

    PreparedStatement ps = conn.prepareStatement("INSERT INTO despesa(descricao) values (?)");
    ps.setString(1, "oi");
    ps.executeUpdate();
    System.out.println("insert executado");
    st.close();
  }

  @Test
  public void testDS() throws SQLException {
    PGPoolingDataSource ds = new PGPoolingDataSource();
    ds.setDataSourceName("testbd-ds");
    ds.setServerName("localhost");
    ds.setDatabaseName("testdb");
    ds.setUser("testdbuser");
    ds.setPassword("123456");
    ds.setMaxConnections(5);

    Connection conn = ds.getConnection();

    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("select * from despesa");
    System.out.println("select executado");
    while (rs.next()) {
      System.out.println(rs.getString(1));
    }
    rs.close();
    st.close();
    conn.close();
  }

}
