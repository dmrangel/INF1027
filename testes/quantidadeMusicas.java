package testes;
import musica.Artista;
import musica.Album;
import musica.Musica;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class getQuantidadeMusicas {
    @Test
    void testaQuantidadeMusicas() {
        Artista artista = new Artista("dmrangel", "Davi Rangel");
        Album album = new Album("Album 1", 2026);
        // o construtor de Musica ja adiciona a musica no album
        new Musica("Musica 1", album);
        artista.adicionarAlbum(album);
        int quantidadeMusicas = artista.getQtdeMusicas();

        // quantidade musicas
        assertEquals(1, quantidadeMusicas);

        // quantidade musicas atualizada com mais uma musica
        new Musica("Musica 2", album);
        quantidadeMusicas = artista.getQtdeMusicas();
        assertEquals(2, quantidadeMusicas);
    }
}
