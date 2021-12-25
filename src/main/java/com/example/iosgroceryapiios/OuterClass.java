package com.example.iosgroceryapiios;

public class OuterClass {
    private String status;
    private int num_results;
    private String description;
    private Result results;
    private String CreatedBy;

    public OuterClass(String status, int num_results, String description, Result results,String CreatedBy) {
        this.status = status;
        this.num_results = num_results;
        this.description = description;
        this.results = results;
        this.CreatedBy = CreatedBy;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNum_results() {
        return num_results;
    }

    public void setNum_results(int num_results) {
        this.num_results = num_results;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Result getResults() {
        return results;
    }

    public void setResults(Result results) {
        this.results = results;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }


}
