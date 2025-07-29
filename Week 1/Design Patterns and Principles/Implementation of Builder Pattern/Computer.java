public class Computer {

	    private final String CPU;
	    private final String RAM;
	    private final String Storage;
	    private final String Display;
	    private final String Graphics;

	    private Computer(Builder builder) {
	        this.CPU = builder.CPU;
	        this.RAM = builder.RAM;
	        this.Storage = builder.Storage;
	        this.Display = builder.Display;
	        this.Graphics = builder.Graphics;
	    }
	    @Override
	    public String toString() {
	        return "" +
	                "\nCPU      : " + CPU +  
	                " \nRAM      : " + RAM + 
	                " \nStorage  : " + Storage + 
	                " \nDisplay  : " + Display+ 
	                " \nGraphics : "+ Graphics ;
	    }
	    public static class Builder {
	        private String CPU;
	        private String RAM;
	        private String Storage;
	        private String Display;
	        private String Graphics;

	        public Builder setCPU(String CPU) {
	            this.CPU = CPU;
	            return this;
	        }

	        public Builder setRAM(String RAM) {
	            this.RAM = RAM;
	            return this;
	        }

	        public Builder setStorage(String Storage) {
	            this.Storage = Storage;
	            return this;
	        }

	        public Builder setDisplay(String Display) {
	            this.Display= Display;
	            return this;
	        }

	        public Builder setGraphics(String Graphics) {
	            this.Graphics = Graphics;
	            return this;
	        }

	        public Computer build() {
	            return new Computer(this);
	        }
	    }
}
