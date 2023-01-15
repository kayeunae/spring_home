package com.myshop.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.myshop.constant.ItemSellStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="item")
@Getter
@Setter
@ToString
public class Item {
	
	private Long id;
	private String itemNm;
	private int price;
	private int stockNumber;
	private ItemSellStatus itemSellStatus;
	private LocalDateTime regTime;
	private LocalDateTime updateTime;
}
