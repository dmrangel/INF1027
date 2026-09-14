import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Artista {
    private String nomeArtistico;
    private String nomeNascenca;
    private Date dataNascimento;
    private ArrayList<Album> albuns = new ArrayList<Album>();

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public String getNomeNascenca() {
        return nomeNascenca;
    }

    public Date getDataNasc() {
        return dataNascimento;
    }

    public void setDataNasc(int dia, int mes, int ano) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(ano, mes - 1, dia);
        this.dataNascimento = calendar.getTime();
    }

    public ArrayList<Album> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(ArrayList<Album> albuns) {
        this.albuns = albuns;
    }

    public int getQtdeAlbuns() {
        return this.albuns.size();
    }

    public int getQtdeMusicas() {
        int qtdTotalMusicas = 0;
        for (Album album : this.albuns) {
            qtdTotalMusicas += album.getQtdeMusicas();
        }
        return qtdTotalMusicas;
    }
}