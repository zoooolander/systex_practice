package com.systex.hr.main;

import com.systex.hr.model.ESeason;

public class TestESeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ESeason.Spring);
		for (ESeason eSeason : ESeason.values()) {
			//name: 原始列舉名稱
			//ordinal: 數值
			System.out.println(eSeason.name() + " " + eSeason + " " + eSeason.ordinal());
		}
	}

}
