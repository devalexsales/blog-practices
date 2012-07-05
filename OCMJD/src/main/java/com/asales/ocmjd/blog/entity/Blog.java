package com.asales.ocmjd.blog.entity;

import java.util.Date;

/**
 * Blog where people put their ideas
 * 
 * @author asales
 *
 */
public class Blog {
	private long id;
	private String label;
	private String content;
	private Comment[] comments;
	private Date updateTime;
}
