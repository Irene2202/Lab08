package it.polito.tdp.extflightdelays.db;

import java.util.HashMap;
import java.util.Map;

import it.polito.tdp.extflightdelays.model.Flight;

public class TestDAO {

	public static void main(String[] args) {

		ExtFlightDelaysDAO dao = new ExtFlightDelaysDAO();

//		System.out.println(dao.loadAllAirlines());
//		System.out.println(dao.loadAllAirports());
//		System.out.println(dao.loadAllFlights().size());
		
		Map<Integer, Flight> map=new HashMap<>();
//		System.out.println(dao.getVoli(map,20));
	}

}
