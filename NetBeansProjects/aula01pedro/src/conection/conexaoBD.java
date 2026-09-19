package conection;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexaoBD {
     public Statement   stm;
    public ResultSet   rm;
    private String    driver = "com.mysql.jdbc.Driver";
    private String    caminho = "jdbc:mysql://localhost/cadastromedico";
    private String    usuario = "root";
    private String    senha   = "";
    private Connection con; 

    public void conection() {
        try {
            System.setProperty("jdbc.Driver", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar:\n" + ex.getMessage());
        }
    }
}
 