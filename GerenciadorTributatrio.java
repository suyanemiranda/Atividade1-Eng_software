import java.util.List;

public class GerenciadorTributatrio {

	public void registraTotalImpostoMes(int ano, int mes, List<Venda> vendasMes) {
		
		//registra valor do imposto total
		BancoDados banco = new BancoDados();
		banco.save(ano, mes, imposto);
		
	}

}
