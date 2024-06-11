/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Shared_Test;

import Shared.SQLiteDB;

public class SQLiteDBTest {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		SQLiteDB db = new SQLiteDB();
		
		db.readNumbers();
		db.deleteAllNumbers();
		db.readNumbers();
	}
}
