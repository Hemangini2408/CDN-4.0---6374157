public class Logger {
		    private static Logger instance_created;
		    
		    private Logger() {
		        
		    }

		    public static Logger getInstance() {
		        if (instance_created == null) {
		            synchronized (Logger.class) {
		                if (instance_created == null) {
		                    instance_created = new Logger();
		                }
		            }
		        }
		        return instance_created;
		    }
		    
		    public void log(String message) {
		        System.out.println("Log: " + message);
		    }
}
