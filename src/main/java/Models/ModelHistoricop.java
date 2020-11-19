/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entidades.Historicop;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Luan
 */
public class ModelHistoricop {
    
    private Exception erro;
    
    public static EntityManager openDB(){
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("Rice-PU");
        return enf.createEntityManager();
    }
    
    public boolean inserir(Historicop h){
        EntityManager em = ModelHistoricop.openDB(); //CHAMAR O MODELO
            try{
            em.getTransaction().begin(); //INICIAR TRANSAÇÃO
            
            em.persist(h); // MONTA INSERT
            
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
    
    public Historicop buscar(Long id){
        EntityManager emHistorico = ModelHistoricop.openDB();
        try{
            return (Historicop) emHistorico.createQuery("SELECT h FROM Historicop h WHERE h.id = "+id).getSingleResult();
        }catch(Exception e){
            emHistorico.getTransaction().rollback();
            erro = e;
            return null;
        }finally{
            emHistorico.close();
        }
    }
    
    public Historicop buscarNome(String nome){
        EntityManager emHistorico = ModelHistoricop.openDB();
        try{
            return (Historicop) emHistorico.createQuery("SELECT h FROM Historicop h WHERE h.nome = '"+nome+"'").getSingleResult();
        }catch(Exception e){
            emHistorico.getTransaction().rollback();
            erro = e;
            return null;
        }finally{
            emHistorico.close();
        }
    }
    
    public List<Historicop> listaHistorico(){
        EntityManager em = ModelHistoricop.openDB();
        try{
            return em.createQuery("Select h from Historicop h").getResultList();
        }finally{
            em.close();
        }
    }
    
    public List<Historicop> listaHistorico(String selecionado1, String conteudo1){
        EntityManager em = ModelHistoricop.openDB();
        try{
            return em.createQuery("SELECT h FROM Historicop h WHERE h."+selecionado1+" = '"+conteudo1+"'").getResultList();
        }finally{
            em.close();
        }
    }
    
    public List<Historicop> listaHistorico(String selecionado1,String selecionado2, String conteudo1, String conteudo2){
        EntityManager em = ModelHistoricop.openDB();
        try{
            return em.createQuery("SELECT h FROM Historicop h WHERE h."+selecionado1+" = '"+conteudo1+"' AND h."+selecionado2+" = '"+conteudo2+"'").getResultList();
        }finally{
            em.close();
        }
    }
    
    public Exception exibirErro(){
        return erro;
    }
    
}
