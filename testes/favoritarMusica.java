package testes;
import musica.Usuario;
import musica.Musica;
import musica.Album;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FavoritarMusica {
    @Test
    void testaFavoritarMusica() {
        Usuario usuario = new Usuario("joao", "123456");
        Album album = new Album("Album 1", 2026);
        String nomeMusica = "Musica 1";
        Musica musica = new Musica(nomeMusica, album);
        boolean retornoFavoritar = usuario.favoritar(musica);
        ArrayList<Musica> musicasFavoritadas = usuario.getMusicasFavoritas();

        // favoritou ou nao
        assertEquals(true, retornoFavoritar);

        // numero de musicas favoritadas
        assertEquals(1, musicasFavoritadas.size());

        // nome da musica favoritada igual ao nome definido
        Musica musicaFavoritada = musicasFavoritadas.get(0);
        assertEquals(nomeMusica, musicaFavoritada.getTitulo());
    }
}
