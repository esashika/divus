package thread;
public class MinhaThread implements Runnable {
//vantagem do runnable  herdar da varias classes
	char letra;

	public MinhaThread(char letra) {
		this.letra = letra;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print(letra);
		}
	}

	public static void main(String[] args) {
		MinhaThread t1 = new MinhaThread ('a');
		MinhaThread t2 = new MinhaThread ('b');
		MinhaThread t3 = new MinhaThread ('c');
		MinhaThread t4 = new MinhaThread ('>');
		
		new Thread(t1).start();
		new Thread(t2).start();
		new Thread(t3).start();
		new Thread(t4).start();
		
		System.out.println("Finalizou");
	}
	
	
}
