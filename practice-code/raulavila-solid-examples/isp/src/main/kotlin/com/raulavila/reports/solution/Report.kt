package com.raulavila.reports.solution

data class Report(val id: Int, val text: String)

interface ReportReader {
    fun getReport(reportId: Int): Report?
}

interface ReportWriter {
    fun saveReport(report: Report)
}

class ReportDAO: ReportReader, ReportWriter{

    private val reportById = mutableMapOf<Int, Report>()

    override fun saveReport(report: Report) {
        reportById[report.id] = report
    }

    override fun getReport(reportId: Int): Report? {
        return reportById[reportId]
    }
}
