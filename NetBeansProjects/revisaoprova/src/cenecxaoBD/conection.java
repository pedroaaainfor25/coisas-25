
package cenecxaoBD;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


 
public class conection {
    // faz a pesquisa no banco de dados 
    public Statement stm;
    // traz a pesquisa do banco de dados 
    public ResultSet rs;
    //e o drive do banco 
    public String driver = "com.mysql.jdbc.Driver";
    // e onde esta o banco 
    public String caminho = "jdbc:mysql://localhost/cadastromedico";
    //usuario padrao =root
    public String  usuario = "root";
    //senha do banco ( se tiver)
    public String senha = "";
    //conecta com o banco 
    public Connection con;
    
    
    public void conecxao() {
        try {
       System.setProperty("jdbc.Drivers", driver);
     con = DriverManager.getConnection(caminho,usuario,senha);
  JOptionPane.showMessageDialog (null,"Conexao Efetuada com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog (null,"Erro ao se Conectar:\n" +ex.getMessage());
            
        }


}

    public  static void main(String [] args) {
          
        conection conex = new conection();
        
        
        
        
         conex.conecxao();
                
    }
    
    
    
    
    
    
}


   
    
    
    
    
    
    
    
    
    
    
