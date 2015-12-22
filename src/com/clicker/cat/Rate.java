package com.clicker.cat;

public class Rate {
	Integer totalFps = 0;
	
	Integer ballFps = 0;
	Integer pillowFps = 0;
	Integer bucketFps = 0;
	Integer tentFps = 0;
	
	Integer addBall() {
		ballFps++;
		return calTotalFps();
	}
	
	Integer addPillow() {
		pillowFps+=10;
		return calTotalFps();
	}
	
	Integer addBucket() {
		bucketFps+=100;
		return calTotalFps();
	}
	
	Integer addTent() {
		tentFps+=1000;
		return calTotalFps();
	}
	
	
	private Integer calTotalFps() {
		System.out.println(ballFps + pillowFps + bucketFps + tentFps);
		totalFps = ballFps + pillowFps + bucketFps + tentFps;
		return totalFps;
	}
	
	String getTotalFps() {
		return totalFps.toString();
	}
}
