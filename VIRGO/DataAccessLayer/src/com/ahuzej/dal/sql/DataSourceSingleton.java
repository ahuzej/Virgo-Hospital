/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej.dal.sql;

import javax.sql.DataSource;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
/**
 *
 * @author Albert
 */
public class DataSourceSingleton {
    private static final String SERVER_NAME = "localhost";
    private static final String DATABASE_NAME = "VirgoHospital";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "SQL";

    
    private static DataSource instance;

    public static DataSource getInstance() {
        if (instance == null) {
            instance = createInstance();
        }
        return instance;
    }
    
    public static DataSource createInstance() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setServerName(SERVER_NAME);
        dataSource.setDatabaseName(DATABASE_NAME);
        dataSource.setUser(USERNAME);
        dataSource.setPassword(PASSWORD);
        return dataSource;
    }
}
