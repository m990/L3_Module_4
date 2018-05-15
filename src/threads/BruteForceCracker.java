package threads;
// Below is a completed program that uses brute force to crack a 9-digit password. 
// On average, the program takes about 0.125 seconds to find the password.
// Your goal is to re-write the algorithm using Threads. Try to shorten the time it takes 
// to find the code to be as little as possible.
// Let's see who can crack the code the fastest!

// Pro-tip: Do not include the creation of the threads as part of the time. 

import java.util.Random;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class BruteForceCracker {
	static long code = (long)(new Random().nextDouble() * 1_000_000_000);
	
	static long startTime;
	static long endTime;
	static float elapsedTime;
	
	static Thread thread = new Thread();
	static Thread thread1 = new Thread();
	
	public static void main(String[] args) {
		System.out.println("Starting Brute Force Checker");
		startTime = System.currentTimeMillis();
		
		//while(!checkCode(ctr++));
		thread = new Thread(() -> checkCode());
		thread1 = new Thread(() -> checkCode1());
		
		thread.start();
		thread1.start();
		
		while (thread.isAlive() && thread1.isAlive());
		
		endTime = System.currentTimeMillis();
		elapsedTime = (float)(endTime - startTime);
		elapsedTime /= 1000.f;
		System.out.println("Total time taken: " + elapsedTime + " seconds");
	}
	
	public static void checkCode(){
		int ctr1 = 0;
		if(ctr1 == code){
			
		}
		ctr1+=2;
	}
	public static void checkCode1(){
		int ctr1 = 1;
		if(ctr1 == code){
			
		}
		ctr1+=2;
	}
}