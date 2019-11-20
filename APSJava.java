
public class APSJava {

	public static void main(String[] args) {

		
		long[] numeros = new long[2000000];
		long tempoInicialProcesso = 0;
		long tempoFinalProcesso = 0;
		long tempoPocesso = 0;
		long tempoInicialAmostra = 0;
		long tempoFinalAmostra = 0;
		long tempoAmostragem = 0;
		
		//INICIO DO PROCESSAMENTO
		tempoInicialProcesso = System.currentTimeMillis();
		
		for (long i = 1L; i <= numeros.length; i++){
			numeros[(int) (i-1)] =  i;
		}
		
		tempoFinalProcesso = System.currentTimeMillis();
		tempoPocesso = tempoFinalProcesso - tempoInicialProcesso;
		//FIM DO PROCESSAMENTO
		
		System.out.println("Tempo do Processamento: " + tempoPocesso +" Milisegundos"+ "\nInicio Processo: " + tempoInicialProcesso +"\nFinal Processo: " +tempoFinalProcesso);
		
		//INICIO DA AMOSTRAGEM
		tempoInicialAmostra = System.currentTimeMillis();
		
		for (int n = 1; n < numeros.length; n++){
			System.out.println(numeros[n]);
		}
		
		tempoFinalAmostra = System.currentTimeMillis();
		tempoAmostragem = (tempoFinalAmostra/1000) - (tempoInicialAmostra/1000);
		//FIM DA AMOSTRAGEM
		
		System.out.println("Tempo do Processamento: " + tempoPocesso +" Milisegundos"+ "\nInicio Processo: " + tempoInicialProcesso +"\nFinal Processo: " +tempoFinalProcesso);
		System.out.println("\nTempo do Amostragem: " + tempoAmostragem +" Segundos"+ "\nInicio Amostragem: " + tempoInicialAmostra +"\nFinal Amostragem: " +tempoFinalAmostra);
	}

}
