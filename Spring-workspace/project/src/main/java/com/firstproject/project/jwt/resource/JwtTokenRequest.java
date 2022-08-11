package com.firstproject.project.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    

    //"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzaWRkaHUiLCJleHAiOjE2NjAyMTYzOTAsImlhdCI6MTY1OTYxMTU5MH0.-PT-YO9KryEwkTX4xcryBjeHD1FM_5icsXQ_lrOMY7qZLDrODohmCO1DCfODf9seV-w6PKlqDJbXe9MnpiFcDQ"
    //"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzYWkiLCJleHAiOjE2NjAyMTczMzgsImlhdCI6MTY1OTYxMjUzOH0.jJuVPw9d_MaWMTAhFod-G6S73ywndqUlY2TjG0kn06M4Hx_sB7mcf9uCeX01WGdoMB9lj8mmYUt-COhysTpJzQ"

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

