package org.example;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {

        //final String pdf = "iReport Crie relatorios praticos e elegantes - Casa do Codigo.pdf";
         //File oldFile = new File("C:\\Users\\Jonson\\Desktop\\" + pdf);
        //PDDocument documento = PDDocument.load(oldFile);
        //documento.addPage(new PDPage());
        //documento.save("C:\\Users\\Jonson\\Documents\\pdfBox.pdf");
        //System.out.println("Pdf create");
        //documento.close();

        //recorta as pagina creando um novo documento por pagina.
       // PDDocument documento = PDDocument.load(oldFile);
        //Splitter splitter = new Splitter();
       //List<PDDocument> splitters = splitter.split(documento);
       //int num = 1;
       //for (PDDocument myDoc : splitters){
         //  myDoc.save("C:\\Users\\Jonson\\Documents\\pdfBox"+num+".pdf");
          // num++;
       //    myDoc.close();
       //}
        //System.out.println("Split create");
        final String pdf = "iReport Crie relatorios praticos e elegantes - Casa do Codigo.pdf";
        File oldFile = new File("C:\\Users\\Jonson\\Desktop\\" + pdf);

        FileInputStream fis = new FileInputStream(oldFile);
        PDDocument pdfDocumento = PDDocument.load(fis);
        System.out.println(pdfDocumento.getPages().getCount()
        );
    }
}

