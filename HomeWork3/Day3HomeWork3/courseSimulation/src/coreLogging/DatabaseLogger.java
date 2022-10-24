package coreLogging;

public class DatabaseLogger implements ILogger {

	@Override
	public void log(String message) {
		System.out.println("Dosyaya loglandı: "+message);
		
	}

}
