package duplicate;

import java.util.List;

public class AluguelDeCarro {
    private List<Aluguel> alugueis;

    public AluguelDeCarro(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }
    public void atualizaValorDoAluguel(int id, int valor){
        for(Aluguel aluguel: alugueis){
            if(aluguel.getId() == id  ){
                aluguel.setValor(valor);
            }
        }

    }
    public void deleteAluguel(int id){
        for(Aluguel aluguel: alugueis) {
            if (aluguel.getId() == id) {
                alugueis.remove(aluguel);
            }
        }
    }
    public void calculaImposto(int id, float percentual){
        for(Aluguel aluguel: alugueis) {
            if (aluguel.getId() == id) {
                System.out.println(aluguel.getValor() * percentual);
            }
        }
    }
}
