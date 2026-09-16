package musica;

import java.util.ArrayList;

public class Album {
    private String titulo;
    private int anoLancamento;
    private ArrayList<Musica> musicas = new ArrayList<>();
    private ArrayList<Artista> artistas = new ArrayList<>();

    public Album(String titulo, int anoLancamento) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public int getQtdeMusicas() {
        return this.musicas.size();
    }

    public boolean adicionarMusica(Musica musica) {
        return this.musicas.add(musica);
    }

    public boolean removerMusica(Musica musica) {
        return this.musicas.remove(musica);
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public boolean adicionarArtista(Artista artista) {
        if (this.artistas.contains(artista)) {
            return false;
        }
        this.artistas.add(artista);
        artista.adicionarAlbum(this);
        return true;
    }
}
