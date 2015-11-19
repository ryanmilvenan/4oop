package com.Milvenan.James.Quiz4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Milvenan_DVD")
public class DVD extends Media
{
	@Column(name="YEAR")
    private int year;
	
	public DVD()
	{
		
	}
	
    public DVD(String title, int year)
    {
        this.title = title;
        this.year = year;
    }
	public int getYear() 	 { return year;  }
    public String toString()
    {
        return year + ": " + title + " [DVD]";
	}
    
    public int compareTo(Media other) {
    	//Comparing to another DVD
    	if(other instanceof DVD) {
    		//Use titles as the primary method of comparison
    		int titleComparison = this.title.compareTo(other.title);
    		//...fallback on year if the title is the same
    		if(titleComparison == 0) {
    			return Integer.compare(this.year, ((DVD)other).year);
    		} else {
    			return titleComparison;
    		}
    	} 
    	//Comparing to a Book
    	else if(other instanceof Book){
    		return -1;
    	} else {
    		//Compare titles for yet-to-be defined forms of media 
    		return this.title.compareTo(other.title);
    	}
    }
}
