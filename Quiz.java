package quiz;

import java.io.IOException;
import java.util.Scanner;

public class Quiz {

 public static void main(String[] args) throws IOException {

 Scanner resposta = new Scanner(System.in);
 int pont = 0;
 System.out.println("Trabalho APS");
 System.out.println("Quiz sobre sustentabilidade");
 System.out.printf("\n----------------------------------------\n");
 int escolha;

 System.out.println("Qual o pais mais poluente do mundo?");
 System.out.println("\n 1) China. \n 2) Ìndia.\n 3) Estados Unidos\n 4) Brasil");
 escolha = resposta.nextInt();

 if (escolha == 1) {
   System.out.println("A resposta está correta");
   pont = pont + 1;
 }
 else {
   System.out.println("A resposta está incorreta");
 }
 System.out.printf("\n-----------------\n");
 
 System.out.println("O que é chuva ácida?");
 System.out.println("\n 1) É uma chuva que contém resíduos radioativos.\n 2) É um fenômeno atmosférico causado em escala local ou regional, pela precipitação de chuva carregada com grande quantidade de ácidos, resultante do lançamento de poluentes produzidos pelas atividades humanas.\n 3) É mais conhecida como chuva de granizo, que dependendo da sua intensidade pode ocasionar danos em pintura de veículos e casas devido ao impacto das pedras.\n 4) Não existe chuva acida. ");
 escolha = resposta.nextInt();

 if (escolha == 2) {
   System.out.println("A resposta está correta");
   pont = pont + 1;
 }
 else
   System.out.println("A resposta está incorreta");
 System.out.printf("\n-----------------\n");
 
 System.out.println("Qual a importância das abelhas para a vida no planeta?");
 System.out.println("\n 1) A polinização é o transporte de pólen de uma flor para a outra. É através da polinização das abelhas que as flores são fecundadas.\n 2) Só para a podução do mel para fins medicinais.\n 3) Ajudam a decompor residos orgânicos.\n 4) Não são relevantes.");
 escolha = resposta.nextInt();

 if (escolha == 1) {
   System.out.println("A resposta está correta");
   pont = pont + 1;
 }
 else
   System.out.println("A resposta está incorreta");
 System.out.printf("\n-----------------\n");
 
 System.out.println("Existe cores especificas para coleta de lixo? se sim quais são as cores e nomes de cada umas delas ?");
 System.out.println("\n 1) Azul-Residuos organico , Vermelha-Vidro, Verde-Vidro, Amarelo-Metal,Preto-Madeira, Laranja-Residuos Perigosos, Branco-Residuos Radioativos, Roxo- residuos ambulatórias e de serviço de saúde, Marrom-papel/papelão, Cinza-Residuo geral não reciclagem ou misturado ou contaminado não passível de separação.\n 2) Azul-papel/papelão , Vermelha-Plastico, Verde-Residuo geral não recliclavem ou misturado ou contaminado não passível de separação, Amarelo-Madeiral, Preto-Metal, Laranja-residuos perigosos, branco-residuos ambulatórias e de serviço de saúde, Roxo-Residuos Radioativos, Marrom Residuos Organicos, Cinza-Vidro.\n 3) Azul-papel/papelão , Vermelha-Plastico, Verde-Vidro, Amarelo-Metal,Preto-Madeira,Laranja-residuos perigosos, branco-residuos ambulatórias e de serviço de saúde, Roxo-Residuos Radioativos, Marron-Residuos Organicos, Cinza-Residuo geral\n" +
"não recliclavem ou misturado ou contaminado não passível de separação.\n 4) Não existe cores especificas para coleta de lixo.");
 escolha = resposta.nextInt();

 if (escolha == 3) {
   System.out.println("A resposta está correta");
   pont = pont + 1;
 }
 else
   System.out.println("A resposta está incorreta");
 System.out.printf("\n-----------------\n");
 
 System.out.println("Geograficamente falando o que são cumulonimbus?");
 System.out.println("\n 1) São as principais responsáveis pelas grandes turbulências em aviões em virtude de suas velocidades de deslocamento.\n 2) São nuvens baixas e escuras que geralmente ocasionam chuvas não muito fortes, porém mais duradouras. \n 3) Formam-se na parte mais alta da troposfera e estão associadas a dias bons e ensolarados.\n 4) São nuvens baixas conhecidas como nuvens de tempestades.");
 escolha = resposta.nextInt();

 if (escolha == 4) {
   System.out.println("A resposta está correta");
   pont = pont + 1;
 }
 else
   System.out.println("A resposta está incorreta");
 System.out.printf("\n-----------------\n");
 
 System.out.println("Qual o rio mais poluido do mundo?");
 System.out.println("\n 1) Lago Karachay, Rússia.\n 2) Ganges,Ìndia.\n 3) Citarum ,Indonesia. \n 4) Tiete ,Brazil. ");
 escolha = resposta.nextInt();

 if (escolha == 3) {
   System.out.println("A resposta está correta");
   pont = pont + 1;
 }
 else
   System.out.println("A resposta está incorreta");
 System.out.printf("\n-----------------\n");
 
 System.out.println("Qual o elemento que mais agride o nosso ecossistema?");
 System.out.println("\n 1) Garrafa. \n 2) Bateria\n 3) Borracha.\n 4) Papel.");
 escolha = resposta.nextInt();

 if (escolha == 2) {
   System.out.println("A resposta está correta");
   pont = pont + 1;
 }
 else
   System.out.println("A resposta está incorreta");
 System.out.printf("\n-----------------\n");
 
 System.out.println("Quantos anos o plástico leva para se decompor?");
 System.out.println("\n 1) 10 anos \n 2) 100 anos\n 3) 50 anos\n 4) 1.000 anos");
 escolha = resposta.nextInt();

 if (escolha == 2) {
   System.out.println("A resposta está correta");
   pont = pont + 1;
 }
 else
   System.out.println("A resposta está incorreta");
 System.out.printf("\n-----------------\n");
 
 System.out.println("Qual o combustível que mais polui o plante?");
 System.out.println("\n 1) Gasolina.  \n 2) Álcool. \n 3) Gás Natural (GNV).\n 4) Diesel.");
 escolha = resposta.nextInt();

 if (escolha == 4) {
   System.out.println("A resposta está correta");
   pont = pont + 1;
 }
 else
   System.out.println("A resposta está incorreta");
 System.out.printf("\n-----------------\n");
 
 System.out.println("Se tratando das árvores, qual dessas altenativas são falsas?");
 System.out.println("\n 1) Uma grande árvore pode providenciar as necessidades de oxigênio para nossa existência. \n 2) Retém CO2. \n 3) Quando jovens não conseguem filtrar o CO2.\n 4) Árvores reduzem poluição sonora e os ventos, mantendo umidade do ar e chuvas regulares.");
 escolha = resposta.nextInt();

 if (escolha == 3) {
   System.out.println("A resposta está correta");
   pont = pont + 1;
 }
 else
   System.out.println("A resposta está incorreta");
 System.out.printf("\n-----------------\n");
 
  
  //boolean//
 
 boolean continuar;
 System.out.println("Deseja saber a sua nota? Se sim digite 'S'");
 char c = (char) System.in.read();
 boolean answer;

 switch(c) {

   case 's':
   case 'S':
    System.out.printf("\n-----------------\n");
   System.out.println("Sua nota é:");
   System.out.println(pont+pont+pont+pont+pont+pont+pont+pont+pont+pont);
   System.out.println("Obrigado por participar!");

     break;
   default: System.out.println("Obrigado por participar!");
     break;
    
        }
    }
}