package com.lecture101.dto;

import com.lecture101.constant.Category;
import com.lecture101.constant.ItemSellStatus;
import com.lecture101.constant.LectureType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ItemSearchDto {

    private String searchDateType;

    private ItemSellStatus searchSellStatus;

    private LectureType searchTypeStatus;

    private Category searchCategory;

    private String searchBy;

    private String searchQuery = "";

}