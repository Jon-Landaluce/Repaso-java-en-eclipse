
public class Alumno extends Persona implements Humano{
	
	private String secondName;
	

	@Override
	public String getName() {
		return secondName;
	}

	@Override
	public void setName(String name) {
		secondName = name;
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		
	}
	
}
