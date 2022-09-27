import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class inserindotexto {
    public static void main(String[] args) throws IOException {

        final String pdf = "iReport.pdf";
        File oldFile = new File("C:\\Users\\Jonson\\Desktop\\" + pdf);
        FileInputStream fis = new FileInputStream(oldFile);
        PDDocument pdfDocument = null;
        try {
            pdfDocument = PDDocument.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(pdfDocument.getPages().getCount());
        PDFTextStripper pdfTextStripper = new PDFTextStripper();
        pdfTextStripper.setStartPage(2);
        pdfTextStripper.setEndPage(2);
        String docTex = pdfTextStripper.getText(pdfDocument);
        System.out.println(docTex);
    docTex.contains("Todos");
        pdfDocument.close();
        fis.close();

    }
}
