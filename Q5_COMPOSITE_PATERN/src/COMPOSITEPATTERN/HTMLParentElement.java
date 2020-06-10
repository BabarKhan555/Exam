package COMPOSITEPATTERN;

import java.util.ArrayList;
import java.util.List;

public class HTMLParentElement {
	String tagName;
	String startTag;
	String endTag;
	private List<HTMLTag>children;
	
	
	public HTMLParentElement(String tagName){
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.children = new ArrayList<>();
		
	}
	public String getTagName() {
		return tagName;
	}

	public void setStartTag(String tag) {
		this.startTag = tag;
	}

	public void setEndTag(String tag) {
		this.endTag = tag;
	}

	public void addChildTag(HTMLTag htmlTag){
		children.add(htmlTag);
	}
	
	public void removeChildTag(HTMLTag htmlTag){
		children.remove(htmlTag);
	}

	

	public void generateHtml() {
		System.out.println(startTag);
		for(HTMLTag tag : children){
			tag.generateHtml();
		}
		System.out.println(endTag);
		
	}

}
