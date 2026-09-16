package testes;
import musicas.Usuario;
import musicas.Playlist;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class CriacaoPlaylist {
    @Test
    void testarCriacaoPlaylist() {
        Usuario usuario = new Usuario("joao", "123456");
        String nomePlaylist = "Playlist 1";
        boolean resultadoCriacao = usuario.criarPlaylist(nomePlaylist);

        // criou playlist ou nao
        assertEquals(true, resultadoCriacao);

        ArrayList<Playlist> playlists = new usuario.getListaPlaylist();
        Playlist playlist = playlists.get(0);

        // numero de playlists
        assertEquals(1, playlists.size());

        // nome da playlist adicionada
        assertEquals(nomePlaylist, playlist.getTitulo());
    }
}