
package conexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class conexaoBD {
   public Statement       stm;
   public ResultSet       rs;
   public String        driver = "com.mysql.jdbc.Driver";
   public String       caminho = "jdbc:mysql://localhost/cadastromedico";
   public String      usuario = "root";
   public String       senha = "leandro07";
   public Connection    con;
   
   
   
   
    public static void main(String[] args){
       
       conexaoBD conex2 = new conexaoBD();
       conex2.conexao();
       
      
  
       
   
   } 
   
   
   
   
   public void conexao(){
       try {
           System.setProperty("jdbc.Drivers", driver);
                   
    con = DriverManager.getConnection(caminho, usuario,senha);
    
  JOptionPane.showMessageDialog(null, "Conexao Efetuada com sucesso");
       } catch (SQLException ex) {
           
   JOptionPane.showMessageDialog(null, "Erro ao se conectar:\n" +ex.getMessage());
       }
   }
   
     
   
    
  public void executaSql (String sql){
      try{
  stm=con.createStatement(rs.TYPE_SCROLL_SENSITIVE,rs.CONCUR_READ_ONLY );
  rs= stm.executeQuery(sql);
      }catch (SQLException ex){
          JOptionPane.showMessageDialog
      (null,"Erro ao executar sql :/n" +ex.getMessage());
          
          
      }
  }
   
   
        public void desconectar (){
        try {
    con.close();
            
  JOptionPane.showMessageDialog(null, "Desconectado com Sucesso");
        } catch (SQLException ex) {
  JOptionPane.showMessageDialog
        (null, "Erro ao fechar conexão:\n"+ex.getMessage());
        }
  
       
        }
  
   
   
   
}