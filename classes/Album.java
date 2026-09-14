import java.util.ArrayList;

public class Album {
    private String titulo;
    private int anoLancamento;
    private ArrayList<Musica> musicas = new ArrayList<Musica>();

    public Album(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public int getQtdeMusicas() {
        return this.musicas.size();
    }

    public boolean adicionarMusica(Musica musica) {
        return (this.musicas.add(musica));
    }

    public boolean removerMusica(Musica musica) {
        return (this.musicas.remove(musica));
    }
}