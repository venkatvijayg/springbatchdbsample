package com.mkyong.model;

import java.math.BigDecimal;
import java.util.Date;

public class Report {
	
	private int seq_id;
	private int batch_id;
	private int wban_no;
	private int mrs_no;
	private int doc_no;
	private String doc_dt;
	private BigDecimal amount;
	private String free_txt;
	private String process_flag;
	private Date create_dt;
	private Date last_upd_dt;

	public int getSeq_id() {
		return seq_id;
	}

	public int getBatch_id() {
		return batch_id;
	}

	public int getWban_no() {
		return wban_no;
	}

	public int getMrs_no() {
		return mrs_no;
	}

	public int getDoc_no() {
		return doc_no;
	}

	public String getDoc_dt() {
		return doc_dt;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public String getFree_txt() {
		return free_txt;
	}

	public String getProcess_flag() {
		return process_flag;
	}

	public Date getCreate_dt() {
		return create_dt;
	}

	public Date getLast_upd_dt() {
		return last_upd_dt;
	}

	public void setSeq_id(int seq_id) {
		this.seq_id = seq_id;
	}

	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}

	public void setWban_no(int wban_no) {
		this.wban_no = wban_no;
	}

	public void setMrs_no(int mrs_no) {
		this.mrs_no = mrs_no;
	}

	public void setDoc_no(int doc_no) {
		this.doc_no = doc_no;
	}

	public void setDoc_dt(String doc_dt) {
		this.doc_dt = doc_dt;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setFree_txt(String free_txt) {
		this.free_txt = free_txt;
	}

	public void setProcess_flag(String process_flag) {
		this.process_flag = process_flag;
	}

	public void setCreate_dt(Date create_dt) {
		this.create_dt = create_dt;
	}

	public void setLast_upd_dt(Date last_upd_dt) {
		this.last_upd_dt = last_upd_dt;
	}

}
