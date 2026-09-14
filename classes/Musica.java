public class Musica {
    private String titulo;
    private int duracao;
    private int avaliacaoEstrelasMedia;
    private int avaliacaoUsuario;
    private Album album;

    public Musica(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getAvaliacaoEstrelasMedia() {
        return avaliacaoEstrelasMedia;
    }

    public void setAvaliacaoEstrelasMedia(int avaliacaoEstrelasMedia) {
        this.avaliacaoEstrelasMedia = avaliacaoEstrelasMedia;
    }

    public int getAvaliacaoUsuario() {
        return avaliacaoUsuario;
    }

    public void setAvaliacaoUsuario(int avaliacaoUsuario) {
        this.avaliacaoUsuario = avaliacaoUsuario;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}