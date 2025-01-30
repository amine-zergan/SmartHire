package com.example.smarthire.Auth;

import com.example.smarthire.serviceDb.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IAuthImplementation implements  IAuthFacade{
    private PreparedStatement prepare;
    private Connection connect;
    final DatabaseConnection databseConnect;
    private ResultSet result;

    public IAuthImplementation( DatabaseConnection databseConnect){
        this.databseConnect = databseConnect;
        this.connect=databseConnect.getConnection();
    };


    @Override
    public Boolean signIn(String username, String password) throws SQLException {
        String sql = "SELECT * FROM auth WHERE username = ? and password = ? ";
        prepare.setString(1,username);
        prepare.setString(2,password);
        prepare = connect.prepareStatement(sql);
        result  = prepare.executeQuery();
        return result.next();
    }

    @Override
    public Boolean signUp(String username, String password, RoleUser role) throws SQLException {

        if(isExist(username)){
            return  false;
        }else{
            String sql = "INSERT INTO auth (id, username, password ,role)"+"VALUES(?,?,?,?)";
            prepare.setString(1,null);
            prepare.setString(2,username);
            prepare.setString(3,password);
            prepare.setString(4,role.name());
            prepare = connect.prepareStatement(sql);
            result  = prepare.executeQuery();
            return result.next();
        }

    }




    @Override
    public Boolean isExist(String username) throws SQLException {
        String sql = "SELECT * FROM auth WHERE username = ?  ";
        prepare.setString(1,username);
        prepare = connect.prepareStatement(sql);
        result  = prepare.executeQuery();
        return result.next();
    }


    @Override
    public void logOut() {
         System.exit(0);
    }
}
