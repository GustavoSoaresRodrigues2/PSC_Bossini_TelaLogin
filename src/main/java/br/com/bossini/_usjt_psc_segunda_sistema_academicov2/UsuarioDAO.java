/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_sistema_academicov2;

/**
 *
 * @author rodrigo
 */
import java.util.Properties;
public class UsuarioDAO {
    
    private Properties properties;
    
    public UsuarioDAO(Properties properties){
        this.properties = properties;
    }
    
    public Usuario existe(Usuario u) throws Exception{
        //1. Construir uma fábrica de conexões
        var fabrica = new ConnectionFactory(properties);
        //2. Estabelecer uma conexão com o banco
        
        //3. Especificar o comando SQL
        
        //4. Substituir os eventuais placeholders
        
        //5. Executar o comando
        
        //6. Mover o cursor, verificando se o usuário existe
        
        //7. Devolver um objeto usuário, null
    }
}
