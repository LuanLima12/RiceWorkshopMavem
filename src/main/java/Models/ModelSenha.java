/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entidades.Senha;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Luan
 */
public class ModelSenha {
    
    private Exception erro;
    
     public static EntityManager openDB(){
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("Rice-PU");
        return enf.createEntityManager();
    }
     
    public boolean inserir(){
        EntityManager em2 = ModelSenha.openDB(); //CHAMAR O MODELO
        try{ //INICIALIZAR A SENHA
                Senha s = new Senha();
                
                s.setSenha("senha123");
                
                em2.getTransaction().begin(); //INICIAR TRANSAÇÃO DE INFORMAÇÕES
                
                em2.persist(s); //MONTA O INSERT
                
                em2.getTransaction().commit(); //EXECUTA O QUE FOI MONTADO ACIMA

                return true;

        }catch(Exception e){
            em2.getTransaction().rollback();
            erro = e;
            return false;
        }finally{
            em2.close(); //FECHA A TRANSAÇÃO
        }
        
    }
    
    public Exception exibirErro(){
        return erro;
    }
    
}
