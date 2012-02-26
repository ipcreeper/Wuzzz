package com.app.client.service;

import com.app.shared.entity.User;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

public interface AuthenticationServiceAsync {
    void getCredentials(AsyncCallback<User> async);
}
