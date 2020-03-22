package com.raulavila.reports.solution

fun main(args: Array<String>) {

    val reportDAO = ReportDAO()
    reportDAO.saveReport(Report(1, "The Report"))

    val printer = Printer(reportDAO)

    printer.printReport(1)
}