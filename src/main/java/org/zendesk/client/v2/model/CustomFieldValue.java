package org.zendesk.client.v2.model;

import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.zendesk.client.v2.StringArrayDeserializer;
import org.zendesk.client.v2.StringArraySerializer;

/**
 * @author stephenc
 * @since 04/04/2013 14:53
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomFieldValue implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @JsonDeserialize(using = StringArrayDeserializer.class)
    @JsonSerialize(using = StringArraySerializer.class)
    private String[] value;

    public CustomFieldValue() {
    }

    public CustomFieldValue(Long id, String[] value) {
        this.id = id;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String[] getValue() {
        return value;
    }

    public void setValue(String[] value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CustomFieldValue{" +
                "id=" + id +
                ", value=" + Arrays.toString(value) +
                '}';
    }
}
