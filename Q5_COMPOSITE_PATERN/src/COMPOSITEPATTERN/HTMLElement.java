package COMPOSITEPATTERN;



public class HTMLElement{
	 String tagName;
	 String startTag; 
	 String endTag;
	 String tagBody;
	
	public void HTMLElement(String tagName){
		this.tagName = tagName;
	
	}
	public void setEndTag(String tag) {
		this.endTag = tag;
	}
	
	public String getTagName() {
		return tagName;
	}

	public void setStartTag(String tag) {
		this.startTag = tag;
	}
	

	public void setTagBody(String tagBody){
		this.tagBody = tagBody;
	}
	public void generateHtml() {
		System.out.println(startTag+""+tagBody+""+endTag);
	
}}
