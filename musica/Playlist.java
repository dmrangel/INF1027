import java.util.ArrayList;

public class Playlist {
    private String titulo;
    private ArrayList<Musica> musicas = new ArrayList<>();

    public Playlist(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public boolean adicionarMusica(Musica musica) {
        return this.musicas.add(musica);
    }

    public boolean removerMusica(Musica musica) {
        return this.musicas.remove(musica);
    }
}
