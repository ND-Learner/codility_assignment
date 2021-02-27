package Utility;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReports {

    static ExtentTest test;
    static ExtentReports report;
    ExtentHtmlReporter htmlReporter;

    public void report_extent() {

        htmlReporter = new ExtentHtmlReporter(System.getProperty("/target") + "/test-output/testReport.html");

        report = new ExtentReports();
     //   report.attachReporter(htmlReporter);

        htmlReporter = new ExtentHtmlReporter("/target"
                + "/ExtentReport.html");
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("Extent Report");
        htmlReporter.config().setReportName("Test Report");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
    }
}
