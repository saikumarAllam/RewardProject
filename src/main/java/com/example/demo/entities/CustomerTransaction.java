package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "customertransaction")
public class CustomerTransaction  {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String customer_id;
	private double transacation_amount;
	private Date transacation_date;
	private int rewards_points;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public double getTransacation_amount() {
		return transacation_amount;
	}

	public void setTransacation_amount(double transacation_amount) {
		this.transacation_amount = transacation_amount;
	}

	public Date getTransacation_date() {
		return transacation_date;
	}

	public void setTransacation_date(Date transacation_date) {
		this.transacation_date = transacation_date;
	}

	public int getRewards_points() {
		return rewards_points;
	}

	public void setRewards_points(int rewards_points) {
		this.rewards_points = rewards_points;
	}

	@Override
	public String toString() {
		return "CustomerTransaction [customer_id=" + customer_id + ", transacation_amount=" + transacation_amount
				+ ", transacation_date=" + transacation_date + ", rewards_points=" + rewards_points + "]";
	}

}
