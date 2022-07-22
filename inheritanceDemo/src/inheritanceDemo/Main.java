package inheritanceDemo;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) {
		System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true,
				StandardCharsets.UTF_8));
		
		OgretmenKrediManager ogretmenKrediManager =new OgretmenKrediManager();
		ogretmenKrediManager.hesapla();
		
		TarimKrediManager tarimKrediManager = new TarimKrediManager();
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(tarimKrediManager);
	}

}
