package com.sgglabs.retail.model.doc;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "customsequence")
public class CustomSequence {
    @Id
    private String id;
    private long sequence;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getSequence() {
        return sequence;
    }

    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomSequence that = (CustomSequence) o;
        return sequence == that.sequence &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, sequence);
    }

    @Override
    public String toString() {
        return "CustomSequence{" +
                "id='" + id + '\'' +
                ", sequence=" + sequence +
                '}';
    }
}
