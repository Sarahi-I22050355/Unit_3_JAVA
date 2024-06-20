/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 *
 * @author Sarah
 */
public class Frm_app extends javax.swing.JFrame {

        private String filePathCSV;
    private String filePathJSON;
    private String filePathXML;
    private String filePathTXT;

    public Frm_app() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgvTableCSV = new javax.swing.JTable();
        btnSearchCSV = new javax.swing.JButton();
        btnDeleteCSV = new javax.swing.JButton();
        txtSearchCSV = new javax.swing.JTextField();
        btnOpenCSV = new javax.swing.JButton();
        btnSaveCSV = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tvXML = new javax.swing.JTree();
        btnOpenCSV2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        textArea1 = new java.awt.TextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSearchCSV1 = new javax.swing.JTextField();
        btnSearchCSV1 = new javax.swing.JButton();
        btnSearchCSV2 = new javax.swing.JButton();
        textArea2 = new java.awt.TextArea();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tvJSON = new javax.swing.JTree();
        jLabel3 = new javax.swing.JLabel();
        btnOpenCSV1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dgvTableCSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(dgvTableCSV);

        btnSearchCSV.setText("Search");
        btnSearchCSV.setName(""); // NOI18N
        btnSearchCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCSVActionPerformed(evt);
            }
        });

        btnDeleteCSV.setText("Delete");
        btnDeleteCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCSVActionPerformed(evt);
            }
        });

        btnOpenCSV.setText("Open");
        btnOpenCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenCSVActionPerformed(evt);
            }
        });

        btnSaveCSV.setText("Save");
        btnSaveCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCSVActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("CSV Manager");

        jLabel2.setText("Text to search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearchCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearchCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOpenCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSaveCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchCSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpenCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CSV", jPanel1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("JSON Manager");

        jScrollPane3.setViewportView(tvXML);

        btnOpenCSV2.setText("Open");
        btnOpenCSV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenCSV2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpenCSV2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpenCSV2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("XML", jPanel3);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("TEXT Document");

        jLabel6.setText("Text to search");

        btnSearchCSV1.setText("Search");
        btnSearchCSV1.setName(""); // NOI18N
        btnSearchCSV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCSV1ActionPerformed(evt);
            }
        });

        btnSearchCSV2.setText("Open");
        btnSearchCSV2.setName(""); // NOI18N
        btnSearchCSV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCSV2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Result");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchCSV2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtSearchCSV1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearchCSV1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchCSV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchCSV1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnSearchCSV2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("TXT", jPanel4);

        jScrollPane2.setViewportView(tvJSON);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("JSON Manager");

        btnOpenCSV1.setText("Open");
        btnOpenCSV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenCSV1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpenCSV1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpenCSV1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("JSON", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCSVActionPerformed

                // Verificar si el archivo CSV es nulo o no existe
        if (filePathCSV == null || !new File(filePathCSV).exists()) {
            JOptionPane.showMessageDialog(null, "Select a file to work with.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Verificar si el campo de búsqueda está vacío
        if (txtSearchCSV.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "To search, you must use a NAME.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePathCSV))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");

                // Comparar el término de búsqueda con el primer campo
                if (fields.length > 0 && fields[0].equals(txtSearchCSV.getText())) {
                    JOptionPane.showMessageDialog(null, "Found: " + String.join(", ", fields), "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        } catch (IOException ex) {
            System.out.println("Error searching in the CSV file: " + ex.getMessage());
        }

        JOptionPane.showMessageDialog(null, "No matching name found in the file", "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnSearchCSVActionPerformed

    private void btnDeleteCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCSVActionPerformed

                // Verificar si se ha seleccionado un archivo
if (filePathCSV == null || filePathCSV.trim().isEmpty() || !Files.exists(Paths.get(filePathCSV))) {
    JOptionPane.showMessageDialog(null, "Select a valid file to work with.", "Attention", JOptionPane.WARNING_MESSAGE);
    return;
}

// Verificar si se ha ingresado un nombre para buscar
if (txtSearchCSV.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a name to search for.", "Attention", JOptionPane.WARNING_MESSAGE);
    return;
}

try {
    // Leer el archivo CSV línea por línea y escribir las líneas no eliminadas en un nuevo archivo temporal
    Path tempFilePath = Files.createTempFile(null, null);
    try (BufferedReader reader = new BufferedReader(new FileReader(filePathCSV));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFilePath.toFile()))) {
        String line;
        while ((line = reader.readLine()) != null) {
            // Verificar si la línea actual contiene el nombre a eliminar
            if (!line.contains(txtSearchCSV.getText())) {
                writer.write(line + System.lineSeparator());
            }
        }
    }

    // Reemplazar el archivo original con el archivo temporal
    Files.delete(Paths.get(filePathCSV));
    Files.move(tempFilePath, Paths.get(filePathCSV));
    showCSVInDGV(filePathCSV);
} catch (IOException ex) {
    JOptionPane.showMessageDialog(null, "Error deleting line from the CSV file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_btnDeleteCSVActionPerformed

    private void btnOpenCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenCSVActionPerformed

                 // Crear un nuevo objeto JFileChooser
        JFileChooser fileChooser = new JFileChooser();

        // Establecer filtro para mostrar solo archivos CSV
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files (*.csv)", "csv");
        fileChooser.setFileFilter(filter);

        // Mostrar el cuadro de diálogo para seleccionar el archivo CSV
        int returnValue = fileChooser.showOpenDialog(null);

        // Si se cancela la selección del archivo, salir del método
        if (returnValue == JFileChooser.CANCEL_OPTION) {
            return;
        }

        // Obtener la ruta del archivo seleccionado
        filePathCSV = fileChooser.getSelectedFile().getPath();

        // Llamar al método ShowCSV_InDGV() para mostrar el archivo CSV en un DataGridView
        showCSVInDGV(filePathCSV);
    }//GEN-LAST:event_btnOpenCSVActionPerformed

    private void btnSaveCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCSVActionPerformed

               // Verificar si hay datos en el JTable
if (dgvTableCSV.getRowCount() == 0) {
    JOptionPane.showMessageDialog(null, "There is no data to save.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

// Obtener la ruta del archivo CSV
String filePath = filePathCSV;

try {
    // Crear un StringBuilder para construir el contenido del archivo CSV
    StringBuilder csvContent = new StringBuilder();

    // Agregar encabezados de columna al archivo CSV
    for (int i = 0; i < dgvTableCSV.getColumnCount(); i++) {
        csvContent.append(dgvTableCSV.getColumnName(i));
        if (i < dgvTableCSV.getColumnCount() - 1) {
            csvContent.append(",");
        }
    }
    csvContent.append("\n"); // Agregar nueva línea después de los encabezados

    // Agregar datos de cada fila al archivo CSV
    for (int row = 0; row < dgvTableCSV.getRowCount(); row++) {
        boolean hasData = false; // Bandera para verificar si la fila tiene celdas no vacías
        StringBuilder rowData = new StringBuilder();

        for (int col = 0; col < dgvTableCSV.getColumnCount(); col++) {
            Object cellValue = dgvTableCSV.getValueAt(row, col);
            // Verificar si el valor de la celda no es nulo ni está vacío
            if (cellValue != null && !cellValue.toString().isEmpty()) {
                rowData.append(cellValue);
                hasData = true; // Establecer la bandera en verdadero si la celda tiene un valor no vacío
            }

            if (col < dgvTableCSV.getColumnCount() - 1) {
                rowData.append(",");
            }
        }

        // Agregar los datos de la fila al contenido del CSV si la fila tiene celdas no vacías
        if (hasData) {
            csvContent.append(rowData.toString());
            csvContent.append("\n");
        }
    }

    // Escribir el contenido en el archivo CSV
    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
    writer.write(csvContent.toString());
    writer.close();

    JOptionPane.showMessageDialog(null, "Data saved successfully to the CSV file.", "Success", JOptionPane.INFORMATION_MESSAGE);
} catch (IOException ex) {
    JOptionPane.showMessageDialog(null, "Error saving data to the CSV file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}

// Actualizar el JTable después de guardar los datos en el archivo CSV
showCSVInDGV(filePathCSV);
    }//GEN-LAST:event_btnSaveCSVActionPerformed

    private void btnOpenCSV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenCSV2ActionPerformed

                // TODO add your handling code here:
    }//GEN-LAST:event_btnOpenCSV2ActionPerformed

    private void btnSearchCSV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCSV1ActionPerformed

                try {
    String palabraABuscar = txtSearchCSV1.getText().trim();
    StringBuilder resultados = new StringBuilder();

    // Leer el archivo línea por línea
    try (BufferedReader br = new BufferedReader(new FileReader(filePathTXT))) {
        String line;
        int lineNumber = 1;
        while ((line = br.readLine()) != null) {
            // Verificar si la línea contiene la palabra buscada
            if (line.contains(palabraABuscar)) {
                resultados.append("Line ").append(lineNumber).append(": ").append(line).append("\n");
            }
            lineNumber++;
        }
    }

    // Mostrar los resultados en el JTextArea
    textArea2.setText(resultados.toString());
} catch (IOException ex) {
    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_btnSearchCSV1ActionPerformed

    private void btnSearchCSV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCSV2ActionPerformed

        
        // Abre el cuadro de diálogo para seleccionar un archivo de texto
JFileChooser fileChooser = new JFileChooser();
fileChooser.setDialogTitle("Select a TXT file");
fileChooser.setFileFilter(new FileNameExtensionFilter("TXT Files", "txt"));
int result = fileChooser.showOpenDialog(null);

// Verifica si se ha seleccionado un archivo
if (result == JFileChooser.APPROVE_OPTION) {
    File selectedFile = fileChooser.getSelectedFile();
    filePathTXT = selectedFile.getAbsolutePath();

    // Lee el contenido del archivo de texto y lo carga en el JTextArea
    try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
        StringBuilder text = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            text.append(line).append("\n");
        }
        textArea1.setText(text.toString());
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error reading the TXT file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    }//GEN-LAST:event_btnSearchCSV2ActionPerformed

    private void btnOpenCSV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenCSV1ActionPerformed

                JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Select an JSON file");
    fileChooser.setFileFilter(new FileNameExtensionFilter("JSON Files", "json"));

    int result = fileChooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        filePathJSON = fileChooser.getSelectedFile().getAbsolutePath();
        loadJSONData();
    }
    }//GEN-LAST:event_btnOpenCSV1ActionPerformed

    private void LoadXMLData() {
    try {
        // Crear un XMLStreamReader para leer el archivo XML
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new FileReader(filePathXML));

        // Limpiar nodos previos en el JTree
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Root");
        tvXML.setModel(new DefaultTreeModel(rootNode));

        // Agregar el contenido del archivo XML al JTree
        AddXmlNode(reader, rootNode);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error loading XML data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void AddXmlNode(XMLStreamReader reader, DefaultMutableTreeNode parentNode) throws XMLStreamException {
    while (reader.hasNext()) {
        int eventType = reader.next();
        switch (eventType) {
            case XMLStreamConstants.START_ELEMENT:
                DefaultMutableTreeNode elementNode = new DefaultMutableTreeNode(reader.getLocalName());
                parentNode.add(elementNode);

                // Agregar atributos como subnodos
                for (int i = 0; i < reader.getAttributeCount(); i++) {
                    String attributeName = reader.getAttributeLocalName(i);
                    String attributeValue = reader.getAttributeValue(i);
                    elementNode.add(new DefaultMutableTreeNode("@" + attributeName + ": " + attributeValue));
                }
                break;
            case XMLStreamConstants.CHARACTERS:
                String textContent = reader.getText().trim();
                if (!textContent.isEmpty()) {
                    parentNode.add(new DefaultMutableTreeNode(textContent));
                }
                break;
            case XMLStreamConstants.END_ELEMENT:
                return; // Terminar la recursión cuando se alcanza el final del elemento
        }
    }
}
    
    public void loadJSONData() {
        try {
            // Leer el contenido del archivo JSON
            BufferedReader reader = new BufferedReader(new FileReader(filePathJSON));
            StringBuilder jsonData = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonData.append(line);
            }
            reader.close();

            // Convertir el contenido JSON a un mapa de claves y valores
            Map<String, String> jsonMap = parseJSON(jsonData.toString());

            // Limpiar nodos previos en el JTree
            DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Root");
            tvJSON.setModel(new javax.swing.tree.DefaultTreeModel(rootNode));

            // Agregar el JSON al JTree
            addNodes(jsonMap, "Root", rootNode);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error loading JSON data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private Map<String, String> parseJSON(String jsonData) {
        Map<String, String> jsonMap = new HashMap<>();
        // Dividir el JSON en líneas y procesar cada línea
        String[] lines = jsonData.split("\\r?\\n");
        for (String line : lines) {
            // Dividir la línea en clave y valor
            String[] parts = line.trim().split(":", 2);
            if (parts.length == 2) {
                // Agregar la clave y el valor al mapa
                jsonMap.put(parts[0].trim(), parts[1].trim());
            }
        }
        return jsonMap;
    }

    private void addNodes(Map<String, String> jsonMap, String nodeName, DefaultMutableTreeNode parentNode) {
        // Agregar cada par de clave-valor como subnodos
        for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(entry.getKey() + ": " + entry.getValue());
            parentNode.add(node);
        }
    }
    
    public void showCSVInDGV(String filePathCSV) {
        // Limpiar filas y columnas del JTable
DefaultTableModel model = (DefaultTableModel) dgvTableCSV.getModel();
model.setRowCount(0);
model.setColumnCount(0);

// Leer líneas del archivo CSV
try (BufferedReader br = new BufferedReader(new FileReader(filePathCSV))) {
    String line;
    // Leer la primera línea para obtener los nombres de las columnas
    if ((line = br.readLine()) != null) {
        String[] columnNames = line.split(",");
        // Agregar columnas al modelo
        for (String columnName : columnNames) {
            model.addColumn(columnName);
        }
    }

    // Agregar filas al modelo con el contenido del CSV
    while ((line = br.readLine()) != null) {
        String[] fields = line.split(",");
        model.addRow(fields);
    }
    DefaultTableModel model_ = (DefaultTableModel) dgvTableCSV.getModel();
// Agregar una fila vacía al final del modelo
model_.addRow(new Object[model.getColumnCount()]);

} catch (IOException e) {
    e.printStackTrace();
}
    }
    /**
     * @param args the command line arguments
     */
    
public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteCSV;
    private javax.swing.JButton btnOpenCSV;
    private javax.swing.JButton btnOpenCSV1;
    private javax.swing.JButton btnOpenCSV2;
    private javax.swing.JButton btnSaveCSV;
    private javax.swing.JButton btnSearchCSV;
    private javax.swing.JButton btnSearchCSV1;
    private javax.swing.JButton btnSearchCSV2;
    private javax.swing.JTable dgvTableCSV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    private javax.swing.JTree tvJSON;
    private javax.swing.JTree tvXML;
    private javax.swing.JTextField txtSearchCSV;
    private javax.swing.JTextField txtSearchCSV1;
    // End of variables declaration//GEN-END:variables
}
