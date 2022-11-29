
package examen;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

/**
 *
 * @author ISAI 
 */
public class INE extends JFrame {

    private JPanel panel;
    private JTextField nombre;
    private JTextField domicilio;
    private JTextField clavedeelector;
    private JTextField anioreg;
    private JTextField noestado;
    private JTextField nolocalidad;
    private JTextField municipio;
    private JTextField vision;
    private JTextField seccion;
    private JTextField vigencia;
    private JTextField CURP;
    private JButton boton;

    public INE() {

        this.setSize(1000, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("INTRODUCCION DE DATOS");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));

        Iniciar();

    }

    private void Iniciar() {

        Panel();
        Indicaciones();
        Texto();
        BotonCrear();
        BotonAbrir();
        
    }

    private void Panel() {

        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void Indicaciones() {

        JLabel etiqueta = new JLabel("INTRODUCE LOS DATOS PARA GENERAR TU INE");
        panel.add(etiqueta);
        etiqueta.setBounds(320, 10, 1000, 30);
        etiqueta.setForeground(Color.MAGENTA);
        etiqueta.setFont(new Font("Calibri Light", Font.TYPE1_FONT, 15));
        
        

        JLabel etiqueta1 = new JLabel("NOMBRE ");
        panel.add(etiqueta1);
        etiqueta1.setBounds(50, 50, 200, 80);
        etiqueta1.setForeground(Color.GRAY);
        etiqueta1.setFont(new Font("Calibri Light", Font.PLAIN, 12));
        
        
        
        JLabel etiqueta3 = new JLabel("DOMICILIO ");
        panel.add(etiqueta3);
        etiqueta3.setBounds(300, 50, 200, 80);
        etiqueta3.setForeground(Color.GRAY);
        etiqueta3.setFont(new Font("Calibri Light", Font.PLAIN, 12));

        
        
        JLabel etiqueta4 = new JLabel("CLAVE DE ELECTOR ");
        panel.add(etiqueta4);
        etiqueta4.setBounds(550, 50, 200, 80);
        etiqueta4.setForeground(Color.GRAY);
        etiqueta4.setFont(new Font("Calibri Light", Font.PLAIN, 12));
        
        
        JLabel etiqueta11 = new JLabel("AÑO DE REGISTRO ");
        panel.add(etiqueta11);
        etiqueta11.setBounds(50, 100, 200, 80);
        etiqueta11.setForeground(Color.GRAY);
        etiqueta11.setFont(new Font("Calibri Light", Font.PLAIN, 12));
        

        JLabel etiqueta5 = new JLabel("No. ESTADO ");
        panel.add(etiqueta5);
        etiqueta5.setBounds(300, 100, 200, 80);
        etiqueta5.setForeground(Color.GRAY);
        etiqueta5.setFont(new Font("Calibri Light", Font.PLAIN, 12));
        
        JLabel etiqueta9 = new JLabel("No. LOCALIDAD ");
        panel.add(etiqueta9);
        etiqueta9.setBounds(550, 100, 200, 80);
        etiqueta9.setForeground(Color.GRAY);
        etiqueta9.setFont(new Font("Calibri Light", Font.PLAIN, 12));
        
        JLabel etiqueta10 = new JLabel("MUNICIPIO ");
        panel.add(etiqueta10);
        etiqueta10.setBounds(50, 150, 200, 80);
        etiqueta10.setForeground(Color.GRAY);
        etiqueta10.setFont(new Font("Calibri Light", Font.PLAIN, 12));

      
        JLabel etiqueta6 = new JLabel("EMISION ");
        panel.add(etiqueta6);
        etiqueta6.setBounds(300, 150, 200, 80);
        etiqueta6.setForeground(Color.GRAY);
        etiqueta6.setFont(new Font("Calibri Light", Font.PLAIN, 12));

        
        JLabel etiqueta7 = new JLabel("SECCION ");
        panel.add(etiqueta7);
        etiqueta7.setBounds(570, 150, 200, 80);
        etiqueta7.setForeground(Color.GRAY);
        etiqueta7.setFont(new Font("Calibri Light", Font.ITALIC, 12));

       
        JLabel etiqueta8 = new JLabel("VIGENCIA ");
        panel.add(etiqueta8);
        etiqueta8.setBounds(50, 200, 200, 80);
        etiqueta8.setForeground(Color.GRAY);
        etiqueta8.setFont(new Font("Calibri Light", Font.ITALIC, 12));
        
        JLabel etiqueta12 = new JLabel("CURP ");
        panel.add(etiqueta12);
        etiqueta12.setBounds(300, 200, 200, 80);
        etiqueta12.setForeground(Color.GRAY);
        etiqueta12.setFont(new Font("Calibri Light", Font.ITALIC, 12));

    }

    private void Texto() {


       
        nombre = new JTextField();
        nombre.setBounds(100, 75, 150, 20);
        panel.add(nombre);

        domicilio = new JTextField();
        domicilio.setBounds(360, 75, 150, 20);
        panel.add(domicilio);

       

        clavedeelector = new JTextField();
        clavedeelector.setBounds(650, 75, 150, 20);
        panel.add(clavedeelector);

        
        anioreg = new JTextField();
        anioreg.setBounds(140, 125, 150, 20);
        panel.add(anioreg);

        noestado = new JTextField();
        noestado.setBounds(360, 125, 150, 20);
        panel.add(noestado);

        nolocalidad = new JTextField();
        nolocalidad.setBounds(650, 125, 150, 20);
        panel.add(nolocalidad);
        
        municipio = new JTextField();
        municipio.setBounds(140, 175, 150, 20);
        panel.add(municipio);

        vision = new JTextField();
        vision.setBounds(360, 175, 150, 20);
        panel.add(vision);

        seccion = new JTextField();
        seccion.setBounds(650, 175, 150, 20);
        panel.add(seccion);
        
        vigencia = new JTextField();
        vigencia.setBounds(140, 225, 150, 20);
        panel.add(vigencia);
        
         CURP = new JTextField();
        CURP.setBounds(360, 225, 150, 20);
        panel.add(CURP);
    }

    private void BotonCrear() {
        boton = new JButton("Crear PDF");
        boton.setBounds(100, 300, 120, 40);
        boton.setForeground(java.awt.Color.black);
        boton.setFont(new java.awt.Font("Baskerville", java.awt.Font.CENTER_BASELINE, 15));
        boton.setEnabled(true);

        panel.add(boton);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                //AGREGAR RUTA DE LA IMAGEN DE LA INE (PLANTILLA)
                String imagen = "C:\\Users\\Uri\\Desktop\\Imagen1.png";
                
                try {
                    PDDocument documento = new PDDocument();
                    PDRectangle mypage = new PDRectangle(900, 600);
                    PDPage pagina = new PDPage(mypage);
                    documento.addPage(pagina);

                    PDImageXObject image = PDImageXObject.createFromFile(imagen, documento);
                    PDPageContentStream contenido = new PDPageContentStream(documento, pagina);

                    
                    contenido.drawImage(image, 10, 300, 600, 300);
                    contenido.beginText();

                    
                    contenido.setFont(PDType1Font.TIMES_BOLD, 14);
                    contenido.newLineAtOffset(230, pagina.getMediaBox().getHeight() - 130);
                    contenido.showText(domicilio.getText());
                    contenido.endText();

                    
                    contenido.beginText();
                    contenido.setFont(PDType1Font.TIMES_BOLD, 14);
                    contenido.newLineAtOffset(360, pagina.getMediaBox().getHeight() - 160);
                    contenido.showText(clavedeelector.getText());
                    contenido.endText();
                    
                    contenido.beginText();
                    contenido.setFont(PDType1Font.TIMES_BOLD, 14);
                    contenido.newLineAtOffset(260, pagina.getMediaBox().getHeight() - 185);
                    contenido.showText(CURP.getText());
                    contenido.endText();

                    contenido.beginText();
                    contenido.setFont(PDType1Font.TIMES_BOLD, 14);
                    contenido.newLineAtOffset(230, pagina.getMediaBox().getHeight() - 100);
                    contenido.showText(nombre.getText());
                    contenido.endText();

                 
                    contenido.beginText();
                    contenido.setFont(PDType1Font.TIMES_BOLD, 14);
                    contenido.newLineAtOffset(280, pagina.getMediaBox().getHeight() - 215);
                    contenido.showText(noestado.getText());
                    contenido.endText();
                    
                    contenido.beginText();
                    contenido.setFont(PDType1Font.TIMES_BOLD, 14);
                    contenido.newLineAtOffset(416, pagina.getMediaBox().getHeight() - 213);
                    contenido.showText(municipio.getText());
                    contenido.endText();

                    
                    contenido.beginText();
                    contenido.setFont(PDType1Font.TIMES_BOLD, 14);
                    contenido.newLineAtOffset(260, pagina.getMediaBox().getHeight() - 382);
                    contenido.showText(anioreg.getText());
                    contenido.endText();

                    
                    contenido.beginText();
                    contenido.setFont(PDType1Font.TIMES_BOLD, 14);
                    contenido.newLineAtOffset(295, pagina.getMediaBox().getHeight() - 241);
                    contenido.showText(nolocalidad.getText());
                    contenido.endText();

                    
                    contenido.beginText();
                    contenido.setFont(PDType1Font.TIMES_BOLD, 14);
                    contenido.newLineAtOffset(400, pagina.getMediaBox().getHeight() - 241);
                    contenido.showText(vision.getText());
                    contenido.endText();

                    
                    contenido.beginText();
                    contenido.setFont(PDType1Font.TIMES_BOLD, 15);
                    contenido.newLineAtOffset(555, pagina.getMediaBox().getHeight() - 214);
                    contenido.showText(seccion.getText());
                    contenido.endText();
                    
                    
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 14);
                    contenido.newLineAtOffset(520, pagina.getMediaBox().getHeight() - 241);                   
                    contenido.showText(vigencia.getText()); 
                    contenido.endText();

                    contenido.close();
                        
                    //RUTA DONDE SE GUARDARÁ EL ARCHIVO
                    documento.save("C:\\Users\\Uri\\Desktop\\INE.pdf");

                } catch (Exception x) {
                    System.out.println("Error: " + x.getMessage().toString());
                }

            }
        });

    }

    
    
    private void BotonAbrir() {

        boton = new JButton("Abrir PDF");
        boton.setBounds(400, 300, 120, 40);
        boton.setForeground(java.awt.Color.black);
        boton.setFont(new java.awt.Font("Baskerville", java.awt.Font.CENTER_BASELINE, 15));
        boton.setEnabled(true);

        panel.add(boton);

        ActionListener accion = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                try {
                    //RUTA DONDE SE GUARDO EL ARCHIVO
                    File path = new File("C:\\Users\\Uri\\Desktop\\INE.pdf");
                    Desktop.getDesktop().open(path);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        };

        boton.addActionListener(accion);

    }

     
    }



