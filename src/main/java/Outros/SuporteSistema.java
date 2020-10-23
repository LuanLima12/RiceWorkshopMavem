/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outros;

/**
 *
 * @author Luan
 */
public class SuporteSistema {
    private final CharSequence letras[] = {"a", "b", "c", "d", "e", "f", "g","h","i","j","k","l",
        "m","n","o","p","q","r","s","t","u","v","w","x","y","z",
    "A", "B", "C", "D", "E", "F", "G","H","I","J","K","L",
    "M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
    "ã", "Ã", "õ", "Õ", "é", "É", "ê", "Ê"};
    private final CharSequence nums[] = {"0","1","2","3","4","5","6","7","8","9"};
    //CLASSE PARA IMPEDIR QUE NUMEROS SEJAM COLOCADOS EM CAPOS DE TEXTO, VICE-VERSA E SEMELHANTES
    
    //SABER SE HÁ NUMEROS
    public boolean checarNumeros(String str) {
        for (int i = 0; i < nums.length; i++) {
            if (str.contains(nums[i])){
            return true;   
            }
        }
            return false;
    }
    
    //SABER SE HÁ LETRAS
    public boolean checarLetras(String str) {
        for (int i = 0; i < letras.length; i++) {
            if (str.contains(letras[i])){
            return true;
            }
        }
            return false;
    }
}
