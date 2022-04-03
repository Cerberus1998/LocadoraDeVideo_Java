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
public class Emprestimo {
    private String dataEmprestimo;
    private int informaçãoDoFilme;
    private int informaçãoDoCliente;

    public Emprestimo() {
    }

    public Emprestimo(String dataEmprestimo, int informaçãoDoFilme, int informaçãoDoCliente) {
        this.dataEmprestimo = dataEmprestimo;
        this.informaçãoDoFilme = informaçãoDoFilme;
        this.informaçãoDoCliente = informaçãoDoCliente;
    }

    public int getInformaçãoDoCliente() {
        return informaçãoDoCliente;
    }

    public void setInformaçãoDoCliente(int informaçãoDoCliente) {
        this.informaçãoDoCliente = informaçãoDoCliente;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getInformaçãoDoFilme() {
        return informaçãoDoFilme;
    }

    public void setInformaçãoDoFilme(int informaçãoDoFilme) {
        this.informaçãoDoFilme = informaçãoDoFilme;
    }
    
    
    
}
