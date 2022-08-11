package com.shivani.floorsequence.service;

import java.util.PriorityQueue;
import java.util.Collections;

public class Service {

	public void printConstructionTable(int floors[]) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());
		
		int max= floors.length;
		
		System.out.println("The order of construction is as follows");
		for(int i=0; i<floors.length;i++) {
		
			System.out.println("Day:"+(i+1));
			queue.add(floors[i]);
			
			while(!queue.isEmpty()&& queue.peek()==max) {
				
				System.out.println(queue.poll() +" ");
			max--;
			}
			System.out.println();
		}
	}
	
}
