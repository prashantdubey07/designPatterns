package com.prashant.structural.bridge.shape2;

import java.util.List;

public class HTMLFormatter implements Formatter {

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder sb = new StringBuilder();
		sb.append("<table>").append("<th>").append("classification").append("</th>");
		sb.append("<th>").append(header).append("</th>");
		for (Detail detail: details) {
			sb.append("<tr><td>").append(detail.getLabel()).append("</td>");
			sb.append("<td>").append(detail.getValue()).append("/<tr></td>");
		}
		sb.append("</table>");
		return sb.toString();
	} 

}
