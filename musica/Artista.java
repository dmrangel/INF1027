package musica;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Artista {
    private String nomeArtistico;
    private String nomeNascenca;
    private Date dataNascimento;
    private ArrayList<Album> albuns = new ArrayList<>();

    public Artista(String nomeArtistico, String nomeNascenca) {
        this.nomeArtistico = nomeArtistico;
        this.nomeNascenca = nomeNascenca;
    }

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

    public boolean adicionarAlbum(Album album) {
        if (this.albuns.contains(album)) {
            return false;
        }
        this.albuns.add(album);
        album.adicionarArtista(this);
        return true;
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
