package com.asales.ocmjd.blog.entity;

import java.util.Date;

import com.asales.ocmjd.account.entity.Person;

/**
 * People put their comments to the blog.
 * 
 * @author asales
 *
 */
public class Comment {
	private long id;
	private Person account;
	private String comment;
	private Date time;
}
