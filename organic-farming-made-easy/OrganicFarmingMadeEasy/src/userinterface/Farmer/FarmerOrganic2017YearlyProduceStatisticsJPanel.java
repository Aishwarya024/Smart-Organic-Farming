/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;

//import Business.EcoSystem;
//import Business.Enterprise.Enterprise;
//import Business.Organization.FarmerOrganization;
//import Business.UserAccount.UserAccount;
//import java.awt.Color;
//import javax.swing.JPanel;
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartFrame;
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.CategoryPlot;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.chart.renderer.category.BarRenderer;
//import org.jfree.chart.renderer.category.StandardBarPainter;
//import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FarmerOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author aishwarya
 */
public class FarmerOrganic2017YearlyProduceStatisticsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private FarmerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    EcoSystem business;
    /**
     * Creates new form FarmerOrganicAppleProduceStatisticsJPanel
     */
    public FarmerOrganic2017YearlyProduceStatisticsJPanel(JPanel userProcessContainer, UserAccount account,
            FarmerOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.userAccount = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnShowStatistics = new javax.swing.JButton();
        trends2017PieJPanel = new javax.swing.JPanel();
        trends2017JPanel = new javax.swing.JPanel();
        btnShowStatistics1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        btnShowStatistics.setBackground(new java.awt.Color(255, 255, 255));
        btnShowStatistics.setText("Show Statistics");
        btnShowStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowStatisticsActionPerformed(evt);
            }
        });

        trends2017PieJPanel.setBackground(new java.awt.Color(102, 102, 102));
        trends2017PieJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Show Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        trends2017PieJPanel.setLayout(new javax.swing.BoxLayout(trends2017PieJPanel, javax.swing.BoxLayout.LINE_AXIS));

        trends2017JPanel.setBackground(new java.awt.Color(102, 102, 102));
        trends2017JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Show Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        trends2017JPanel.setLayout(new javax.swing.BoxLayout(trends2017JPanel, javax.swing.BoxLayout.LINE_AXIS));

        btnShowStatistics1.setBackground(new java.awt.Color(255, 255, 255));
        btnShowStatistics1.setText("Show Statistics");
        btnShowStatistics1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowStatistics1ActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(47, 72, 147));

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Yearly Statistics 2017");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Helps farmer to know yearly trends");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel8)))
                .addContainerGap(646, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(trends2017JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(trends2017PieJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(btnShowStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(266, 266, 266)
                        .addComponent(btnShowStatistics1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(trends2017PieJPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trends2017JPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowStatistics1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowStatisticsActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        dcd.setValue(75, "Production", "Wheat");
        dcd.setValue(15, "Production", "Rice");
        dcd.setValue(45, "Production", "Jawar");
        dcd.setValue(60, "Production", "Bajra");
        dcd.setValue(20, "Production", "Ragi");
        
       JFreeChart jchart = ChartFactory.createBarChart("Production", "Name of Crops", "Quantity", dcd, PlotOrientation.VERTICAL, true, true, true);
        
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);

       ChartPanel chartPanel = new ChartPanel(jchart);
        
        trends2017JPanel.removeAll();
        trends2017JPanel.add(chartPanel);
        trends2017JPanel.updateUI();

    }//GEN-LAST:event_btnShowStatisticsActionPerformed

    private void btnShowStatistics1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowStatistics1ActionPerformed
        // TODO add your handling code here:
        DefaultPieDataset dcd = new DefaultPieDataset();
        dcd.setValue("Wheat", new Integer(75));
        dcd.setValue("Rice", new Integer(15));
        dcd.setValue("Jawar", new Integer(45));
        dcd.setValue("Bajra", new Integer(60));
        dcd.setValue("Ragi", new Integer(20));
        
       JFreeChart jchart = ChartFactory.createPieChart("Pie chart", dcd, true, true, true);
       PiePlot p = (PiePlot)jchart.getPlot();
       //p.setForegroundAlpha(TOP_ALIGNMENT);
       
       //ChartFrame frame = new ChartFrame("Pie chart for 2019 crop production",jchart);
       //frame.setVisible(true);
       //frame.setSize(450,500);
        
       
       //CategoryPlot plot = jchart.getCategoryPlot();
       //plot.setRangeGridlinePaint(Color.BLACK);

       ChartPanel chartPanel = new ChartPanel(jchart);
        
        trends2017PieJPanel.removeAll();
        trends2017PieJPanel.add(chartPanel);
        trends2017PieJPanel.updateUI();

    }//GEN-LAST:event_btnShowStatistics1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnShowStatistics;
    private javax.swing.JButton btnShowStatistics1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel trends2017JPanel;
    private javax.swing.JPanel trends2017PieJPanel;
    // End of variables declaration//GEN-END:variables
}