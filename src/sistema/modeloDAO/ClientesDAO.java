/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistema.modelo.Connection.ConexaoBD;
import sistema.modeloBeans.Clientes;

/**
 *
 * @author Mario
 */
public class ClientesDAO {
    ConexaoBD cone = new ConexaoBD();
    Clientes modelo = new Clientes();
    
    public void salvar(Clientes modelo){
    
        cone.conexao();
        
        try {
            PreparedStatement pst = cone.con.prepareStatement("INSERT INTO clientes (Nome, CPF, RG, Endereço, Bairro, Cidade, Nascimento, CEP, Tel_Celular, Tel_Fixo, Email, Custo_Compra, Data_Compra) VALUES (?,?,?,?,?,?,"
                    + "?,?,?,?,?,?,?)");
            
            pst.setString(1, modelo.getNome());
            pst.setString(2, modelo.getCPF());
            pst.setString(3, modelo.getRG());
            
            pst.setString(4, modelo.getEndereço());
            pst.setString(5, modelo.getBairro());
            pst.setString(6, modelo.getCidade());
            pst.setString(7, modelo.getNascimento());
            pst.setString(8, modelo.getCEP());
            pst.setString(9, modelo.getTel_Celular());
            pst.setString(10, modelo.getTel_Fixo());
            pst.setString(11, modelo.getEmail());
            
            pst.setString(12, modelo.getCusto_Compra());
            
            pst.setString(13, modelo.getData_Compra());
            //pst.setString(12, modelo.getDia_Compra());
            //pst.setString(13, modelo.getMes_Compra());
            //pst.setString(14, modelo.getAno_Compra());
            
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados/n Erro:"+ex.getMessage());
        } 
  
        
        cone.desconecta();
    }
    
    public void Excluir(Clientes modelo){
    
    cone.conexao();
    
        try {
            PreparedStatement pst = cone.con.prepareStatement("DELETE FROM clientes WHERE Id = ?");
            pst.setInt(1, modelo.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados/n Erro:"+ex.getMessage());
        }

    cone.desconecta();
    }
    
    
    
    public Clientes BuscaCliente(Clientes modelo){
    cone.conexao();
    
    
    cone.executaSql("SELECT * FROM clientes WHERE Nome like '%" + modelo.getPesquisa()+"%'");
    
        try {
            cone.rs.first();
            modelo.setId(cone.rs.getInt("Id"));
            modelo.setNome(cone.rs.getString("Nome"));
            modelo.setCPF(cone.rs.getString("CPF"));
            modelo.setRG(cone.rs.getString("RG"));
            modelo.setEndereço(cone.rs.getString("Endereço"));
            modelo.setBairro(cone.rs.getString("Bairro"));
            modelo.setCidade(cone.rs.getString("Cidade"));
            modelo.setNascimento(cone.rs.getString("Nascimento"));
            modelo.setCEP(cone.rs.getString("CEP"));
            modelo.setTel_Celular(cone.rs.getString("Tel_Celular"));
            modelo.setTel_Fixo(cone.rs.getString("Tel_Fixo"));
            modelo.setEmail(cone.rs.getString("Email"));
            modelo.setCusto_Compra(cone.rs.getString("Custo_Compra"));
            modelo.setData_Compra(cone.rs.getString("Data_Compra"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente! /n Erro:"+ex.getMessage());
        }
    
    
    cone.desconecta();
    return modelo;
    }
    
    public void Editar(Clientes modelo){
    
    cone.conexao();
        try {
            PreparedStatement pst = cone.con.prepareStatement("UPDATE clientes SET Nome=?, CPF=?, RG=?, Endereço=?, Bairro=?, Cidade=?, Nascimento=?, CEP=?, Tel_Celular=?, Tel_Fixo=?, Email=?, Custo_Compra=?, Data_Compra=? WHERE Id");
            
            pst.setString(1, modelo.getNome());
            pst.setString(2, modelo.getCPF());
            pst.setString(3, modelo.getRG());
            pst.setString(4, modelo.getEndereço());
            pst.setString(5, modelo.getBairro());
            pst.setString(6, modelo.getCidade());
            pst.setString(7, modelo.getNascimento());
            pst.setString(8, modelo.getCEP());
            pst.setString(9, modelo.getTel_Celular());
            pst.setString(10, modelo.getTel_Fixo());
            pst.setString(11, modelo.getEmail());
            pst.setString(12, modelo.getCusto_Compra());
            pst.setString(13, modelo.getData_Compra());
            
            pst.execute();
            
          JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");

        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro na alteração dos dados! /n Erro:"+ex);
        }
    
    
    
    cone.desconecta();
    }
}
