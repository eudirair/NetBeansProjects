
package classeParaTeste;

public class Dinheiro {
    private final int quantidade;
private final String moeda;

public Dinheiro(int quantidade, String moeda){

if (quantidade < 0) {
throw new IllegalArgumentException(
"ilegal quantidade: [" + quantidade + "]");
}
if (moeda == null || moeda.isEmpty()) {
throw new IllegalArgumentException(
"ilegal moeda: [" + moeda + "]");
}
this.quantidade = quantidade;
this.moeda = moeda;
}

public int getQuantidade() {
return quantidade;
}
public String getMoeda() {
return moeda;
}

    
}
