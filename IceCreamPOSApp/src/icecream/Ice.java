/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package icecream;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rados
 */
public class Ice extends javax.swing.JFrame implements MouseListener {

    /**
     * Creates new form Ice
     */
    public Ice() {
        initComponents();
        
        lblChoco.addMouseListener(this);
        lblMango.addMouseListener(this);
        lblMix.addMouseListener(this);
        lblVanilla.addMouseListener(this);
        lblStrawberry.addMouseListener(this); 
        lblCocaCola.addMouseListener(this);
        lblAppleJuice.addMouseListener(this);
        lblOrangeJiuce.addMouseListener(this); 
        
        icecreamTable.setForeground(Color.YELLOW);
        icecreamTable.setBackground(Color.BLACK);
        icecreamTable.setOpaque(false); 
        icecreamTable.setFont(new Font("serif", Font.BOLD, 12)); 
    }
    
    DefaultTableModel tableModel = new DefaultTableModel();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblVanilla = new javax.swing.JLabel();
        lblChoco = new javax.swing.JLabel();
        lblMango = new javax.swing.JLabel();
        lblMix = new javax.swing.JLabel();
        lblStrawberry = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblAppleJuice = new javax.swing.JLabel();
        lblCocaCola = new javax.swing.JLabel();
        lblOrangeJiuce = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        icecreamTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtTotalSum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Icecream POS app in Java");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
        );

        jTabbedPane1.setToolTipText("ICE CREAM");
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(205, 230));

        jPanel2.setPreferredSize(new java.awt.Dimension(836, 339));

        lblVanilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icecream/vanilla.jpg"))); // NOI18N

        lblChoco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icecream/Chocolate-Ice-Cream-4 (3).jpg"))); // NOI18N

        lblMango.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icecream/mango-cream-dessert-fruit-wallpaper-preview.jpg"))); // NOI18N

        lblMix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icecream/forest-fruit-icecream.jpg"))); // NOI18N

        lblStrawberry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icecream/strawberry-ice-cream.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblChoco, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblMango, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lblMix, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(lblVanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStrawberry, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblStrawberry, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMix, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblChoco, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMango, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblVanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ICE CREAM", jPanel2);

        lblAppleJuice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icecream/rsz_apple_juice.jpg"))); // NOI18N

        lblCocaCola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icecream/rsz_coca-cola_glass_bottle_germany.jpg"))); // NOI18N

        lblOrangeJiuce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icecream/rsz_orange-juice.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(lblAppleJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblOrangeJiuce, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(511, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(lblCocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(791, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAppleJuice, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(lblOrangeJiuce, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(lblCocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("DRINK", jPanel3);

        icecreamTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Items", "Price", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(icecreamTable);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Total");

        txtTotalSum.setBackground(new java.awt.Color(0, 0, 0));
        txtTotalSum.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTotalSum.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalSum, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotalSum)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable icecreamTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAppleJuice;
    private javax.swing.JLabel lblChoco;
    private javax.swing.JLabel lblCocaCola;
    private javax.swing.JLabel lblMango;
    private javax.swing.JLabel lblMix;
    private javax.swing.JLabel lblOrangeJiuce;
    private javax.swing.JLabel lblStrawberry;
    private javax.swing.JLabel lblVanilla;
    private javax.swing.JTextField txtTotalSum;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == lblChoco)
        {
            String name = "Chocolate";
            int price = 45;
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity:"));
            int total = price * quantity;
            
            tableModel =  (DefaultTableModel)icecreamTable.getModel();
            tableModel.addRow(new Object[]
            {
                name, 
                price, 
                quantity, 
                total,
            });
            
            int totalSum = 0;
            
            for(int i = 0;i < icecreamTable.getRowCount();i++){
                totalSum = totalSum + Integer.parseInt(icecreamTable.getValueAt(i, 3).toString()); 
            }
            
            txtTotalSum.setText(Integer.toString(totalSum)); 
        }
        
        else if(e.getSource() == lblMango)
        {
            String name = "Mango";
            int price = 50;
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity:"));
            int total = price * quantity;
            
            tableModel =  (DefaultTableModel)icecreamTable.getModel();
            tableModel.addRow(new Object[]
            {
                name, 
                price, 
                quantity, 
                total,
            });
            
            int totalSum = 0;
            
            for(int i = 0;i < icecreamTable.getRowCount();i++){
                totalSum = totalSum + Integer.parseInt(icecreamTable.getValueAt(i, 3).toString()); 
            }
            
            txtTotalSum.setText(Integer.toString(totalSum)); 
        }
        
        else if(e.getSource() == lblMix)
        {
            String name = "Forest Fruit";
            int price = 60;
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity:"));
            int total = price * quantity;
            
            tableModel =  (DefaultTableModel)icecreamTable.getModel();
            tableModel.addRow(new Object[]
            {
                name, 
                price, 
                quantity, 
                total,
            });
            
            int totalSum = 0;
            
            for(int i = 0;i < icecreamTable.getRowCount();i++){
                totalSum = totalSum + Integer.parseInt(icecreamTable.getValueAt(i, 3).toString()); 
            }
            
            txtTotalSum.setText(Integer.toString(totalSum)); 
        }
        
        else if(e.getSource() == lblVanilla)
        {
            String name = "Vanilla";
            int price = 50;
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity:"));
            int total = price * quantity;
            
            tableModel =  (DefaultTableModel)icecreamTable.getModel();
            tableModel.addRow(new Object[]
            {
                name, 
                price, 
                quantity, 
                total,
            });
            
            int totalSum = 0;
            
            for(int i = 0;i < icecreamTable.getRowCount();i++){
                totalSum = totalSum + Integer.parseInt(icecreamTable.getValueAt(i, 3).toString()); 
            }
            
            txtTotalSum.setText(Integer.toString(totalSum)); 
        }
        
        else if(e.getSource() == lblStrawberry)
        {
            String name = "Strawberry";
            int price = 50;
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity:"));
            int total = price * quantity;
            
            tableModel =  (DefaultTableModel)icecreamTable.getModel();
            tableModel.addRow(new Object[]
            {
                name, 
                price, 
                quantity, 
                total,
            });
            
            int totalSum = 0;
            
            for(int i = 0;i < icecreamTable.getRowCount();i++){
                totalSum = totalSum + Integer.parseInt(icecreamTable.getValueAt(i, 3).toString()); 
            }
            
            txtTotalSum.setText(Integer.toString(totalSum)); 
        }
        
        else if(e.getSource() == lblCocaCola)
        {
            String name = "Coca Cola";
            int price = 90;
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity:"));
            int total = price * quantity;
            
            tableModel =  (DefaultTableModel)icecreamTable.getModel();
            tableModel.addRow(new Object[]
            {
                name, 
                price, 
                quantity, 
                total,
            });
            
            int totalSum = 0;
            
            for(int i = 0;i < icecreamTable.getRowCount();i++){
                totalSum = totalSum + Integer.parseInt(icecreamTable.getValueAt(i, 3).toString()); 
            }
            
            txtTotalSum.setText(Integer.toString(totalSum)); 
        }
        
        else if(e.getSource() == lblAppleJuice)
        {
            String name = "Apple juice";
            int price = 70;
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity:"));
            int total = price * quantity;
            
            tableModel =  (DefaultTableModel)icecreamTable.getModel();
            tableModel.addRow(new Object[]
            {
                name, 
                price, 
                quantity, 
                total,
            });
            
            int totalSum = 0;
            
            for(int i = 0;i < icecreamTable.getRowCount();i++){
                totalSum = totalSum + Integer.parseInt(icecreamTable.getValueAt(i, 3).toString()); 
            }
            
            txtTotalSum.setText(Integer.toString(totalSum)); 
        }
        
        else if(e.getSource() == lblOrangeJiuce)
        {
            String name = "Orange juice";
            int price = 60; 
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity:"));
            int total = price * quantity;
            
            tableModel =  (DefaultTableModel)icecreamTable.getModel();
            tableModel.addRow(new Object[]
            {
                name, 
                price, 
                quantity, 
                total,
            });
            
            int totalSum = 0;
            
            for(int i = 0;i < icecreamTable.getRowCount();i++){
                totalSum = totalSum + Integer.parseInt(icecreamTable.getValueAt(i, 3).toString()); 
            }
            
            txtTotalSum.setText(Integer.toString(totalSum)); 
        }
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
