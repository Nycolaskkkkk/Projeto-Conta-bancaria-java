package semana05;

import Models.Conta;
import Models.Pessoa;
import Util.GerenciadorConexao;
import java.util.ArrayList;
import Views.Sistema;
import io.github.cdimascio.dotenv.Dotenv;
import java.util.UUID;

public class Semana05 {
    
   
    public static ArrayList<Conta> banco = new ArrayList<>();
    
   public static Dotenv dotenv = Dotenv.load();
    
    public static void main(String[] args) {
       new Sistema().setVisible(true);
       GerenciadorConexao.getConexao();

    }
}
