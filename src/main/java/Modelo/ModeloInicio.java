package Modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.dbutils.DbUtils;

import giis.demo.util.Database;
import giis.demo.util.UnexpectedException;


public class ModeloInicio {
private Database db = new Database();
	
	public void inicializarBD(){
		Database db=new Database();
		db.createDatabase(false);
	}
	
	public void cargarBD() {
		db.createDatabase(false);
		db.loadDatabase();
	}
}
