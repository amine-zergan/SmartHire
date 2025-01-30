package com.example.smarthire.Auth;

import java.sql.SQLException;

public  interface IAuthFacade {
      Boolean signIn(String username, String password) throws SQLException;
      Boolean signUp(String username, String password, RoleUser role) throws SQLException;
      Boolean isExist(String username) throws SQLException;
      void logOut();

}
