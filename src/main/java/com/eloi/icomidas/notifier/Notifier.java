package com.eloi.icomidas.notifier;

import com.eloi.icomidas.model.Client;

public interface Notifier {
    void notify(Client client, String message);
}
