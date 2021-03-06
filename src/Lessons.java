import java.io.*;
import java.util.*;

public class Lessons
{
    private int code;
    private String name;
    private String Class;
    private int[] hoursA;
    private int[] hoursB;
    private int[] hoursC;
    public static ArrayList<Lessons> lessons = new ArrayList<Lessons>();
    private int section;
    private int remaining_hours;


	public Lessons() {}

    public Lessons(int code,String name,String Class, int[] hoursA,int[] hoursB,int[] hoursC, int section)
    {
        this.code=code;
        this.name=name;
        this.Class=Class;
        this.hoursA=hoursA;
        this.hoursB=hoursB;
        this.hoursC=hoursC;
        this.section = section;
        if(Class.equalsIgnoreCase("A")) this.remaining_hours = hoursA[0];
        else if(Class.equalsIgnoreCase("B")) this.remaining_hours = hoursB[0];
        else this.remaining_hours = hoursC[0];
    }

    
    public int getRemaining_hours() {
		return remaining_hours;
	}
	public void setHoursA(int hours, int index){
		this.hoursA[index] = hours;
	}
	public void setHoursB(int hours, int index){
		this.hoursB[index] = hours;
	}
	public void setHoursC(int hours, int index){
		this.hoursC[index] = hours;
	}

    public int getSection() {
		return section;
	}
    

	public ArrayList<String> find_Aclass_lessons() { // find the lessons of the 1st class
    	ArrayList<String> a = new ArrayList<String>();
    	for(Lessons l: lessons) {
    		if(l.getgymnasiumClass().equalsIgnoreCase("A")) 	a.add(l.getName());	}
    	return a;
    }
	
    public ArrayList<String> find_Bclass_lessons() { // find the lessons of the 2nd class
    	ArrayList<String> a = new ArrayList<String>();
    	for(Lessons l: lessons) {
    		if(l.getgymnasiumClass().equalsIgnoreCase("B")) 	a.add(l.getName());	}
    	return a;
    }
    public  ArrayList<String> find_Cclass_lessons() { // find the lessons of the 3rd class
    	ArrayList<String> a = new ArrayList<String>();
    	for(Lessons l: lessons) {
    		if(l.getgymnasiumClass().equalsIgnoreCase("C")) 	a.add(l.getName());	}
    	return a;
    }
    public static Lessons getLessonThroughCode(int code, int section, String cl) { // finds the lesson trough the code of the lesson
		for (Lessons l : lessons)
			if (code == l.code && l.getSection()==section && l.getgymnasiumClass().equalsIgnoreCase(cl))
				return l;
		return null;
	}
    
	public String getgymnasiumClass() { // finds the class that the lesson is in correspondence to
		return Class;
	}

	public void setClass(String class1) {
		Class = class1;
	}

	public int getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public int[] getHoursA() {
		return hoursA;
	}
	public int[] getHoursB() {
		return hoursB;
	}
	public int[] getHoursC() {
		return hoursC;
	}
	public ArrayList<Lessons> getLessons() {
		return lessons;
	}
	@Override
	public String toString() {
		return "Lessons [code=" + code + ", name=" + name + ", Class=" + Class + ", hoursA=" + hoursA[0] + ", hoursB="
				+ hoursB[0] + ", hoursC=" + hoursC[0] + ", section="+ section+ "]";
	}
	
}
