/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entidades.Venda;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Luan
 */
public class ModelVenda {
    
    private Exception erro;
    
    public static EntityManager openDB(){
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("Rice-PU");
        return enf.createEntityManager();
    }
    
    public boolean inserir(Venda v){
        
        EntityManager emVenda = ModelVenda.openDB(); //CHAMAR O MODELO
        
        try{
        emVenda.getTransaction().begin(); //INICIAR TRANSAÇÃO DE INFORMAÇÕES
        
        emVenda.persist(v); //MONTA O INSERT
        
        emVenda.getTransaction().commit(); //EXECUTA O QUE FOI MONTADO ACIMA
        
        return true;
        
        }catch(Exception e){
            emVenda.getTransaction().rollback();
            erro = e;
            return false;
        }finally{
            emVenda.close(); //FECHA A TRANSAÇÃO
        }
    }
    
    public boolean editar(Venda v){
        
        EntityManager emVenda = ModelVenda.openDB(); //CHAMAR O MODELO
        
        try{
        emVenda.getTransaction().begin(); //INICIAR TRANSAÇÃO DE INFORMAÇÕES
        
        emVenda.merge(v); //MONTA O UPDATE
        
        emVenda.getTransaction().commit(); //EXECUTA O QUE FOI MONTADO ACIMA
        
        return true;
        
        }catch(Exception e){
            emVenda.getTransaction().rollback();
            erro = e;
            return false;
        }finally{
            emVenda.close(); //FECHA A TRANSAÇÃO
        }
    }
    
    public Venda buscar(Long id){
        EntityManager emVenda = ModelVenda.openDB();
        try{
            return (Venda) emVenda.createQuery("SELECT v FROM Venda v WHERE v.id = "+id).getSingleResult();
        }catch(Exception e){
            emVenda.getTransaction().rollback();
            erro = e;
            return null;
        }finally{
            emVenda.close();
        }
    }
    
    public List<Venda> listaVendas(){
        EntityManager emVenda = ModelVenda.openDB();
        try{
            return emVenda.createQuery("SELECT v FROM Venda v").getResultList();
        }finally{
            emVenda.close();
        }
    }
    
    public List<Venda> listaVendas1(String selecionado1, String conteudo1){
        EntityManager emVenda = ModelVenda.openDB();
        try{
            /*if (selecionado1.equals("id")){
                return emCliente.createQuery("SELECT c FROM Cliente c WHERE c."+selecionado1+" = '"+Long.parseLong(conteudo1)+"'").getResultList();
            }*/
            return emVenda.createQuery("SELECT v FROM Venda v WHERE v."+selecionado1+" = '"+conteudo1+"'").getResultList();
        }catch(Exception e){
            emVenda.getTransaction().rollback();
            erro = e;
            return null;
        }
        finally{
            emVenda.close();
        }
    }
    
    public List<Venda> listaVendas2(String selecionado1,String selecionado2, String conteudo1, String conteudo2){
        EntityManager emVenda = ModelVenda.openDB();
        try{
            /*if (selecionado1.equals("id")){
                return emCliente.createQuery("SELECT c FROM Cliente c WHERE c."+selecionado1+" = '"+Long.parseLong(conteudo1)+"' AND c."+selecionado2+" = '"+conteudo2+"';").getResultList();
            }*/
            return emVenda.createQuery("SELECT v FROM Venda v WHERE v."+selecionado1+" = '"+conteudo1+"' AND v."+selecionado2+" = '"+conteudo2+"';").getResultList();
            
            
        }finally{
            emVenda.close();
        }
    }
    
    public Exception exibirErro(){
        return erro;
    }
    
}
