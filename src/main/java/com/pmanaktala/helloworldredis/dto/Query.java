package com.pmanaktala.helloworldredis.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "a",
        "b",
        "c",
        "d",
        "e",
        "sessid",
        "a1",
        "b1",
        "c1",
        "d1",
        "e1"
})
@Generated("jsonschema2pojo")
public class Query {

    @JsonProperty("id")
    private String id;
    @JsonProperty("a")
    private String a;
    @JsonProperty("b")
    private String b;
    @JsonProperty("c")
    private String c;
    @JsonProperty("d")
    private String d;
    @JsonProperty("e")
    private String e;
    @JsonProperty("sessid")
    private String sessid;
    @JsonProperty("a1")
    private String a1;
    @JsonProperty("b1")
    private String b1;
    @JsonProperty("c1")
    private String c1;
    @JsonProperty("d1")
    private String d1;
    @JsonProperty("e1")
    private String e1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("a")
    public String getA() {
        return a;
    }

    @JsonProperty("a")
    public void setA(String a) {
        this.a = a;
    }

    @JsonProperty("b")
    public String getB() {
        return b;
    }

    @JsonProperty("b")
    public void setB(String b) {
        this.b = b;
    }

    @JsonProperty("c")
    public String getC() {
        return c;
    }

    @JsonProperty("c")
    public void setC(String c) {
        this.c = c;
    }

    @JsonProperty("d")
    public String getD() {
        return d;
    }

    @JsonProperty("d")
    public void setD(String d) {
        this.d = d;
    }

    @JsonProperty("e")
    public String getE() {
        return e;
    }

    @JsonProperty("e")
    public void setE(String e) {
        this.e = e;
    }

    @JsonProperty("sessid")
    public String getSessid() {
        return sessid;
    }

    @JsonProperty("sessid")
    public void setSessid(String sessid) {
        this.sessid = sessid;
    }

    @JsonProperty("a1")
    public String getA1() {
        return a1;
    }

    @JsonProperty("a1")
    public void setA1(String a1) {
        this.a1 = a1;
    }

    @JsonProperty("b1")
    public String getB1() {
        return b1;
    }

    @JsonProperty("b1")
    public void setB1(String b1) {
        this.b1 = b1;
    }

    @JsonProperty("c1")
    public String getC1() {
        return c1;
    }

    @JsonProperty("c1")
    public void setC1(String c1) {
        this.c1 = c1;
    }

    @JsonProperty("d1")
    public String getD1() {
        return d1;
    }

    @JsonProperty("d1")
    public void setD1(String d1) {
        this.d1 = d1;
    }

    @JsonProperty("e1")
    public String getE1() {
        return e1;
    }

    @JsonProperty("e1")
    public void setE1(String e1) {
        this.e1 = e1;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}