package coreLogging;

public class FileLogger implements ILogger {

	@Override
	public void log(String message) {
		System.out.println("Dosyaya loglandı: "+message);
		
	}

}
