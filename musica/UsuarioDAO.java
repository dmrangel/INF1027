package musica;

import java.util.ArrayList;

public class UsuarioDAO {

    private static final String[][] USUARIOS_MOCADOS = {
        {"davi", "1234"},
        {"maria", "senha123"},
        {"joao", "abcd"}
    };

    private static final ArrayList<Artista> artistas = criarArtistasMocados();

    public boolean verificaUsuario(String login, String senha) {
        for (String[] usuario : USUARIOS_MOCADOS) {
            if (usuario[0].equals(login) && usuario[1].equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public Usuario getUsuario(String login, String senha) {
        if (!verificaUsuario(login, senha)) {
            return null;
        }
        return new Usuario(login, senha);
    }

    public boolean escutar(Musica musica) {
        return getMusicas().contains(musica);
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public ArrayList<Album> getAlbuns() {
        ArrayList<Album> albuns = new ArrayList<>();
        for (Artista artista : artistas) {
            albuns.addAll(artista.getAlbuns());
        }
        return albuns;
    }

    public ArrayList<Musica> getMusicas() {
        ArrayList<Musica> musicas = new ArrayList<>();
        for (Album album : getAlbuns()) {
            musicas.addAll(album.getMusicas());
        }
        return musicas;
    }

    private static ArrayList<Artista> criarArtistasMocados() {
        ArrayList<Artista> lista = new ArrayList<>();

        Artista artista1 = new Artista("Artista Um", "Nome de Nascenca Um");
        artista1.setDataNasc(10, 5, 1980);
        Album album1 = new Album("Primeiro Album", 2001);
        artista1.adicionarAlbum(album1);
        new Musica("Musica Um", album1);
        new Musica("Musica Dois", album1);

        Artista artista2 = new Artista("Artista Dois", "Nome de Nascenca Dois");
        artista2.setDataNasc(22, 11, 1975);
        Album album2 = new Album("Segundo Album", 2010);
        artista2.adicionarAlbum(album2);
        new Musica("Musica Tres", album2);

        lista.add(artista1);
        lista.add(artista2);
        return lista;
    }
}
