package Pojo;
// Generated Apr 25, 2017 3:44:08 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Subject generated by hbm2java
 */
public class Subject  implements java.io.Serializable {


     private String id;
     private String name;
     private Date startDate;
     private Date endDate;
     private Date startTime;
     private Date endTime;
     private String weekDate;
     private String room;
     private Set subjectUsers = new HashSet(0);

    public Subject() {
    }

	
    public Subject(String id, String name, Date startDate, Date endDate, Date startTime, Date endTime, String weekDate, String room) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.weekDate = weekDate;
        this.room = room;
    }
    public Subject(String id, String name, Date startDate, Date endDate, Date startTime, Date endTime, String weekDate, String room, Set subjectUsers) {
       this.id = id;
       this.name = name;
       this.startDate = startDate;
       this.endDate = endDate;
       this.startTime = startTime;
       this.endTime = endTime;
       this.weekDate = weekDate;
       this.room = room;
       this.subjectUsers = subjectUsers;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public Date getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    public String getWeekDate() {
        return this.weekDate;
    }
    
    public void setWeekDate(String weekDate) {
        this.weekDate = weekDate;
    }
    public String getRoom() {
        return this.room;
    }
    
    public void setRoom(String room) {
        this.room = room;
    }
    public Set getSubjectUsers() {
        return this.subjectUsers;
    }
    
    public void setSubjectUsers(Set subjectUsers) {
        this.subjectUsers = subjectUsers;
    }




}


