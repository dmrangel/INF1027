import java.util.ArrayList;

public class Playlist {
    private String titulo;
    private Usuario criador;
    private ArrayList<Musica> musicas = new ArrayList<Musica>();

    public Playlist(String titulo) {
        this.titulo = titulo;
    }

    public boolean adicionarMusica(Musica musica) {
        return (this.musicas.add(musica));
    }
    public boolean removerMusica(Musica musica) {
        return (this.musicas.remove(musica));
    }
}