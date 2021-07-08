package com.fa993.api;

import com.fa993.core.State;
import com.fa993.core.TransactionResult;

public interface TransmitterConnection {

    /**
     *
     * @param serverURL The server to be sent to
     * @param state the state that must be sent
     * @return the {@link TransactionResult} which represents the result of this operation
     */
    public TransactionResult send(String serverURL, State state);

}
