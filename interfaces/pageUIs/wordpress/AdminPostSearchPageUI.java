package pageUIs.wordpress;

public class AdminPostSearchPageUI {
	public static final String ADD_NEW_BUTTON = "css=a.page-title-action";
	public static final String SEARCH_TEXTBOX= "css=#post-search-input"; 
	public static final String SEARCH_POSTS_BUTTON="css=#search-submit";
	public static final String TABLE_HEADER_INDEX_BY_HEADER_NAME = "xpath=//table[contains(@class, 'table-view-list posts')]//th[@id='%s']/preceding-sibling::*";
	public static final String TABLE_ROW_VALUE_BY_HEADER_INDEX = "xpath=//table[contains(@class, 'table-view-list posts')]/tbody/tr/*[%s]";
}
