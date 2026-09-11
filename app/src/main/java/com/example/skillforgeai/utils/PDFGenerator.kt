package com.example.skillforgeai.utils

import android.content.Context
import android.graphics.pdf.PdfDocument
import java.io.File
import java.io.FileOutputStream

object PDFGenerator {

    fun createPdf(
        context: Context,
        content: String,
        fileName: String
    ): File {

        val document = PdfDocument()

        val pageInfo =
            PdfDocument.PageInfo.Builder(
                300,
                600,
                1
            ).create()

        val page =
            document.startPage(pageInfo)

        page.canvas.drawText(
            content,
            10f,
            25f,
            android.graphics.Paint()
        )

        document.finishPage(page)

        val file =
            File(
                context.filesDir,
                "$fileName.pdf"
            )

        document.writeTo(
            FileOutputStream(file)
        )

        document.close()

        return file
    }
}