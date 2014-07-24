package com.test.mule.alfresco.cmis.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class ContentPropsBean
{

	String title;
	String name;
	String creator;
	String description;

	public String getTitle()
	{
		return this.title;
	}

	public void setTitle(final String title)
	{
		this.title = title;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public String getCreator()
	{
		return this.creator;
	}

	public void setCreator(final String creator)
	{
		this.creator = creator;
	}

	public String getDescription()
	{
		return this.description;
	}

	public void setDescription(final String description)
	{
		this.description = description;
	}

}
