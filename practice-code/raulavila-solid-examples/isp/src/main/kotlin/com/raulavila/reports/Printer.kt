package com.raulavila.reports

class Printer(val reportDAO: ReportDAO) {

    fun printReport(reportId: Int) {
        val report = reportDAO.getReport(reportId)!!

        println("ReportId: ${report.id}, Text: ${report.text}")
    }
}
