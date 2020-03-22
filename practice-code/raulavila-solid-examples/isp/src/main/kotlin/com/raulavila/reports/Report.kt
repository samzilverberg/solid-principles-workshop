package com.raulavila.reports

data class Report(val id: Int, val text: String)

class ReportDAO {

    private val reportById = mutableMapOf<Int, Report>()

    fun saveReport(report: Report) {
        reportById[report.id] = report
    }

    fun getReport(reportId: Int): Report? {
        return reportById[reportId]
    }
}
