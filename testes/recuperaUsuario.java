package testes;
import musica.UsuarioDAO;
import musica.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecuperaUsuario {
    @Test
    void testarRecuperaUsuario() {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        // usuario existente é recuperado
        Usuario usuario = usuarioDAO.getUsuario("davi", "1234");
        assertNotNull(usuario);
        assertEquals("davi", usuario.getLogin());
        assertEquals("1234", usuario.getSenha());

        // senha errada nao recupera usuario
        assertNull(usuarioDAO.getUsuario("davi", "senha errada"));

        // login inexistente nao recupera usuario
        assertNull(usuarioDAO.getUsuario("ninguem", "1234"));
    }
}
