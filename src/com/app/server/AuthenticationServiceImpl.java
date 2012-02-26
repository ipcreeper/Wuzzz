package com.app.server;

import com.app.client.service.AuthenticationService;
import com.app.shared.entity.User;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * @author Roman Vlasenko
 *         Date: 18.02.12 21:32
 */
public class AuthenticationServiceImpl extends RemoteServiceServlet implements AuthenticationService {
    @Override
    public User getCredentials() {
        return new User();
    }
}
