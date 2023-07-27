package DAO;
import DAO.ConexaoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;



public class Deleta {
    public Connection deletaBD(int matricula){
        //query para deletar o funcionário do banco de dados
        String SQL = "DELETE FROM funcionarios WHERE matricula= ?";
        Connection conn = new ConexaoDAO().conectaBD();
        try {           
            PreparedStatement pstm = conn.prepareStatement(SQL);
            pstm.setInt(1,matricula);
            
            pstm.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir usuário");
            e.printStackTrace();
        }
        return conn;
    }
}
