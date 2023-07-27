
package DAO;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Update {
    public Connection updateBD(int matricula,String cargo,Double salario){
        Connection conn = new ConexaoDAO().conectaBD();
        
        String SQL = "UPDATE funcionarios SET cargo = ?, salario = ? WHERE matricula = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(SQL);
           
            pstm.setString(1,cargo);
            pstm.setDouble(2,salario);
            pstm.setInt(3,matricula);
            
            
            pstm.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage());
        }
        
        return conn;
    }
}
