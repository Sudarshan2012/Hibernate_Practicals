package com.hibernate.demoproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//entity file, pojo file

@Entity
@Table(name="Student_Table")
public class Student 
{

    // declared the data members of the class
		@Id @Column(name="Student_ID")
		private int sid;
		@Column(name="Student_name")
		private String sname;
		@Column(name="Student_age")
		private int sage;
		
		// create the getter and setter
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public int getSage() {
			return sage;
		}
		public void setSage(int sage) {
			this.sage = sage;
		}
}
 

