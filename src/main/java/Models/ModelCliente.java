/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entidades.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Luan
 */
public class ModelCliente {
    
    private Exception erro;
    
    public static EntityManager openDB(){
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("Rice-PU");
        return enf.createEntityManager();
    }
    
    public boolean inserir(Cliente c){
        
        EntityManager emCliente = ModelCliente.openDB(); //CHAMAR O MODELO
        
        try{
        emCliente.getTransaction().begin(); //INICIAR TRANSAÇÃO DE INFORMAÇÕES
        
        emCliente.persist(c); //MONTA O INSERT
        
        emCliente.getTransaction().commit(); //EXECUTA O QUE FOI MONTADO ACIMA
        
        return true;
        
        }catch(Exception e){
            emCliente.getTransaction().rollback();
            erro = e;
            return false;
        }finally{
            emCliente.close(); //FECHA A TRANSAÇÃO
        }
    }
    
    public boolean editar(Cliente c){
        
        EntityManager emCliente = ModelCliente.openDB(); //CHAMAR O MODELO
        
        try{
        emCliente.getTransaction().begin(); //INICIAR TRANSAÇÃO DE INFORMAÇÕES
        
        emCliente.merge(c); //MONTA O UPDATE
        
        emCliente.getTransaction().commit(); //EXECUTA O QUE FOI MONTADO ACIMA
        
        return true;
        
        }catch(Exception e){
            emCliente.getTransaction().rollback();
            erro = e;
            return false;
        }finally{
            emCliente.close(); //FECHA A TRANSAÇÃO
        }
    }
    
    public Cliente buscarNome(String nome){
        EntityManager emCliente = ModelCliente.openDB();
        try{
            return (Cliente) emCliente.createQuery("SELECT c FROM Cliente c WHERE c.nome = '"+nome+"'").getSingleResult();
        }catch(Exception e){
            emCliente.getTransaction().rollback();
            erro = e;
            return null;
        }finally{
            emCliente.close();
        }
    }
    
    public Cliente buscar(Long id){
        EntityManager emCliente = ModelCliente.openDB();
        try{
            return (Cliente) emCliente.createQuery("SELECT c FROM Cliente c WHERE c.id = "+id).getSingleResult();
        }catch(Exception e){
            emCliente.getTransaction().rollback();
            erro = e;
            return null;
        }finally{
            emCliente.close();
        }
    }
    
    public List<Cliente> listaClientes(){
        EntityManager emCliente = ModelCliente.openDB();
        try{
            return emCliente.createQuery("SELECT c FROM Cliente c").getResultList();
        }finally{
            emCliente.close();
        }
    }
    
    public List<Cliente> listaClientes1(String selecionado1, String conteudo1){
        EntityManager emCliente = ModelCliente.openDB();
        try{
            /*if (selecionado1.equals("id")){
                return emCliente.createQuery("SELECT c FROM Cliente c WHERE c."+selecionado1+" = '"+Long.parseLong(conteudo1)+"'").getResultList();
            }*/
            return emCliente.createQuery("SELECT c FROM Cliente c WHERE c."+selecionado1+" = '"+conteudo1+"'").getResultList();
        }catch(Exception e){
            emCliente.getTransaction().rollback();
            erro = e;
            return null;
        }
        finally{
            emCliente.close();
        }
    }
    
    public List<Cliente> listaClientes2(String selecionado1,String selecionado2, String conteudo1, String conteudo2){
        EntityManager emCliente = ModelCliente.openDB();
        try{
            /*if (selecionado1.equals("id")){
                return emCliente.createQuery("SELECT c FROM Cliente c WHERE c."+selecionado1+" = '"+Long.parseLong(conteudo1)+"' AND c."+selecionado2+" = '"+conteudo2+"';").getResultList();
            }*/
            return emCliente.createQuery("SELECT c FROM Cliente c WHERE c."+selecionado1+" = '"+conteudo1+"' AND c."+selecionado2+" = '"+conteudo2+"';").getResultList();
            
            
        }finally{
            emCliente.close();
        }
    }
    
    public Exception exibirErro(){
        return erro;
    }
    
}
