/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;
public class IdFactory {
	private static int carid;
	private static int empid;
	private static int garageid;
	public static String getEmpId() {
		return "EM" + empid++;
	}
	public static String getGarageId() {
		return "GA" + garageid++;
	}
	public static String getRegNr() {
		carid++;
		return "AB" + (carid%10) + (carid%5) + "4532";
	}
	
}
