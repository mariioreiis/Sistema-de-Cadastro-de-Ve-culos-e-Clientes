/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.modelo.Connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 */
public class ConexaoBD {
    public Statement stm;
    public ResultSet rs;
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/bv_veiculos";
    private final String USER = "root";
    private final String PASS = "";
    public Connection con;
    
    public void conexao(){
    
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASS);
            //JOptionPane.showMessageDialog(null, "Conexão efetuada!");
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: \n"+ex.getMessage());
        }
   
        }
    
    
    public void executaSql(String sql){
    
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ExecutaSql: \n"+ex.getMessage());
        }
    
    
    
    
    }
    
    public void desconecta (){
        
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados: \n"+ex.getMessage());
        }
        
    }
    }
    
    
    

