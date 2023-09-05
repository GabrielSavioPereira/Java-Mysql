package BancoDados;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBanco {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/empresa_funcionario","root","");

        }catch (Exception e){
        throw new RuntimeException(e);
        }
    }
}
