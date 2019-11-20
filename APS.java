package aps;

import java.util.ArrayList;


public class APS {

  
    public static void main(String[] args) {
        Circunferencia circunferencia = new Circunferencia();
        Long ini, fim;
        Double variavel = circunferencia.variavel;
        Double constante = circunferencia.constante;
        
        ArrayList<Float> tempos = new ArrayList();
        
        for (int x = 0; x < 30; x++) {
            ini = System.currentTimeMillis();
            for (int i = 0; i < 2000000000; i++) {
                circunferencia.calculaAreaCircunferencia(constante, i);
                circunferencia.calculaPerimetroCircunferencia(constante, i);
            }
            fim = System.currentTimeMillis();
            float tempo = fim - ini;
            tempos.add(tempo);
        }
        
        float menorTempo = 1000000000;
        float maiorTempo = -1;
        float somaTempo = 0;
        
        for (Float time: tempos) {            
            if (time >= maiorTempo) {
                maiorTempo = time;
            }
            if (menorTempo <= time) {
                menorTempo = time;
            }           
            somaTempo += time;
        }
        
        System.out.println("Maior tempo: " + maiorTempo);
        System.out.println("Menor tempo: " + menorTempo);
        System.out.println("Média: " + (somaTempo / 30));
    }
    
}
