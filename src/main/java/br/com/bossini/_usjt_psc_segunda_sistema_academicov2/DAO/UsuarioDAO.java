/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_sistema_academicov2.DAO;

/**
 *
 * @author rodrigo
 */
import java.util.Properties;

import br.com.bossini._usjt_psc_segunda_sistema_academicov2.conecctions.ConnectionFactory;
import br.com.bossini._usjt_psc_segunda_sistema_academicov2.models.Usuario;
public class UsuarioDAO {
    
    private Properties properties;
    
    public UsuarioDAO(Properties properties){
        this.properties = properties;
    }
    
    public Usuario existe(Usuario u) throws Exception{
        //1. Construir uma fábrica de conexões
        var fabrica = new ConnectionFactory(properties);
        //2. Estabelecer uma conexão com o banco
        try(var conexao = fabrica.conectar()){
            //3. Especificar o comando SQL
            String sql = "SELECT * FROM tb_pessoa WHERE nome = ? AND senha = ?";
            try(var ps = conexao.prepareStatement(sql)){
                //4. Substituir os eventuais placeholders
                ps.setString(1, u.getLogin());
                ps.setString(2, u.getSenha());
                //5. Executar o comando
                try(var rs = ps.executeQuery()){
                    //6. Mover o cursor, verificando se o usuário existe
                    //7. Devolver um objeto usuário, null
                    return rs.next() ? u : null;
                }
            }
            
        }
    }
}
