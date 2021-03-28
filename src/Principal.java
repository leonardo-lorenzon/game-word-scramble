import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		String mecanicaInput = "";
		Scanner scanner = new Scanner(System.in);
		
		while (!mecanicaInput.equals("T") && !mecanicaInput.equals("M")) {
			System.out.println("Escolha a mecanica de jogo. (T) para tres vidas, (M) para melhor de dez.");
			mecanicaInput = scanner.nextLine();
		}
		
		MecanicaDoJogo mecanicaDoJogo = new FabricaMecanicaDoJogo()
				.getMecanicaDoJogo(MecanicasDeJogoMapper.toMecanicasDeJogo(mecanicaInput));
		
		while (!mecanicaDoJogo.terminouJogo()) {
			String palavraEmbaralhada = mecanicaDoJogo.getPalavraEmbaralhada();
			String palavraInserida;
			
			System.out.println("Tente adivinhar a seguinte palavra: "+palavraEmbaralhada);
			
			palavraInserida = scanner.nextLine();
			
			if (mecanicaDoJogo.acertouPalavra(palavraInserida)) {
				System.out.println("Você acertou.");
			} else {
				System.out.println("Você Errou.");
			}
			
		}
		
		System.out.println("Fim de jogo. A sua pontuação final foi: "+mecanicaDoJogo.getPontuacao());

		scanner.close();
	}
}
