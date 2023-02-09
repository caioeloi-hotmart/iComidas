package com.eloi.icomidas.service;

import com.eloi.icomidas.model.Client;
import com.eloi.icomidas.notifier.EmailNotifier;
import com.eloi.icomidas.notifier.Notifier;
import org.springframework.stereotype.Component;

@Component
public class ClientActivationService {
    private Notifier notifier;

    public ClientActivationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void activate(Client client){
        client.activate();
        notifier.notify(client, "Your registration is activated in the system!");
    }
}
