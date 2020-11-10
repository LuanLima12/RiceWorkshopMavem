/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entidades.Senha;
import java.security.MessageDigest;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Luan
 */
public class ModelSenha {
    
    private Exception erro;
    private String texto; //receberá a senha
    
     public static EntityManager openDB(){
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("Rice-PU");
        return enf.createEntityManager();
    }
     
    public Senha Logar(String id){
        EntityManager em = ModelSenha.openDB(); //CHAMAR O MODELO
        try{
            return (Senha) em.createQuery("SELECT s FROM Senha s WHERE s.id = '"+id+"'").getSingleResult();                        
        }catch (Exception e) {
            //em.getTransaction().rollback();
            erro = e;
            return null;
        }finally{
            em.close();
        }
        //return id;
    }
     
    public boolean inserir(){
        EntityManager em2 = ModelSenha.openDB(); //CHAMAR O MODELO
        try{ //INICIALIZAR A SENHA
                Senha s = new Senha();
                
                if(criptoSenha("12345")==true){
                s.setSenha(texto);
                
                em2.getTransaction().begin(); //INICIAR TRANSAÇÃO DE INFORMAÇÕES
                
                em2.persist(s); //MONTA O INSERT
                
                em2.getTransaction().commit(); //EXECUTA O QUE FOI MONTADO ACIMA
                
                texto = null;

                return true;  
                }else{
                return false;
                }
        }catch(Exception e){
            em2.getTransaction().rollback();
            erro = e;
            return false;
        }finally{
            em2.close(); //FECHA A TRANSAÇÃO
        }
        
    }
    
    private  boolean criptoSenha(String s){
        try{
            MessageDigest algoritimo = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = algoritimo.digest(s.getBytes("UTF-8"));
            StringBuilder hexStringSenha = new StringBuilder();
            for (byte b : messageDigest) {
                hexStringSenha.append(String.format("%02X", 0xFF & b));
            }
            texto = hexStringSenha.toString();
            return true;
        }catch(Exception e){
            erro = e;
            return false;
        }
    }
    
    public Exception exibirErro(){
        return erro;
    }
    
}
