package jdbcdemo;

import java.sql.Connection;
// implemented Dependency Inversion principle low level module implemented Dependency Inversion principle and LiskovPrinciple
public interface Database {
	public Connection connect();
	public void disconnect();
}