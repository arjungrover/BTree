import oui.*;

public class Client {

	public static void main(String[] args) throws Exception {
		//will be setting base directory for the dataManager
		DataManager.basedir = args[0];
		
		//just making object of App class
		App app = new App();
	}
}
