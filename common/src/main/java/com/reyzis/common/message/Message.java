package com.reyzis.common.message;

import com.reyzis.common.bean.Source;
import com.reyzis.common.bean.Type;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Message {

    protected Type type;
    protected Source source;

    public String getCode() {
        return source.name()
                .concat("_")
                .concat(type.name());
    }
}
