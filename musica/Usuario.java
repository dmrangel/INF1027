import java.util.ArrayList;

public class Usuario {
    private String login;
    private String senha;
    private ArrayList<Musica> musicasFavoritas = new ArrayList<>();
    private ArrayList<Playlist> listaPlaylists = new ArrayList<>();
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean verificarLogin(String login, String senha) {
        if (!usuarioDAO.verificaUsuario(login, senha)) {
            return false;
        }
        Usuario usuario = usuarioDAO.getUsuario(login, senha);
        this.login = usuario.getLogin();
        this.senha = usuario.getSenha();
        return true;
    }

    public boolean favoritar(Musica musica) {
        return musicasFavoritas.add(musica);
    }

    public boolean escutar(Musica musica) {
        return usuarioDAO.escutar(musica);
    }

    public boolean criarPlaylist(String nome) {
        return listaPlaylists.add(new Playlist(nome));
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public ArrayList<Musica> getMusicasFavoritas() {
        return musicasFavoritas;
    }

    public ArrayList<Playlist> getListaPlaylists() {
        return listaPlaylists;
    }
}
