package testes;
import musicas.Artista;
import musicas.Album;
import musicas.Musica;
import static org.junit.jupiter.api.Assertions.*;

class getQuantidadeMusicas {
    @Test
    void testaQuantidadeMusicas() {
        Artista artista = new Artista("dmrangel", "Davi Rangel");
        Album album = new Album("Album 1", "2026");
        Musica musica = new Musica("Musica 1", album);
        album.adicionarMusica(musica);
        artista.adicionarAlbum(album);
        int quantidadeMusicas = artista.getQtdeMusicas();

        // quantidade musicas
        assertEquals(1, quantidadeMusicas);

        // quantidade musicas atualizada com mais uma musica
        musica = new Musica("Musica 2", album);
        album.adicionarMusica(musica);
        quantidadeMusicas = artista.getQtdeMusicas();
        assertEquals(2, quantidadeMusicas);
    }
}