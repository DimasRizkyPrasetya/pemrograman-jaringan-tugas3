
package praktikum1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

public class Praktikum1Controller { 
    private praktikum1 view;
    private List<Integer> list = new ArrayList<>();
    
   public Praktikum1Controller(praktikum1 view){
       this.view = view;
       
       this.view.getBtbaca().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 proses();
             }
         });
       this.view.getBtSimpan().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 save();
             }
         });
   }
   
//   private void proses(){
//       JFileChooser loadFile = view.getLoadFile();
//       StyledDocument doc = view.getTxtPane().getStyledDocument();
//       if (JFileChooser.APPROVE_OPTION == loadFile.showOpenDialog(view)){
//           InputStream inputStream = null;
//           try {
//               inputStream = new FileInputStream(loadFile.getSelectedFile());
//                 int read = inputStream.read();
//                 doc.insertString(0, "", null);
//                 while (read != -1) {
//                     list.add(read);
//                     doc.insertString(doc.getLength(), "" + read, null);
//                     System.out.println("" + read);
//                     read = inputStream.read();
//           }
//       }catch (FileNotFoundException ex) {
//               Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
//   } catch (IOException | BadLocationException ex) {
//                 Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
//}finally {
//               if(inputStream != null){
//                   try{
//                       inputStream.close();
//                   }catch (IOException ex){
//                        Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
//                   }
//               }
//           }
//       }
//   }
   
   
//   private void proses() {
//         JFileChooser loadFile = view.getLoadFile();
//         StyledDocument doc = view.getTxtPane().getStyledDocument();
//         if (JFileChooser.APPROVE_OPTION == loadFile.showOpenDialog(view)) {
//             BufferedReader reader = null;
//             try {
//                 reader = new BufferedReader(new FileReader(loadFile.getSelectedFile()));
//                 String data = null;
//                 doc.insertString(0, "", null);
//                 while ((data = reader.readLine()) != null) {
//                     doc.insertString(doc.getLength(), data, null);
//                 }
//             } catch (FileNotFoundException ex) {
//                 Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
//             } catch (IOException | BadLocationException ex) {
//                 Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
//             } finally {
//                 if (reader != null) {
//                     try {
//                         reader.close();
//                     } catch (IOException ex) {
//                         Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
//                     }
//                 }
//             }
//         }
//     } praktikum3
   
   
    private void proses() {
         JFileChooser loadFile = view.getLoadFile();
         StyledDocument doc = view.getTxtPane().getStyledDocument();
         if (JFileChooser.APPROVE_OPTION == loadFile.showOpenDialog(view)) {
             BufferedReader reader = null;
             try {
                 reader = new BufferedReader(new FileReader(loadFile.getSelectedFile()));
                 String data = null;
                 doc.insertString(0, "", null);
                 while ((data = reader.readLine()) != null) {
                     doc.insertString(doc.getLength(), data, null);
                     doc.insertString(doc.getLength(), "\n", null);
                 }
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException | BadLocationException ex) {
                 Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
             } finally {
                 if (reader != null) {
                     try {
                         reader.close();
                     } catch (IOException ex) {
                         Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }
             }
         }
     }
   
   
   
   
//   private void save() {
//         JFileChooser loadFile = view.getLoadFile();
//         if (JFileChooser.APPROVE_OPTION == loadFile.showSaveDialog(view)) {
//             OutputStream os = null;
//             try {
//                 if (!list.isEmpty()) {
//                     os = new FileOutputStream(loadFile.getSelectedFile());
//                     byte[] dt = new byte[list.size()];
//                     for (int i = 0; i < list.size(); i++) {
//                         dt[i] = list.get(i).byteValue();
//                     }
//                     os.write(dt);
//                 }
//             } catch (FileNotFoundException ex) {
//                 Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
//             } catch (IOException ex) {
//                 Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
//             } finally {
//                 if (os != null) {
//                     try {
//                         os.flush();
//                         os.close();
//                         list.clear();
//                     } catch (IOException ex) {
//                         Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
//                     }
//                 }
//             }
//         }
//     }
   
//   private void save() {
//         JFileChooser loadFile = view.getLoadFile();
//         if (JFileChooser.APPROVE_OPTION == loadFile.showSaveDialog(view)) {
//             BufferedWriter writer = null;
//             try {
//                 String contents = view.getTxtPane().getText();
//                 if (contents != null && !contents.isEmpty()) {
//                     writer = new BufferedWriter(new FileWriter(loadFile.getSelectedFile()));
//                     writer.write(contents);
//                 }
//
//             } catch (FileNotFoundException ex) {
//                 Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
//             } catch (IOException ex) {
//                 Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
//             } finally {
//                 if (writer != null) {
//                     try {
//                         writer.flush();
//                         writer.close();
//                         view.getTxtPane().setText("");
//                     } catch (IOException ex) {
//                         Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
//                     }
//                 }
//             }
//         }
//     }
//}praktikum3
    


 private void save() {
         JFileChooser loadFile = view.getLoadFile();
         if (JFileChooser.APPROVE_OPTION == loadFile.showSaveDialog(view)) {
             BufferedWriter writer = null;
             try {
                 String contents = view.getTxtPane().getText();
                 if (contents != null && !contents.isEmpty()) {
                     writer = new BufferedWriter(new FileWriter(loadFile.getSelectedFile()));
                     writer.write(contents);
                 }

             } catch (FileNotFoundException ex) {
                 Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
             } finally {
                 if (writer != null) {
                     try {
                         writer.flush();
                         writer.close();
                         list.clear();
//                        JOptionPane.showMessageDialog(null,"Berhasil");
                         view.getTxtPane().setText("");
                     } catch (IOException ex) {
                         Logger.getLogger(Praktikum1Controller.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }
             }
         }
     }
}
