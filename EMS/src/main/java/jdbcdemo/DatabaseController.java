package jdbcdemo;

import java.sql.Connection;
// implemented Dependency Inversion principle
public class DatabaseController {
//we program to an interface - so we can achieve loosely coupled architecture
	private Database database;
	
	public DatabaseController(Database database) {
		this.database = database;
	}
	
	public Connection connect() {
		return this.database.connect();
	}
	
	public void disconnect() {
		this.database.disconnect();
	}
}