package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class SubDetail {

    public int sequence;
    public Revenue revenue;
    public Category category;
    public List<Modifier> modifier;
    public List<ProgramCode> programCode;
    public List<Udi> udi;
    public ProductOrService productOrService;
    public UnitPrice unitPrice;
    public double factor;
    public Net net;
    public Quantity quantity;

    public int getSequence(){return sequence;}
    public void setSequence(int sequence){this.sequence=sequence;}

    public Revenue getRevenue(){return revenue;}
    public void setRevenue(Revenue revenue){this.revenue=revenue;}

    public Category getCategory(){return category;}
    public void setCategory(Category category){this.category=category;}

    public List<Modifier> getModifier(){return modifier;}
    public void setModifier(List<Modifier> modifier){this.modifier=modifier;}

    public List<ProgramCode> getProgramCode(){return programCode;}
    public void setProgramCode(List<ProgramCode> programCode){this.programCode=programCode;}

    public List<Udi> getUdi(){return udi;}
    public void setUdi(List<Udi> udi){this.udi=udi;}

    public ProductOrService getProductOrService(){return productOrService;}
    public void setProductOrService(ProductOrService productOrService){this.productOrService=productOrService;}

    public UnitPrice getUnitPrice(){return unitPrice;}
    public void setUnitPrice(UnitPrice unitPrice){this.unitPrice=unitPrice;}

    public double getFactor(){return factor;}
    public void setFactor(double factor){this.factor=factor;}

    public Net getNet(){return net;}
    public void setNet(Net net){this.net=net;}

    public Quantity getQuantity(){return quantity;}
    public void setQuantity(Quantity quantity){this.quantity=quantity;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
