public class BuilderTest {
	
	    public static void main(String[] args) {

	        System.out.println();
	        Computer LaptopComputer = new Computer.Builder()
	                .setCPU("Intel Core i7-1255U")
	                .setRAM("16 GB LPDDR5")
	                .setStorage("512 GB SSD")
	                .build();
	        Computer DesktopComputer = new Computer.Builder()
	                .setCPU("AMD Ryzen 9 7900X")
	                .setRAM("32 GB DDR5")
	                .setStorage("1 TB NVMe SSD + 2 TB HDD")
	                .setDisplay("27-inch 4K UHD Monitor")
	                .setGraphics("NVIDIA GeForce RTX 4070")
	                .build();
	        System.out.println("Laptop Computer: " + LaptopComputer);
	        System.out.println("\n\nDesktop Computer: " + DesktopComputer);
	    }
	}
