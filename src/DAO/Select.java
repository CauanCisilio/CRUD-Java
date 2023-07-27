
package DAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class Select {
   
    public ArrayList<ConexaoDAO> ListarFuncionarios(){
        String SQL = "SELECT * FROM funcionarios";
        ArrayList<ConexaoDAO> lista = new ArrayList<>();
        Connection conn = new ConexaoDAO(). conectaBD();
        try {
            PreparedStatement pstm = conn.prepareStatement(SQL);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                ConexaoDAO funcionario = new ConexaoDAO();
                funcionario.setMatricula(rs.getInt("matricula"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setSalario(rs.getDouble("salario"));
                lista.add(funcionario);
            }
        } catch (SQLException e) {
        }
        return lista;
    }
    public List<ConexaoDAO> ListaIndividual(String nome){
         List<ConexaoDAO> lista = new ArrayList<>();
         String SQL = "SELECT * FROM funcionarios WHERE LOWER(nome) LIKE ?";
         Connection conn = new ConexaoDAO(). conectaBD();
        try {
            PreparedStatement pstm = conn.prepareStatement(SQL);
            pstm.setString(1, "%" + nome.toLowerCase() + "%");
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                ConexaoDAO funcionario = new ConexaoDAO();
                funcionario.setMatricula(rs.getInt("matricula"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setSalario(rs.getDouble("salario"));
                lista.add(funcionario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
