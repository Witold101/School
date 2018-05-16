package school.lesson5.task3;

import java.math.BigDecimal;

public class Accounting {

    private Long aLong;
    private Integer aInteger;
    private Float aFloat;
    private Double aDouble;
    private BigDecimal bigDecimal;

    public Accounting(Long aLong, Integer aInteger) {
        this.aLong = aLong;
        this.aInteger = aInteger;
    }

    public Accounting(Float aFloat, Double aDouble) {
        this.aFloat = aFloat;
        this.aDouble = aDouble;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public Long getaLong() {
        return aLong;
    }

    public void setaLong(Long aLong) {
        this.aLong = aLong;
    }

    public Integer getaInteger() {
        return aInteger;
    }

    public void setaInteger(Integer aInteger) {
        this.aInteger = aInteger;
    }

    public Float getaFloat() {
        return aFloat;
    }

    public void setaFloat(Float aFloat) {
        this.aFloat = aFloat;
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = aDouble;
    }

    public Long longAddInteger() {
        return this.aLong + this.aInteger;
    }

    public Double doubleAddFloat() {
        return this.aDouble + this.aFloat;
    }

    public BigDecimal doubleAddDecimal(){
        return this.bigDecimal=new BigDecimal(aDouble.toString()).add(new BigDecimal(aFloat.toString()));
    }
}
