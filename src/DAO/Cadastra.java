package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Cadastra {
    public void cadastra(ConexaoDAO cadastra){
        String SQL = "INSERT INTO funcionarios (matricula,nome,cargo,salario) VALUES (?,?,?,?)";
        try {
            Connection conn = new ConexaoDAO().conectaBD();
            PreparedStatement pstm = conn.prepareStatement(SQL);
            
            pstm.setInt(1,cadastra.getMatricula());
            pstm.setString(2,cadastra.getNome());
            pstm.setString(3,cadastra.getCargo());
            pstm.setDouble(4,cadastra.getSalario());
            
            pstm.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar item no banco de dados"+e.getMessage());
        }
    }
}
