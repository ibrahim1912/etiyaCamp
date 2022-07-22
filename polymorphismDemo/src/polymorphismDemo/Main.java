package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		BaseLogger[] loggers = new BaseLogger[] {
				new DatabaseLogger(),
				new EmailLogger()
		};
		
		for (BaseLogger logger : loggers) {
			logger.log("Log mesaji");
		}

		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
