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
public class Filme {
    private int id;
    private String titulo;
    private String categoria;
    private String atores;
    private int quantosDiscos;
    private String disponibilidade;

    public Filme() {
    }

    public Filme(int id, String titulo, String categoria, String atores, int quantosDiscos, String disponibilidade) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.atores = atores;
        this.quantosDiscos = quantosDiscos;
        this.disponibilidade = disponibilidade;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAtores() {
        return atores;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }

    public int getQuantosDiscos() {
        return quantosDiscos;
    }

    public void setQuantosDiscos(int quantosDiscos) {
        this.quantosDiscos = quantosDiscos;
    }
    
    
    
}
