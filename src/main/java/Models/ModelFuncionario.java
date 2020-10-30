/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entidades.Funcionario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Luan
 */
public class ModelFuncionario {
    
    private Exception erro;
    
     public static EntityManager openDB(){
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("Rice-PU");
        return enf.createEntityManager();
    }
     
  /*public Funcionario buscar(String funcionario){
        EntityManager em = ModelFuncionario.openDB(); //CHAMAR O MODELO
        try{
            
            Funcionario f = em.createQuery("SELECT f Funcionario f WHERE ")
            
        }catch (Exception e) {
            em.getTransaction().rollback();
            erro = e;
        }finally{
            em.close();
        }
    }*/
     
    public List<Funcionario> listaFuncionarios(){
        EntityManager em = ModelCliente.openDB();
        try{
            return em.createQuery("Select f from Funcionario f").getResultList();
        }finally{
            em.close();
        }
    }
     
    public boolean inserir(Funcionario f) {
        ModelSenha ms = new ModelSenha();
        EntityManager em = ModelFuncionario.openDB(); //CHAMAR O MODELO
        try {
            em.getTransaction().begin(); //INICIAR TRANSAÇÃO DE INFORMAÇÕES

            em.persist(f); //MONTA O INSERT

            if (ms.inserir() == true) { //CONFERIR SE A SENHA FOI CRIADA
                em.getTransaction().commit(); //EXECUTA O QUE FOI MONTADO ACIMA
                return true;

            } else {
                erro = ms.exibirErro();
                return false;
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            erro = e;
            return false;
        } finally {
            em.close(); //FECHA A TRANSAÇÃO
        }
    }
    
    public Exception exibirErro(){
        return erro;
    }
    
}
