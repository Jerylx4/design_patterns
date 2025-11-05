package com.pdd.patrones.db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDb {
    public static final String URL = "jdbc:sqlite:ejemplo01.db";

    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource ds;

    static {
        config.setJdbcUrl(URL);
        config.setUsername("");
        config.setPassword("");

        ds = new HikariDataSource(config);
    }

    public static final Connection getConnection() {
        try {
            return DriverManager.getConnection(URL);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
