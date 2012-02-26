package com.app.client.header;

import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;

/**
 * @author Roman Vlasenko
 *         Date: 18.02.12 20:51
 */
public class Header extends HorizontalPanel {

    private final HTML logo = new HTML("<img src=\"#\" class=\"logo\">");

    public Header() {
        setStyleName("header");

        logo.setStyleName("logo");
        add(logo);

    }
}
