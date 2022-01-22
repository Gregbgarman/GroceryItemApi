package com.example.iosgroceryapiios;

public class OuterClass {
    private String status;
    private int num_results;
    private String description;
    private String CreatedBy;
    private Result results;

    public OuterClass(String status, int num_results, String description, String CreatedBy,Result results) {
        this.status = status;
        this.num_results = num_results;
        this.description = description;
        this.CreatedBy = CreatedBy;
        this.results = results;
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

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public Result getResults() {
        return results;
    }

    public void setResults(Result results) {
        this.results = results;
    }

}
