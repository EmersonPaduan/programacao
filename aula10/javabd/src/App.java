import java.util.List;

import dao.UserDAO;
import model.User;

public class App {
    public static void main(String[] args) throws Exception {
        // Connection connection = Conector.getConnection();

        // if (connection == null) {
        // System.out.println("Erro de conexão.");
        // return;
        // }
        // System.out.println("Conectado...");
        // connection.close();

        // *** Teste de inserir novo Usuário no BD

        // User usuario = new User("Ana", "Ana@anhembi.br", "222222");

        // UserDAO dao = new UserDAO();
        // if (dao.insertUser(usuario)) {
        // System.out.println("usuário cadastrado");
        // } else {
        // System.out.println("Erro ao cadastrar");
        // }

        // dao.close();

        // *** Teste para atualizar um usuário

        // User usuario = new User(1, "Emerson", "emerson@paduan.pro.br", "54321");

        // UserDAO dao = new UserDAO();
        // if (dao.updateUser(usuario)) {
        // System.out.println("Dados atualizados");
        // } else {
        // System.out.println("Erro ao atualizar");
        // }

        // dao.close();

        // *** Teste para apagar um usuário

        // UserDAO dao = new UserDAO();
        // if (dao.deleteUser(2)) {
        // System.out.println("Usuário apagado");
        // } else {
        // System.out.println("Erro ao remover o usuário");
        // }

        // dao.close();

        // *** Testa a busca de um usuário

        // UserDAO dao = new UserDAO();
        // User user = dao.findUser(1);

        // if (user != null) {
        // System.out.println(user);
        // } else {
        // System.out.println("O usuário não encontrado.");
        // }

        // dao.close();

        // *** Testar listar todos os usuários

        UserDAO dao = new UserDAO();
        List<User> users = dao.listUser();

        for (User user : users) {
            System.out.println(user);
        }

        dao.close();

    }

}
