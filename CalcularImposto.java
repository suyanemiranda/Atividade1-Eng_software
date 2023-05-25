
public interface ICalculadorImposto(){

        public void CalcularImposto(List<Venda> vendasMes) {    

        double imposto = 0;
        for (Venda venda : vendasMes)
                {	
                if (venda.getValor() < 1000)
                        imposto += 0.05 * venda.getValor();
                else
                        imposto += 0.07 * venda.getValor();
                }
        }
}