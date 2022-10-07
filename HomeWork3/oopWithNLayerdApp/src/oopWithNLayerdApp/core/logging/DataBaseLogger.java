package oopWithNLayerdApp.core.logging;

public class DataBaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandı :" + data);
		
	}

}
