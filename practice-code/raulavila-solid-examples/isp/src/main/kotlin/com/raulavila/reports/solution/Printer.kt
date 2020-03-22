package com.raulavila.reports.solution

class Printer(val reportReader: ReportReader) {

    fun printReport(reportId: Int) {
        val report = reportReader.getReport(reportId)!!

        println("ReportId: ${report.id}, Text: ${report.text}")
    }
}
