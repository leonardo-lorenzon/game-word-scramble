import java.util.HashMap;

public class MecanicasDeJogoMapper {
	public static HashMap<String, MecanicasDeJogo> mapper = new HashMap<String, MecanicasDeJogo>() {{
		put("T", MecanicasDeJogo.tresVidas);
		put("M", MecanicasDeJogo.melhorDeDez);
		}};
		
	public static MecanicasDeJogo toMecanicasDeJogo(String input) {
		return mapper.get(input);
	}
	
}
