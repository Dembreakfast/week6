package com.example.nyt;


import java.util.ArrayList;

public class Everything
    {
        private String copyright;

        private ArrayList<Results> results;

        private String num_results;

        private String status;

        public String getCopyright ()
        {
            return copyright;
        }

        public void setCopyright (String copyright)
        {
            this.copyright = copyright;
        }


        public String getNum_results ()
        {
            return num_results;
        }

        public void setNum_results (String num_results)
        {
            this.num_results = num_results;
        }

        public String getStatus ()
        {
            return status;
        }

        public void setStatus (String status)
        {
            this.status = status;
        }

        public void setResults(ArrayList<Results> results) {
            this.results = results;
        }

        public ArrayList<Results> getResults() {
            return results;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [copyright = "+copyright+", results = "+results+", num_results = "+num_results+", status = "+status+"]";
        }
    }

