package testes;
import musica.Artista;
import musica.Album;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class getQuantidadeAlbuns {
    @Test
    void testaQuantidadeAlbuns() {
        Artista artista = new Artista("dmrangel", "Davi Rangel");
        Album album = new Album("Album 1", 2026);
        artista.adicionarAlbum(album);
        int quantidadeAlbuns = artista.getQtdeAlbuns();

        // quantidade albuns
        assertEquals(1, quantidadeAlbuns);

        // quantidade atualizada com mais um album
        album = new Album("Album 2", 2026);
        artista.adicionarAlbum(album);
        quantidadeAlbuns = artista.getQtdeAlbuns();
        assertEquals(2, quantidadeAlbuns);
    }
}
