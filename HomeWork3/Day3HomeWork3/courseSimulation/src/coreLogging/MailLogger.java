package coreLogging;

public class MailLogger implements ILogger {

	@Override
	public void log(String message) {
		System.out.println("Dosyaya loglandı: "+message);
		
	}

}
