package com.altamiracorp.securegraph.inmemory;

import com.altamiracorp.securegraph.Authorizations;
import com.altamiracorp.securegraph.property.StreamingPropertyValue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class InMemoryStreamingPropertyValue extends StreamingPropertyValue {
    private byte[] data;

    InMemoryStreamingPropertyValue(byte[] data, Class valueType) throws IOException {
        super(null, valueType);
        this.data = data;
    }

    @Override
    public InputStream getInputStream(Authorizations authorizations) {
        return new ByteArrayInputStream(this.data);
    }
}