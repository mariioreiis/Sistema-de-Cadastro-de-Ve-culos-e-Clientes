/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.modeloBeans;

/**
 *
 * @author Mario
 */
public class Clientes {
private int Id; 
private String Nome;
private String CPF;
private String RG;
private String Endereço;
private String Bairro;
private String Cidade;
private String Nascimento;
private String CEP;
private String Tel_Celular;
private String Tel_Fixo;
private String Email;
private String Custo_Compra;
private String Data_Compra;
private String pesquisa;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }
    
      public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getTel_Celular() {
        return Tel_Celular;
    }

    public void setTel_Celular(String Tel_Celular) {
        this.Tel_Celular = Tel_Celular;
    }

    public String getTel_Fixo() {
        return Tel_Fixo;
    }

    public void setTel_Fixo(String Tel_Fixo) {
        this.Tel_Fixo = Tel_Fixo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCusto_Compra() {
        return Custo_Compra;
    }

    public void setCusto_Compra(String Custo_Compra) {
        this.Custo_Compra = Custo_Compra;
    }

    public String getData_Compra() {
        return Data_Compra;
    }

    public void setData_Compra(String Data_Compra) {
        this.Data_Compra = Data_Compra;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
}