package school.lesson5.task3;

import java.math.BigDecimal;

public class Accounting {

    private Long aLong;
    private Integer aInteger;
    private Float aFloat;
    private Double aDouble;
    private BigDecimal bigDecimal;

    public Accounting(Long aLong, Integer aInteger) {
        if (aLong != null && aInteger != null) {
            this.aLong = aLong;
            this.aInteger = aInteger;
        } else {
            this.aLong = 0L;
            this.aInteger = 0;
        }
    }

    public Accounting(Float aFloat, Double aDouble) {
        if (aFloat != null && aDouble != null) {
            this.aFloat = aFloat;
            this.aDouble = aDouble;
        } else {
            this.aFloat = 0f;
            this.aDouble = 0.0;
        }
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            this.bigDecimal = bigDecimal;
        }else {
            this.bigDecimal=new BigDecimal(0);
        }
    }

    public Long getaLong() {
        return aLong;
    }

    public void setaLong(Long aLong) {
        if (aLong != null) {
            this.aLong = aLong;
        }else {
            this.aLong=0L;
        }
    }

    public Integer getaInteger() {
        return aInteger;
    }

    public void setaInteger(Integer aInteger) {
        if (aInteger != null) {
            this.aInteger = aInteger;
        }else {
            this.aInteger=0;
        }
    }

    public Float getaFloat() {
        return aFloat;
    }

    public void setaFloat(Float aFloat) {
        if (aFloat != null) {
            this.aFloat = aFloat;
        }else {
            this.aFloat = 0f;
        }
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        if (aDouble != null) {
            this.aDouble = aDouble;
        }else {
            this.aDouble = 0.0;
        }
    }

    public Long longAddInteger() {
        return this.aLong + this.aInteger;
    }

    public Double doubleAddFloat() {
        return this.aDouble + this.aFloat;
    }

    public BigDecimal doubleAddDecimal() {
        return this.bigDecimal = new BigDecimal(aDouble.toString()).add(new BigDecimal(aFloat.toString()));
    }
}
