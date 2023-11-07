/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bossini._usjt_psc_segunda_sistema_academicov2;

/**
 *
 * @author rodrigo
 */
import java.io.FileInputStream;
import java.io.File;
import java.util.Properties;
public class App {

    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("conf.properties")));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela(properties).setVisible(true);
            }
        });
    }
}
