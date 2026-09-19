
package connection;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;




public class conexaoBD {
    public Statement   stm;
    public ResultSet   rm;
    private String    drive = "com.mysqul.jdbc.Driver";
    private String    caminho = "jdbc://localhost/cadastromedico";
    private String    usuario = "root";
    private String    senha   = "";
    private Connection con;
    
}
