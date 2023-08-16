package com.reyzis.common.proccessor;

import com.reyzis.common.message.Message;

public interface MessageProcessor <T extends Message> {

    void process(String jsonMessage);

}
