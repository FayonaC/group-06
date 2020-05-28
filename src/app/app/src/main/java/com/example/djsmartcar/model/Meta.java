package com.example.djsmartcar.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Represents meta data from the Audio Analysis from the Spotify Web API.
 */
public class Meta {

    @SerializedName("analyzer_version")
    @Expose
    private String analyzerVersion;
    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("detailed_status")
    @Expose
    private String detailedStatus;
    @SerializedName("status_code")
    @Expose
    private Integer statusCode;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("analysis_time")
    @Expose
    private Double analysisTime;
    @SerializedName("input_process")
    @Expose
    private String inputProcess;

    public String getAnalyzerVersion() {
        return analyzerVersion;
    }

    public void setAnalyzerVersion(String analyzerVersion) {
        this.analyzerVersion = analyzerVersion;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDetailedStatus() {
        return detailedStatus;
    }

    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Double getAnalysisTime() {
        return analysisTime;
    }

    public void setAnalysisTime(Double analysisTime) {
        this.analysisTime = analysisTime;
    }

    public String getInputProcess() {
        return inputProcess;
    }

    public void setInputProcess(String inputProcess) {
        this.inputProcess = inputProcess;
    }
}