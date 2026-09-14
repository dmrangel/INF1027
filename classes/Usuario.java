import java.util.ArrayList;

public class Usuario {
    private String login;
    private String senha;
    private String username;
    private ArrayList<Musica> musicasFavoritas = new ArrayList<>();
    private ArrayList<Playlist> listaPlaylists = new ArrayList<>();

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Usuario verificarLogin(String login, String senha) {
        if (UsuarioDAO.verificaUsuario(login, senha)) {
            return UsuarioDAO.getUsuario(login, senha);
        }
        return null;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public boolean favoritar(Musica musica) {
        return (this.musicasFavoritas.add(musica));
    }

    public boolean escutar(Musica musica) {
        return UsuarioDAO.escutar(musica);
    }

    public Playlist criarPlaylist(String nome) {
        Playlist novaPlaylist = new Playlist(nome);
        listaPlaylists.add(novaPlaylist);
        return novaPlaylist;
    }

    public ArrayList<Musica> getMusicasFavoritas() {
        return musicasFavoritas;
    }

    public void setMusicasFavoritas(ArrayList<Musica> musicasFavoritas) {
        this.musicasFavoritas = musicasFavoritas;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Playlist> getListaPlaylists() {
        return listaPlaylists;
    }

}