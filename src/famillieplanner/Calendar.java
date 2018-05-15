
package famillieplanner;


import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*;
import java.util.*;

import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Calendar extends JFrame {
  String[] years = { "2018", "2019", "2020" };

  JComboBox comboBox = new JComboBox(years);

  String[] months = { "January", "February", "March", "April", "May", "June", "July", "August",
      "September", "October", "November", "December" };

  JList list = new JList(months);

  JScrollPane scrollPane = new JScrollPane(list);

  CalendarModel model = new CalendarModel();

  JTable table = new JTable(model);
  
  int row;
  int column;
  User2 user;
  ArrayList<User2> users;
  ArrayList<Event> events;
  ArrayList<Groep> groepen;

  public Calendar(User2 user,ArrayList<Event> events,ArrayList<User2> users,ArrayList<Groep>groepen) {
    //super();
    this.user=user;
    this.events=events;
    this.users=users;
    this.groepen=groepen;
    
    initComponents();
    setResizable(false); 
    
    getContentPane().setLayout(null);
    comboBox.setBounds(10, 20, 90, 30);
    comboBox.setSelectedIndex(0);
    comboBox.addItemListener(new ComboHandler());
    scrollPane.setBounds(10, 50, 90, 210);
    list.setSelectedIndex(3);
    list.addListSelectionListener(new ListHandler());
    table.setBounds(110, 50, 550, 110);
    model.setMonth(comboBox.getSelectedIndex() + 2018, list.getSelectedIndex());
    getContentPane().add(comboBox);
    getContentPane().add(scrollPane);
    table.setGridColor(Color.black);
    table.setShowGrid(true);
    getContentPane().add(table);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setSize(670, 290);
    table.repaint();
    
        
    table.setColumnSelectionAllowed(true);
    table.setRowSelectionAllowed(true);
    jButton1.setVisible(true);
    jButton2.setVisible(true);
 
  }

  public static void main(String[] args) {
    //Calendar app = new Calendar();
  }
  public class ComboHandler implements ItemListener {
    public void itemStateChanged(ItemEvent e) {
      model.setMonth(comboBox.getSelectedIndex() + 2018, list.getSelectedIndex());
      table.repaint();
    }
  }

  public class ListHandler implements ListSelectionListener {
    public void valueChanged(ListSelectionEvent e) {
      model.setMonth(comboBox.getSelectedIndex() + 2018, list.getSelectedIndex());
      table.repaint();
    }
  }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Nieuw");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jButton2.setText("Bekijk event");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jButton3.setText("terug");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agenda");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 681, 40));

        jButton4.setText("Toon");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 430, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famillieplanner/java9.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        row = table.getSelectedRow();
        column = table.getSelectedColumn();
        String dag = table.getValueAt(row, column).toString();
        String jaar = comboBox.getSelectedItem().toString();
        String maand = list.getSelectedValue().toString();
        
        JFrame event = new CalendarEvent(table, dag, events, jaar, maand, users, user);
        event.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       row = table.getSelectedRow();
       column = table.getSelectedColumn();
       String jaar = comboBox.getSelectedItem().toString();
       String maand = list.getSelectedValue().toString();
       String dag = table.getValueAt(row, column).toString();
       JFrame toonEvents = new toonEvents(events, dag, maand, jaar);
       toonEvents.setVisible(true);
       
       
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFrame groepframe = new GroepFrame(users, user, groepen);
        dispose();
        groepframe.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        comboBox.setOpaque(true);
        jButton4.setVisible(false);
        JOptionPane.showMessageDialog(this, "Selecteer een datum", "Famillieplanner", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("pictures/agenda.png"));
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
