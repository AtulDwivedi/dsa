import java.util.*;
import java.lang.*;
import java.io.*;

class ActivitySelectionProblem
{
	public static void main (String[] args) throws java.lang.Exception{
		List<Activity> activities = new ArrayList<>();
		activities.add(new Activity(5, 9));
		activities.add(new Activity(1, 2));
		activities.add(new Activity(3, 4));
		activities.add(new Activity(0, 6));
		activities.add(new Activity(5, 7));
		activities.add(new Activity(8, 9));
		
		Collections.sort(activities);
		
		int i = 0;
		System.out.print(activities.get(i)+" ");
		for(int j = 1; j < activities.size(); j++){
			if(activities.get(j).start >= activities.get(i).finish){
				System.out.print(activities.get(j)+" ");
				i = j;
			}
		}
	}
	
	static class Activity implements Comparable<Activity>{
		
		public int start;
		public int finish;
		
		public Activity(int start, int finish){
			this.start = start;
			this.finish = finish;
		}
		
		public int compareTo(Activity activity){
			if(this.finish == activity.finish){
				return 0;
			}else if(this.finish > activity.finish){
				return 1;
			}else{
				return -1;
			}
		}
		
	public String toString(){
		return "("+start+","+finish+")";
	}
	}
}
