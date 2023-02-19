package com.lakhan.entity;

import org.springframework.stereotype.Component;



@Component
public class Semester {

	    private int semId; // can be 1 or 2
	    private int English = 0;
	    private int Maths = 0;
	    private int Science = 0;
	    
	    
	    
		public Semester(int semId, int english, int maths, int science) {
			super();
			this.semId = semId;
			English = english;
			Maths = maths;
			Science = science;
		}


		@Override
		public String toString() {
			return "Semester [semId=" + semId + ", English=" + English + ", Maths=" + Maths + ", Science=" + Science
					+ "]";
		}
		
		
		
		public Semester() {
		
		}


		 public Semester(int semId)
		    {
		        this.semId = semId;
		    }


		public int getSemId() {
			return semId;
		}
		public void setSemId(int semId) {
			this.semId = semId;
		}
		public int getEnglish() {
			return English;
		}
		public void setEnglish(int english) {
			English = english;
		}
		public int getMaths() {
			return Maths;
		}
		public void setMaths(int maths) {
			Maths = maths;
		}
		public int getScience() {
			return Science;
		}
		public void setScience(int science) {
			Science = science;
		}
	
	    
}
