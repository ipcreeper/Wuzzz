package com.app.client.header;

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
