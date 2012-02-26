package com.app.client.content;

import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Label;

/**
 * @author Roman Vlasenko
 *         Date: 18.02.12 21:03
 */
public class Content extends AbsolutePanel {

    public Content() {
        setStyleName("content");
        add(new Label("Content"));
    }
}
