public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiscMemory;
	double freeMemory;
	String operationSystem;
	
	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
		System.out.println("The new operation system is: " + newOperationSystem);
	}
	
	void useMemory(double memory) {
		if(memory > freeMemory) {
			System.out.println("There is not enought memory");
		} else {
			freeMemory = freeMemory - memory;
		}
	}
	Computer(){
		isNotebook = false;
		operationSystem = "WinXP";
	}
	Computer(int year, double price, double hardDiscMemory,double freeMemory){
		this();
		this.year = year;
		this.price = price;
		this.hardDiscMemory = hardDiscMemory;
		this.freeMemory = freeMemory;
	}
	Computer(int year, double price,boolean isNotebook,double hardDiscMemory,double freeMemory,String operationSystem){
		this.year = year;
		this.price = price;
		this.hardDiscMemory = hardDiscMemory;
		this.freeMemory = freeMemory;
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
	}
	int compirePrice(Computer otherComp){
		if (this.price > otherComp.price){
			return -1;
		}
		if(this.price < otherComp.price){
			return 1;
		}else{return 0;
		}
	}
}
