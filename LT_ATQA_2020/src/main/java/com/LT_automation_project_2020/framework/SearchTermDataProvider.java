package com.LT_automation_project_2020.framework;

public class SearchTermDataProvider {

    public static Object[][] getAllSearchTerms() {
        Object[][] searchTerms = new Object[4][1];
        searchTerms[0][0] = SearchTerms.LAPTOP.getSearchTerm();
        searchTerms[1][0] = SearchTerms.TABLET.getSearchTerm();
        searchTerms[2][0] = SearchTerms.VACUUM_CLEANER.getSearchTerm();
        searchTerms[3][0] = SearchTerms.MOUSE.getSearchTerm();
        return searchTerms;
    }
}
