/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.vir.server.ui;

import com.app.vir.server.connection.ConnectionServer;
import com.app.vir.util.HostDetailsUtil;
import com.app.vir.util.PropertiesUtil;
import com.app.vir.util.ServerConstants;
import java.io.File;
import java.util.Properties;
import javax.swing.DefaultListModel;

/**
 *
 * @author Arun
 */
public class AppVirServerJFrame extends javax.swing.JFrame {

    private String serverPort = null;
    
    private static String serverAppsPath = null;
    
    private ConnectionServer connServer = null;
    
    private static String appListString = null;
    /**
     * Creates new form AppVirServerJFrame
     */
    public AppVirServerJFrame() {
        initComponents();
        loadServerConfigs();
        refreshAppList();
        initServerListenPort();
    }

    private void loadServerConfigs() {
        Properties prop = PropertiesUtil.getProperty(ServerConstants.SERVER_CONFIG_FILE_NAME);
        System.out.println ("Server Port loaded : " + prop.getProperty(ServerConstants.SERVER_PORT_PROP));
        serverPort = prop.getProperty(ServerConstants.SERVER_PORT_PROP);
        serverAppsPath = prop.getProperty(ServerConstants.SERVER_APP_PATH_PROP);
    }
    
    public static String getServerAppsPath() {
        return serverAppsPath;
    }
    
    private void initServerListenPort () {
        connServer = new ConnectionServer();
        connServer.startServer(Integer.parseInt(serverPort.trim()));
        connServer.listenToClients();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jServerAppList = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jClientInfoTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jRefreshAppsMenuItem = new javax.swing.JMenuItem();
        jExitServerMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jConfigurePortMenuItem = new javax.swing.JMenuItem();
        jReconfigureMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jServerAboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Application Virtualization Server");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel1.setText("  Server Information");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jScrollPane1.setViewportView(jServerAppList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))))
        );

        jTabbedPane2.addTab("Available Applications", jPanel1);

        jClientInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Client IP", "Application Used", "Usage Time", "Client OS"
            }
        ));
        jScrollPane3.setViewportView(jClientInfoTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Client Information", jPanel3);

        jMenu1.setText("Virtualization Server");

        jRefreshAppsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        jRefreshAppsMenuItem.setText("Refresh Client Info");
        jRefreshAppsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRefreshAppsMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(jRefreshAppsMenuItem);

        jExitServerMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, 0));
        jExitServerMenuItem.setText("Exit Server");
        jExitServerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitServerMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(jExitServerMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Configuration");

        jConfigurePortMenuItem.setText("Configure Server");
        jConfigurePortMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfigurePortMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(jConfigurePortMenuItem);

        jReconfigureMenuItem.setText("Reload Server Settings");
        jReconfigureMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReconfigureMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(jReconfigureMenuItem);
        jReconfigureMenuItem.getAccessibleContext().setAccessibleName("jResetServerMenuItem");

        jMenuBar1.add(jMenu3);

        jMenu2.setText("About");

        jServerAboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jServerAboutMenuItem.setText("Help");
        jServerAboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jServerAboutMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(jServerAboutMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("ServerTabbedPane");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jExitServerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitServerMenuItemActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_jExitServerMenuItemActionPerformed

    private void jServerAboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jServerAboutMenuItemActionPerformed
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppVirAboutJFrame().setVisible(true);
            }
        });
    }//GEN-LAST:event_jServerAboutMenuItemActionPerformed

    private void jRefreshAppsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRefreshAppsMenuItemActionPerformed
         refreshAppList();
    }//GEN-LAST:event_jRefreshAppsMenuItemActionPerformed

    private void jConfigurePortMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfigurePortMenuItemActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppVirServerConfigJFrame().setVisible(true);
            }
        });
    }//GEN-LAST:event_jConfigurePortMenuItemActionPerformed

    private void jReconfigureMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReconfigureMenuItemActionPerformed
        loadServerConfigs();
        if (connServer != null) {
            connServer.closeServerSocket();
        }
        initServerListenPort();
        refreshAppList();
    }//GEN-LAST:event_jReconfigureMenuItemActionPerformed

    private void refreshAppList () {
        /*String appPath = null;
        if (HostDetailsUtil.isWindows()) {
            System.out.println("Windows system employed for running server");
            appPath = ServerConstants.WINDOWS_SERVER_PATH;
        } else if (HostDetailsUtil.isLinux() || HostDetailsUtil.isMac() || HostDetailsUtil.isSolaris()) {
            System.out.println("Linux server running");
            appPath = ServerConstants.LINUX_SERVER_PATH;
        } else {
            System.out.println("No OS info, defaulting to windows");
            appPath = ServerConstants.WINDOWS_SERVER_PATH;
        }*/
        
        File[] files = new File(serverAppsPath).listFiles();
        
        DefaultListModel model = new DefaultListModel(); 
        jServerAppList.setModel(model);  
        
        StringBuffer sb = new StringBuffer();
        for (File file : files) {
            if (file.isFile()) {
                String fileStr = file.getName();
                sb.append(fileStr);
                sb.append("#");
                System.out.println(fileStr + " getting added to the list");
                model.addElement(fileStr);
            }
        }
        appListString = sb.toString();
    }
    
    public static String getAppListString() {
        return appListString;
    }
    
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
            java.util.logging.Logger.getLogger(AppVirServerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppVirServerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppVirServerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppVirServerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AppVirServerJFrame avsjf = new AppVirServerJFrame();
                avsjf.setVisible(true);
                avsjf.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jClientInfoTable;
    private javax.swing.JMenuItem jConfigurePortMenuItem;
    private javax.swing.JMenuItem jExitServerMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem jReconfigureMenuItem;
    private javax.swing.JMenuItem jRefreshAppsMenuItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem jServerAboutMenuItem;
    private javax.swing.JList jServerAppList;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
/* EOF */