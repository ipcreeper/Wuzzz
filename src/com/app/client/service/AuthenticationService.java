package com.app.client.service;

import com.app.shared.entity.User;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * @author ipcreeper
 *         Date: 18.02.12 21:16
 */
@RemoteServiceRelativePath("auth")
public interface AuthenticationService extends RemoteService {
    User getCredentials();
}
