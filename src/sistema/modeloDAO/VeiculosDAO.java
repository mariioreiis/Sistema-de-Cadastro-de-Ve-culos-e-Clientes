/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistema.modelo.Connection.ConexaoBD;
import sistema.modeloBeans.Veiculos;
/**
 *
 * @author Mario
 */
public class VeiculosDAO {
    ConexaoBD cone = new ConexaoBD();
    Veiculos modelo = new Veiculos();
    
    public void salvar(Veiculos modelo){
    
        cone.conexao();
        
        try {
            PreparedStatement pst = cone.con.prepareStatement("INSERT INTO veiculos (Ano, Modelo, Chassi, Placa, Tipo_Comb, Nome_Procendente, End_Procendente, Bairro_Procendente, Cidade_Procendente, CEP_Procendente, CPF_Procendente, RG_Procendente, Tel_Fixo_Procendente, Tel_Cel_Procendente) VALUES (?,?,?,?,?,?,?,"
                    + "?,?,?,?,?,?,?)");
            
            pst.setInt(1, modelo.getAno());
            pst.setString(2, modelo.getModelo());
            pst.setString(3, modelo.getChassi());
            pst.setString(4, modelo.getPlaca());
            pst.setString(5, modelo.getTipo_Comb());
            pst.setString(6, modelo.getNome_Procendente());
            pst.setString(7, modelo.getEnd_Procendente());
            pst.setString(8, modelo.getBairro_Procendente());
            pst.setString(9, modelo.getCidade_Procendente());
            pst.setString(10, modelo.getCEP_Procendente());
            pst.setString(11, modelo.getCPF_Procendente());
            pst.setString(12, modelo.getRG_Procendente());
            pst.setString(13, modelo.getTel_Fixo_Procendente());
            pst.setString(14, modelo.getTel_Cel_Procendente());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados/n Erro:"+ex.getMessage());
        } 
  
        
        cone.desconecta();
    }
    
    
    public void Excluir(Veiculos modelo){
    
    cone.conexao();
    
        try {
            PreparedStatement pst = cone.con.prepareStatement("DELETE FROM veiculos WHERE Id = ?");
            pst.setInt(1, modelo.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados/n Erro:"+ex.getMessage());
        }

    cone.desconecta();
    }
    
    /*
    
    public Veiculos BuscaCliente(Veiculos modelo){
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
*/
    
    public void Editar(Veiculos modelo){
    
    cone.conexao();
        try {
            PreparedStatement pst = cone.con.prepareStatement("UPDATE veiculos SET Ano=?, Modelo=?, Chassi=?, Placa=?, Tipo_Comb=?, Nome_Procendente=?, End_Procendente=?, Bairro_Procendente=?, Cidade_Procendente=?, CEP_Procendente=?, CPF_Procendente=?, RG_Procendente=?, Tel_Fixo_Procendente=?, Tel_Cel_Procendente=? WHERE Id");
            
            pst.setInt(1, modelo.getAno());
            pst.setString(2, modelo.getModelo());
            pst.setString(3, modelo.getChassi());
            pst.setString(4, modelo.getPlaca());
            pst.setString(5, modelo.getTipo_Comb());
            pst.setString(6, modelo.getNome_Procendente());
            pst.setString(7, modelo.getEnd_Procendente());
            pst.setString(8, modelo.getBairro_Procendente());
            pst.setString(9, modelo.getCidade_Procendente());
            pst.setString(10, modelo.getCEP_Procendente());
            pst.setString(11, modelo.getCPF_Procendente());
            pst.setString(12, modelo.getRG_Procendente());
            pst.setString(13, modelo.getTel_Fixo_Procendente());
            pst.setString(14, modelo.getTel_Cel_Procendente());
            
            pst.execute();
            
          JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");

        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro na alteração dos dados! /n Erro:"+ex);
        }
    
    
    
    cone.desconecta();
    }
}
