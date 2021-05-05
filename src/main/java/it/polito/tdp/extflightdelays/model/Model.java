package it.polito.tdp.extflightdelays.model;

import java.util.HashMap;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.extflightdelays.db.ExtFlightDelaysDAO;

public class Model {
	
	private Graph<Airport, DefaultWeightedEdge> grafo;
	private Map<Integer, Airport> idMapAirport;
	private Map<Integer, Flight> idMapFlight;
	private ExtFlightDelaysDAO dao;
	
	public Model() {
		dao=new ExtFlightDelaysDAO();
		idMapAirport=new HashMap<>();
		idMapFlight=new HashMap<>();
	}
	
	public Graph<Airport, DefaultWeightedEdge> creaGrafo(int distance) {
		grafo=new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
		
		dao.allAirport(idMapAirport);
		//System.out.println(idMapAirport);
		Graphs.addAllVertices(grafo, idMapAirport.values());
		
		for(Adiacenza a: dao.getVoli()) {
			if(a.getDistance()>=distance)
				Graphs.addEdge(this.grafo, idMapAirport.get(a.getId1()),idMapAirport.get(a.getId2()) , a.getDistance());
		}
		
		return this.grafo;
	}

}
