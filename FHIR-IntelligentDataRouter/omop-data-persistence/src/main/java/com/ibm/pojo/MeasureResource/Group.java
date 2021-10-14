package com.ibm.pojo.MeasureResource;

import com.ibm.pojo.MeasureResource.Identifier;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Group {
    public String id;
    public Code code;
    public String description;
    public List<Population> population;
    public List<Stratifier> stratifier;


    public String getId(){return id;}
    public void setId(String id){this.id=id;}

    public Code getCode(){return code;}
    public void setCode(Code code){this.code=code;}

    public List<Population> getPopulation(){return population;}
    public void setPopulation(List<Population> population){this.population=population;}

    public List<Stratifier> getStratifier(){return stratifier;}
    public void setStratifier(List<Stratifier> stratifier){this.stratifier=stratifier;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
