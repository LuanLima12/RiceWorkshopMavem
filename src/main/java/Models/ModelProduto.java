/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entidades.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;;

/**
 *
 * @author Luan
 */
public class ModelProduto {
    
    private Exception erro;
    
    public static EntityManager openDB(){
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("Rice-PU");
        return enf.createEntityManager();
    }
    
    public boolean inserir(Produto p){
        EntityManager em = ModelProduto.openDB(); //CHAMAR O MODELO
            try{
            em.getTransaction().begin(); //INICIAR TRANSAÇÃO
            
            em.persist(p); // MONTA INSERT
            
            em.getTransaction().commit(); //EXECUTA INSERT
            
            return true;
            
            }catch(Exception e){
            em.getTransaction().rollback();
            erro = e;
            return false;
            
            }finally{
            em.close(); //FECHA A TRANSAÇÃO
            }
    }
    
    public boolean editar(Produto p){
        
        EntityManager emProduto = ModelProduto.openDB(); //CHAMAR O MODELO
        
        try{
        emProduto.getTransaction().begin(); //INICIAR TRANSAÇÃO DE INFORMAÇÕES
        
        emProduto.merge(p); //MONTA O UPDATE
        
        emProduto.getTransaction().commit(); //EXECUTA O QUE FOI MONTADO ACIMA
        
        return true;
        
        }catch(Exception e){
            emProduto.getTransaction().rollback();
            erro = e;
            return false;
        }finally{
            emProduto.close(); //FECHA A TRANSAÇÃO
        }
    }
    
    public Produto buscar(Long id){
        EntityManager emProduto = ModelProduto.openDB();
        try{
            return (Produto) emProduto.createQuery("SELECT p FROM Produto p WHERE p.id = "+id).getSingleResult();
        }catch(Exception e){
            emProduto.getTransaction().rollback();
            erro = e;
            return null;
        }finally{
            emProduto.close();
        }
    }
    
    public Produto buscarNome(String nome){
        EntityManager emProduto = ModelProduto.openDB();
        try{
            return (Produto) emProduto.createQuery("SELECT p FROM Produto p WHERE p.nome = '"+nome+"'").getSingleResult();
        }catch(Exception e){
            emProduto.getTransaction().rollback();
            erro = e;
            return null;
        }finally{
            emProduto.close();
        }
    }
    
    public List<Produto> listaProdutosNome(String nome){
        EntityManager em = ModelCliente.openDB();
        try{
            return em.createQuery("SELECT p FROM Produto p WHERE p.nome = '"+nome+"'").getResultList();
        }finally{
            em.close();
        }
    }
    
    public List<Produto> listaProdutos(){
        EntityManager em = ModelCliente.openDB();
        try{
            return em.createQuery("Select p from Produto p").getResultList();
        }finally{
            em.close();
        }
    }
    
    public List<Produto> listaProdutos1(String selecionado1, String conteudo1){
        EntityManager em = ModelCliente.openDB();
        try{
            return em.createQuery("SELECT p FROM Produto p WHERE p."+selecionado1+" = '"+conteudo1+"'").getResultList();
        }finally{
            em.close();
        }
    }
    
    public List<Produto> listaProdutos2(String selecionado1,String selecionado2, String conteudo1, String conteudo2){
        EntityManager em = ModelCliente.openDB();
        try{
            return em.createQuery("SELECT p FROM Produto p WHERE p."+selecionado1+" = '"+conteudo1+"' AND p."+selecionado2+" = '"+conteudo2+"'").getResultList();
        }finally{
            em.close();
        }
    }
    
    public boolean delete(Long id){
        
        EntityManager em = ModelCliente.openDB(); //CHAMAR O MODELO
        
        try{
        Produto p = em.find(Produto.class, id);    
            
        em.getTransaction().begin(); //INICIAR TRANSAÇÃO DE INFORMAÇÕES
        
        em.remove(p); //MONTA O INSERT
        
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
