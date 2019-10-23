package com.example.nyt;

public class Media {

    private String subtype;


    private String type;

    private String approved_for_syndication;



    public String getSubtype ()
    {
        return subtype;
    }

    public void setSubtype (String subtype)
    {
        this.subtype = subtype;
    }


    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getApproved_for_syndication ()
    {
        return approved_for_syndication;
    }

    public void setApproved_for_syndication (String approved_for_syndication)
    {
        this.approved_for_syndication = approved_for_syndication;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [subtype = "+subtype+", type = "+type+", approved_for_syndication = "+approved_for_syndication+"]";
    }
}
