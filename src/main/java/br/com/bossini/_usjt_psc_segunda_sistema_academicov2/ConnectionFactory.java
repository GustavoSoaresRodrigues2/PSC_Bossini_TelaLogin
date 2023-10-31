/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_sistema_academicov2;

/**
 *
 * @author rodrigo
 */
public class ConnectionFactory {
    private String host, port, db, user, password;
    public ConnectionFactory(
        String host,
        String port,
        String db,
        String user,
        String password
    ){
      this.host = host;
      this.port = port;
      this.db = db;
      this.user = user;
      this.password = password;
    }
}
