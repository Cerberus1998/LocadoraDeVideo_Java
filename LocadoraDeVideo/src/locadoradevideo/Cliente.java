/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoradevideo;

/**
 *
 * @author OSHIKURU
 */
public class Cliente {
    private int codigo;
    private String PrimeiroNome;
    private String Sobrenome;
    private int telefone;
    private String endereço;

    public Cliente() {
    }

    public Cliente(int codigo, String PrimeiroNome, String Sobrenome, int telefone, String endereço) {
        this.codigo = codigo;
        this.PrimeiroNome = PrimeiroNome;
        this.Sobrenome = Sobrenome;
        this.telefone = telefone;
        this.endereço = endereço;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPrimeiroNome() {
        return PrimeiroNome;
    }

    public void setPrimeiroNome(String PrimeiroNome) {
        this.PrimeiroNome = PrimeiroNome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
    
}
