/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entidades.Produto;
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
    
    public Exception exibirErro(){
        return erro;
    }
    
}
