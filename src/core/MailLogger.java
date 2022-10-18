package core;

public class MailLogger implements ILoggers{

	@Override
	public void log(String log) {
		System.out.println("Mail ile loglandı");
		
	}

}
