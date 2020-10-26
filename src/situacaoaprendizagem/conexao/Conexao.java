/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situacaoaprendizagem.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author gabry
 */
public class Conexao {
    public static Connection conectar(){
        Connection con = null;
        final String URL = "jdbc:mysql://localhost:3306/sa?useTimezone=true&serverTimezone=UTC";
        final String USER = "root";
        final String PASS = "Abcdefgh@1";
        
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
            return con;
        } catch (Exception e) {
            return JOptionPane.showMessageDialog(null, "Erro ao se conectar:"e);
        }        
    }
    
    public static void desconectar(Connection con){
        try {
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao se desconectar: "e);
        }
    }
}
