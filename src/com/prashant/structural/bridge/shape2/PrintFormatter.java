package com.prashant.structural.bridge.shape2;

import java.util.List;

public class PrintFormatter implements Formatter {

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder sb = new StringBuilder("");
		sb.append(header).append("\n");
		for (Detail detail: details) {
			sb.append(detail.getLabel()).append("\n");
			sb.append(detail.getValue()).append("\n");
		}
		return sb.toString();
	}

}
