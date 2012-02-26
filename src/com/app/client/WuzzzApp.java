package com.app.client;

import com.app.client.content.Content;
import com.app.client.header.Header;
import com.app.client.service.AuthenticationService;
import com.app.client.service.AuthenticationServiceAsync;
import com.app.client.service.GreetingService;
import com.app.shared.entity.User;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;

public class WuzzzApp implements EntryPoint {
    private final AuthenticationServiceAsync authenticationService = GWT.create(AuthenticationService.class);

    public void onModuleLoad() {

        final Header header = new Header();
        final Content content = new Content();
        
        authenticationService.getCredentials(new AsyncCallback<User>() {
            @Override
            public void onFailure(Throwable caught) {
                //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public void onSuccess(User user) {
                RootPanel.get().add(header);
                RootPanel.get().add(content);
            }
        });

    }
}
