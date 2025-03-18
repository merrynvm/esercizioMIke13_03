public class Prodotto {
    private int id;
    private String nome_prodotto;
    private Double prezzo;
    private Integer quantita;

    public Prodotto(int id, String nome_prodotto, Double prezzo, Integer quantita){
        this.id = id;
        this.nome_prodotto = nome_prodotto;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public int getId() {
        return id;
    }

    public String getNome_prodotto() {
        return nome_prodotto;
    }

    public void setNome_prodotto(String nome_prodotto) {
        this.nome_prodotto = nome_prodotto;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public Integer getQuantita() {
        return quantita;
    }

    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }
}
