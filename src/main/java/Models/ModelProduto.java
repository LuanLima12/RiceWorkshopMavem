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
    
    public Exception exibirErro(){
        return erro;
    }
    
}
