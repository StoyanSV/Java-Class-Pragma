public class ComputerDemo {
	public static void main(String[] args) {
		Computer hp = new Computer();
		Computer lenovo = new Computer();
		Computer asus = new Computer();
		Computer alienware = new Computer(2018,1000,300,300);
		Computer acer = new Computer(2017,900,true,400,300,"Ubuntu OS");
		
		hp.year = 2000;
		hp.hardDiscMemory = 200;
		hp.freeMemory = hp.hardDiscMemory;
		hp.isNotebook = false;
		hp.operationSystem = "Linux";
		hp.price = 1000;
		
		lenovo.year = 2010;
		lenovo.hardDiscMemory = 300;
		lenovo.freeMemory = hp.hardDiscMemory;
		lenovo.isNotebook = true;
		lenovo.operationSystem = "Windows";
		lenovo.price = 2000;
		
		lenovo.changeOperationSystem("Linux");
		lenovo.useMemory(300);
		hp.useMemory(100);

		int comparison = lenovo.compirePrice(acer);
		System.out.println(comparison);
			comparison = alienware.compirePrice(hp);
		System.out.println(comparison);
		    comparison = asus.compirePrice(hp);
		System.out.println(comparison);
	}
}
