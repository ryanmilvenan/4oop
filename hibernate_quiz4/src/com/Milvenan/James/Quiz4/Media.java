package com.Milvenan.James.Quiz4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Media")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Media implements Comparable<Media>
{
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="ID")
	private int mediaId;
	
	@Column(name="TITLE")
    protected String title;
	public String getTitle()  { return title; }
}
