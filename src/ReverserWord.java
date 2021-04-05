
public class ReverserWord implements WordScrambler {
	@Override
	public String scrambleWord(String palavra) {
		StringBuilder stringBuider = new StringBuilder(palavra);
		
		return stringBuider.reverse().toString().toUpperCase();
	}

}
