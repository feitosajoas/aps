
public class APSJavaString {

	public static void main(String[] args) {
		
		String numeros = "";
		long tempoInicialProcesso = 0;
		long tempoFinalProcesso = 0;
		long tempoPocesso = 0;
		
		//INICIO DO PROCESSAMENTO
		tempoInicialProcesso = System.currentTimeMillis();
		
		for (long i = 1; i <= 2000000; i++){
			numeros += "\n"+i;
		}
		
		tempoFinalProcesso = System.currentTimeMillis();
		tempoPocesso = tempoFinalProcesso - tempoInicialProcesso;
		//FIM DO PROCESSAMENTO
		
		System.out.println("Numeros: "+numeros +"\nTempo do Processamento: " + tempoPocesso +" Milisegundos"+ "\nInicio Processo: " +
		tempoInicialProcesso +"\nFinal Processo: " +tempoFinalProcesso);
		
	}

}
