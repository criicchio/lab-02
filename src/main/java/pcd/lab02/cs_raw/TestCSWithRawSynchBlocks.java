package pcd.lab02.cs_raw;

public class TestCSWithRawSynchBlocks {
// it will never print a sequence where b1,b2 has a2 and or a3 in between and vice versa (I think)
	public static void main(String[] args) {

		var lock = new Object();	
		
		new MyWorkerB("MyWorker-01", lock).start();
		new MyWorkerA("MyWorker-02", lock).start();		
	
	}

}
