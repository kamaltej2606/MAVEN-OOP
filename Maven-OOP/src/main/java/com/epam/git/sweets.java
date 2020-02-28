package com.epam.git;
import java.util.*;

class sortByCost implements Comparator<sweets>{
	public int compare(sweets s1, sweets s2) {
		return s1.cost-s2.cost;
	}
}
class sortByWeight implements Comparator<sweets>{
	public int compare(sweets s1, sweets s2) {
		return Float.compare(s1.weight,s2.weight);
	}
}
public class sweets {
	String name;
	int cost;
	float weight;
	public sweets(String name,int cost,float weight){
		this.name=name;
		this.cost=cost;
		this.weight=weight;	
	}
}
