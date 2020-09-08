import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class JobSelectionProblem{
	
	public static void main (String[] args) throws java.lang.Exception{
		
		 ArrayList<Job> jobs = new ArrayList<Job>();  
		 jobs.add(new Job('a', 2, 100));  
		 jobs.add(new Job('b', 1, 19));  
		 jobs.add(new Job('c', 2, 27));  
		 jobs.add(new Job('d', 1, 25));  
		 jobs.add(new Job('e', 3, 15));
		 
		 System.out.println("Input: "+jobs);
		 Collections.sort(jobs);
		 System.out.println("Sorted Input: "+jobs);
		 
		 int t = 3;
		 char[] maxProfitJobs = new char[t];
		 boolean[] result = new boolean[t];
		 for(int i = 0; i < t; i++){
		 	result[i] = false;
		 }
		 
		 //This actual algorithm
		 for(int i = 0; i < jobs.size(); i++){
		 	for(int j = Math.min(t-1, jobs.get(i).deadline -1); j >= 0 ; j--){
		 		if(result[j] == false){
		 			result[j] = true;
		 			maxProfitJobs[j] = jobs.get(i).id;
		 			break;
		 		}
		 	}
		 }
		
		System.out.print("Maximum profit output: ");
		for(int i = 0; i < maxProfitJobs.length; i++){
			System.out.print(maxProfitJobs[i]+" ");
		}
	}
	
	static class Job implements Comparable<Job>{
		public char id;
		public int deadline;
		public int profit;
		
		public Job(char id, int deadline, int profit){
			this.id = id;
			this.deadline = deadline;
			this.profit = profit;
		}
		
		public int compareTo(Job job){
			if(this.profit == job.profit){
				return 0;
			}else if(this.profit > job.profit){
				return -1;
			}else{
				return 1;
			}
		}
		
		public String toString(){
			return "("+this.id+","+this.deadline+","+this.profit+")";
		}
	}
}
