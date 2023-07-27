
package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class Login {
  
    public boolean Logar (String usuario, String senha){
        
        String SQL = "SELECT usuario,senha FROM usuarios WHERE usuario = ? AND senha = ?";
        Connection conn = new ConexaoDAO().conectaBD();
        boolean loginSucesso = false;
        try {
           
            PreparedStatement pstm = conn.prepareStatement(SQL); 
            pstm.setString(1, usuario);
            pstm.setString(2, senha);
            
            // criamos a váriavel rs a fim de retornar um registro da tabela da nossa BD
            ResultSet rs = pstm.executeQuery();
            
            if(rs.next()){
                loginSucesso = true;
            }
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao efetuar login"+ e.getMessage());
        }
        return loginSucesso;
    }
}
