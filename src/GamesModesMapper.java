import java.util.HashMap;

public class GamesModesMapper {
	public static HashMap<String, GameModes> mapper = new HashMap<String, GameModes>() {{
		put("T", GameModes.THREE_LIVES);
		put("B", GameModes.BEST_OF_TEN);
		}};
		
	public static GameModes toGameMode(String input) {
		return mapper.get(input);
	}
	
}
