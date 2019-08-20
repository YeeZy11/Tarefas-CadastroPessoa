public class Endereco {

private Integer numero;
private String rua;
private String cidade;


public Endereco() {
super();

}


public Endereco(Integer numero, String rua, String cidade) {
super();
this.numero = numero;
this.rua = rua;
this.cidade = cidade;
}




public Integer getNumero() {
return numero;
}
public void setNumero(Integer numero) {
this.numero = numero;
}
public String getRua() {
return rua;
}
public void setRua(String rua) {
this.rua = rua;
}
public String getCidade() {
return cidade;
}
public void setCidade(String cidade) {
this.cidade = cidade;
}


}