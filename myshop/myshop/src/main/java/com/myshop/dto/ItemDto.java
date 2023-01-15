package com.myshop.dto;

import java.time.LocalDateTime;

import com.myshop.constant.ItemSellStatus;

public class ItemDto {
	private Long id;
	private String itemNm;
	private int price;
	private String itemDetail;
	private ItemSellStatus itemSellStatus;
	private LocalDateTime regTime;
	private LocalDateTime updateTime;
}
