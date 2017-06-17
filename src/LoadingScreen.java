import javax.swing.JFrame;

public class LoadingScreen extends JFrame implements Runnable{
	ProgressPage p = new ProgressPage();
	public LoadingScreen() {
		this.setSize(MainFrame.SIZE);
		this.setVisible(true);
		this.add(p);
		new Thread(new Runnable() {
			@Override
			public void run() {			
				for (int i = 1; i <= 100; i++) {
					p.UpdateProgress(i);
					p.repaint();
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}

		).start();
	}
	@Override
	public void run() {
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.dispose();
	}
	
}