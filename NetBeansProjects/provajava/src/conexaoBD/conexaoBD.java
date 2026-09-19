package conexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexaoBD {
    

    public Statement stm; 
    public ResultSet rs;
    public String driver = "com.mysql.jdbc.Driver";
    public String caminho = "jdbc:mysql://localhost/cadastromedico";
    public String usuario = "root";
    public String senha = "";
    public Connection con;
    
  public void conexao (){
      try{ 
          System.setProperty("jdbc.drivers", driver);
        con = DriverManager.getConnection(caminho, usuario, senha);
        JOptionPane.showMessageDialog(null, "conexao efetuada com sucesso");
      } catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"erro ao se conectar;/n" +ex.getMessage());
          
      }
      
  }
  public static void main (String [] args){
  
  conexaoBD conex = new conexaoBD();
    conex.conexao();
}
    

public void desconectar (){
    try {
        con.close();
        JOptionPane.showMessageDialog(null, "Desconectado com sucesso");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao fechar conexão:\n" + ex.getMessage());
    }
}
}
    

