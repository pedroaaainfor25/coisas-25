
package connection;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class conexaoBD {
    public Statement   stm;
    public ResultSet   rm;
    private String    driver = "com.mysql.jdbc.Driver";
    private String    caminho = "jdbc:mysql://localhost/cadastromedico";
    private String    usuario = "root";
    private String    senha   = "";
    private Connection con;    
}

 try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManeger.getConnection
            (caminho, usuario,senha);
        JOptionPane.showMassageDialog(null, "conexao efetuada com sucesso");
        }   catch (SQLException ex) {
         JOptionPane.showMessageDialog
          (null, "Erro ao se conectar:\n" +ex.getMessage());
}
