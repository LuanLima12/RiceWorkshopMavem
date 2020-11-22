/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entidades.Fornecedor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Luan
 */
public class ModelFornecedor {
    
    private Exception erro;
    
    public static EntityManager openDB(){
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("Rice-PU");
        return enf.createEntityManager();
    }
    
    public boolean inserir(Fornecedor f){
        EntityManager em = ModelFornecedor.openDB(); //CHAMAR O MODELO
         try{   
        em.getTransaction().begin(); //INICIAR TRANSAÇÃO DE INFORMAÇÕES
        
        em.persist(f); //MONTA O INSERT
        
        em.getTransaction().commit(); //EXECUTA O QUE FOI MONTADO ACIMA
        
        return true;
        
        }catch(Exception e){
            em.getTransaction().rollback();
            erro = e;
            return false;
        }finally{
             em.close(); //FECHA A TRANSAÇÃO
        }
    }
    
    public boolean editar(Fornecedor f){
        
        EntityManager emFornecedor = ModelFornecedor.openDB(); //CHAMAR O MODELO
        
        try{
        emFornecedor.getTransaction().begin(); //INICIAR TRANSAÇÃO DE INFORMAÇÕES
        
        emFornecedor.merge(f); //MONTA O UPDATE
        
        emFornecedor.getTransaction().commit(); //EXECUTA O QUE FOI MONTADO ACIMA
        
        return true;
        
        }catch(Exception e){
            emFornecedor.getTransaction().rollback();
            erro = e;
            return false;
        }finally{
            emFornecedor.close(); //FECHA A TRANSAÇÃO
        }
    }
    
    public Fornecedor buscar(Long id){
        EntityManager emFornecedor = ModelFornecedor.openDB();
        try{
            return (Fornecedor) emFornecedor.createQuery("SELECT f FROM Fornecedor f WHERE f.id = "+id).getSingleResult();
        }catch(Exception e){
            emFornecedor.getTransaction().rollback();
            erro = e;
            return null;
        }finally{
            emFornecedor.close();
        }
    }
    
    public Fornecedor buscarCNPJ(String cnpj){
        EntityManager emFornecedor = ModelFornecedor.openDB();
        try{
            return (Fornecedor) emFornecedor.createQuery("SELECT f FROM Fornecedor f WHERE f.cnpj_fornecedor = '"+cnpj+"'").getSingleResult();
        }catch(Exception e){
            emFornecedor.getTransaction().rollback();
            erro = e;
            return null;
        }finally{
            emFornecedor.close();
        }
    }
    
    public List<Fornecedor> listaFornecedores(){
        EntityManager em = ModelCliente.openDB();
        try{
            return em.createQuery("Select f from Fornecedor f").getResultList();
        }finally{
            em.close();
        }
    }
    
    public List<Fornecedor> listaFornecedores1(String selecionado1, String conteudo1){
        EntityManager em = ModelCliente.openDB();
        try{
            return em.createQuery("SELECT f FROM Fornecedor f WHERE f."+selecionado1+" = '"+conteudo1+"'").getResultList();
        }finally{
            em.close();
        }
    }
    
    public List<Fornecedor> listaFornecedores2(String selecionado1,String selecionado2, String conteudo1, String conteudo2){
        EntityManager em = ModelCliente.openDB();
        try{
            return em.createQuery("SELECT f FROM Fornecedor f WHERE f."+selecionado1+" = '"+conteudo1+"' AND f."+selecionado2+" = '"+conteudo2+"'").getResultList();
        }finally{
            em.close();
        }
    }
    
    public boolean delete(Long id){
        
        EntityManager em = ModelCliente.openDB(); //CHAMAR O MODELO
        
        try{
        Fornecedor f = em.find(Fornecedor.class, id);    
            
        em.getTransaction().begin(); //INICIAR TRANSAÇÃO DE INFORMAÇÕES
        
        em.remove(f); //MONTA O INSERT
        
        em.getTransaction().commit(); //EXECUTA O QUE FOI MONTADO ACIMA
        
        return true;
        
        }catch(Exception e){
            em.getTransaction().rollback();
            erro = e;
            return false;
        }finally{
            em.close(); //FECHA A TRANSAÇÃO
        }
    }
    
    public Exception exibirErro(){
        return erro;
    }
    
}
