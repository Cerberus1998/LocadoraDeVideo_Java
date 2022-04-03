/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoradevideo;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author OSHIKURU
 */
public class LocadoraDeVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<Filme> Film = new ArrayList();
        ArrayList<Cliente> Client1 = new ArrayList();
        ArrayList<Emprestimo> Emprest = new ArrayList();
        
        
        
        Scanner objecto = new Scanner(System.in);
        
        int opcao= 0;
        do{
            System.out.println("### Menu Principal ###");
            System.out.println("1- Cadastrar Filmes");
            System.out.println("2- Cadastrar Clientes");
            System.out.println("3- Emitir Emprestimo de Filme Para um Cliente");
            System.out.println("4- Mostrar Lista De Emprestimos Feitos");
            System.out.println("5- Sair");
            opcao = objecto.nextInt();
            
            switch(opcao){
                case 1:{
                    int op= 0;
                    do{
                        Filme filme = new Filme();
                        
                        System.out.println("Digite o ID do Filme: ");
                        int idDoFilme = objecto.nextInt();
                        filme.setId(idDoFilme);
                        
                        System.out.println("Digite o titulo do Filme: ");
                        String tituloDoFilme = objecto.next();
                        filme.setTitulo(tituloDoFilme);
                        
                        System.out.println("Digite a categoria do Filme: ");
                        String categoriaDoFilme = objecto.next();
                        filme.setCategoria(categoriaDoFilme);
                        
                        System.out.println("Digite os atores do Filme: ");
                        String atoresDoFilme = objecto.next();
                        filme.setAtores(atoresDoFilme);
                        
                        System.out.println("Digite o numero de Dvd em que o Filme está contido: ");
                        int numeroDeDvds = objecto.nextInt();
                        filme.setQuantosDiscos(numeroDeDvds);
                        
                        System.out.println("Digite a disponiblidade do Filme: ");
                        String disponibilidadeDoFilme = objecto.next();
                        filme.setDisponibilidade(disponibilidadeDoFilme);
                        
                        Film.add(filme);
                        
                        System.out.println("1- Adicionar  2- Sair");
                        op = objecto.nextInt();
                        
                        System.out.println("---------------------------------------------------");
                        
                    
                    }while(op != 2);
                    
                } break;
                
                case 2:{ 
                    int op = 0;
                    do{
                        Cliente cliente = new Cliente();
                        
                        System.out.println("Digite o Codigo Do cliente: ");
                        int codigoDoCliente = objecto.nextInt();
                        cliente.setCodigo(codigoDoCliente);
                        
                        System.out.println("Digite o primeiro nome Do cliente: ");
                        String primeiroNomeDoCliente = objecto.next();
                        cliente.setPrimeiroNome(primeiroNomeDoCliente);
                        
                        System.out.println("Digite o sobrenome Do cliente: ");
                        String sobrenomeDoCliente = objecto.next();
                        cliente.setSobrenome(sobrenomeDoCliente);
                        
                        System.out.println("Digite o telefone Do cliente: ");
                        int telefoneDoCliente = objecto.nextInt();
                        cliente.setTelefone(telefoneDoCliente);
                        
                        System.out.println("Digite o endereço Do cliente: ");
                        String endereçoDoCliente = objecto.next();
                        cliente.setEndereço(endereçoDoCliente);
                        
                        Client1.add(cliente);
                        
                        System.out.println("1- Adicionar  2- Sair");
                        op = objecto.nextInt();
                        
                        System.out.println("----------------------------------------------------------");
                        
                    
                    }while(op != 2);
                    
                }break;
                
                case 3:{ 
                    int op =0;
                    do{
                    int numeroDeFilme= 0;
                    int numeroDeCliente= 0;
                    int codigoDoFilme;
                    int codigoDoCliente;
                    
                    Emprestimo emprestimo = new Emprestimo();
                        System.out.println("### EMITIR EMPRESTIMO ###");
                        
                    
                    do{
                        System.out.println("Digite o id do Filme:");
                        codigoDoFilme = objecto.nextInt();
                        
                        for(int i=0; i<Film.size(); i++){
                            if(Film.get(i).getId()==codigoDoFilme){
                                numeroDeFilme++;
                            }
                        
                        }
                        if(numeroDeFilme<1)
                            System.out.println("*** Filme não Existe ***");
                    
                    }while(numeroDeFilme<1);
                    
                    do{
                        System.out.println("Digite o codigo do Cliente: ");
                        codigoDoCliente = objecto.nextInt();
                        
                        for(int i=0; i<Client1.size(); i++){
                            if(Client1.get(i).getCodigo()==codigoDoCliente){
                                numeroDeCliente++;
                            }
                        }
                        if(numeroDeCliente<1)
                            System.out.println("*** Cliente não Existe ***");
                    
                    }while(numeroDeCliente<1);
                    
                        System.out.println("Digite a Data do Emprestimo: ");
                        String DataDoEmprestimo = objecto.next();
                        
                        emprestimo.setInformaçãoDoFilme(codigoDoFilme);
                        emprestimo.setInformaçãoDoCliente(codigoDoCliente);
                        emprestimo.setDataEmprestimo(DataDoEmprestimo);
                        
                        Emprest.add(emprestimo);
                        
                        System.out.println("1- Adicionar  2- Sair");
                        op = objecto.nextInt();
                        
                        System.out.println("-------------------------------------------------------");
                    
                    }while(op != 2);
                    
                    
                }break;
            
                case 4: {
                    
                    System.out.println("### LISTA DE EMPRESTIMO ###");
                    
                    for( int i = 0; i<Emprest.size(); i++){
                        System.out.println("----- Numero do emprestimo: "+(i+1)+ "-----");
                        System.out.println("----- Data do Emprestimo: "+ Emprest.get(i).getDataEmprestimo()+"-----");
                        
                        for(int j = 0; j<Film.size(); j++){
                            if(Film.get(j).getId()==Emprest.get(i).getInformaçãoDoFilme()){
                                System.out.println("---Id do Filme: "+Film.get(j).getId());
                                System.out.println("---Titulo do Filme: "+Film.get(j).getTitulo());
                                System.out.println("---Categoria do Filme: "+Film.get(j).getCategoria());
                                System.out.println("---Atores do Filme: "+Film.get(j).getAtores());
                                System.out.println("---Numero do DVD contido do Filme: "+Film.get(j).getQuantosDiscos());
                                System.out.println("---Disponibilidade do Filme: "+Film.get(j).getDisponibilidade());
                            }
                        }
                        
                        for(int k = 0; k<Client1.size(); k++){
                            if(Client1.get(k).getCodigo()==Emprest.get(i).getInformaçãoDoCliente()){
                                System.out.println("---Codigo Do Cliente: "+Client1.get(k).getCodigo());
                                System.out.println("---Primeiro nome Do Cliente: "+Client1.get(k).getPrimeiroNome());
                                System.out.println("---Sobenome Do Cliente: "+Client1.get(k).getSobrenome());
                                System.out.println("---Telefone Do Cliente: "+Client1.get(k).getTelefone());
                                System.out.println("---Endereço Do Cliente: "+Client1.get(k).getEndereço());
                            }
                        }
                        System.out.println("-------------------------------------------------------------------------");
                    }
                    
                } break;
                
                
                
            default:
            }
      
        
        
        }while(opcao !=5);
    }
    
}
