package core;

public class DatabaseLogger implements ILoggers{

	@Override
	public void log(String log) {
		System.out.println("Veri tabanına loglandı");
		
	}

}
