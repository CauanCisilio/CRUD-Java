package DAO;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
        private int matricula;
        private String nome;
        private String cargo;
        private double salario;
        
        public int getMatricula(){
            return this.matricula;
        }
        public void setMatricula(int matricula){
            this.matricula = matricula;
        }
        
        public String getNome(){
            return this.nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public String getCargo(){
            return this.cargo;
        }
        public void setCargo(String cargo){
            this.cargo = cargo;
        }
        public double getSalario(){
            return this.salario;
        }
        public void setSalario(double salario){
            this.salario = salario;
        }
        Connection conn;
    public Connection conectaBD(){
        
        String host = "jdbc:postgresql://localhost:5432/funcionarios";
        String user = "postgres";
        String password = "postgres";
        
        Connection conn = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(host,user,password);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"erro ao se conectar ao BD"+e.getMessage());
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"erro, driver não encontrado"+e.getLocalizedMessage());
            e.printStackTrace();
        }
        
        return conn;
    }
}
