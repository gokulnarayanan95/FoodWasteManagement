/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NetworkCoordinator;

import userinterface.SystemAdminWorkArea.*;
import Business.Ecosystem;
import Business.Network.Network;
import Business.Order.Order;
import Business.Order.OrderItem;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/**
 *
 * @author naray
 */
public class MonthlySalesAnalysisJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Network network;
    /**
     * Creates new form AnalysisJPanel
     */
    public MonthlySalesAnalysisJPanel(JPanel userProcessContainer, Network network) {
         this.userProcessContainer=userProcessContainer;
        this.network=network;

        
      initUI();
        initComponents();

       
    }
    private void initUI() {

        XYDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
       Button button= new Button();
       userProcessContainer.add(chartPanel, BorderLayout.CENTER);
       userProcessContainer.add(button);
    }
    
    
    
    
      private XYDataset createDataset() {

        XYSeries series = new XYSeries("Sales over months");
       
        
        int[] monthly_total=new int[13];
        for(int i=1;i<13;i++){
            monthly_total[i]=0;
        }
        for(Order o: network.getMoc().getOrderCatalog()){
            if(o.getDate()!=null){
                monthly_total[o.getDate().getMonth()+1]+=o.getTotalSales();
          
            }
        }

        for(int i=1;i<=12;i++){
              series.add(i,monthly_total[i]);
        }
        
                int max=0;
        int max_index=0;
        for(int i=1;i<=12;i++){
            if(monthly_total[i]>max){
                max=monthly_total[i];
                max_index=i;
            }
        }
        
        int min=2147483647;
        int min_index=0;
        for(int i=1;i<=12;i++){
            if(monthly_total[i]<min){
                min=monthly_total[i];
                min_index=i;
            }
        }
        
        network.getReport().setMonthly_sales("The month with maximum sales is "+toMonthName(max_index)+"With a total sales of "+max 
        +"\n The month with minimum sales is "+toMonthName(min_index)+" with a total sales of  "+min);
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        return dataset;
    }
    
         public String toMonthName(int i){
             String monthName="";
             switch(i){
                 case 1: monthName="January";break;
                 case 2: monthName="February";break;
                 case 3: monthName="March";break;
                 case 4: monthName="April";break;
                 case 5: monthName="May";break;
                 case 6: monthName="June";break;
                 case 7: monthName="July";break;
                 case 8: monthName="August";break;
                 case 9: monthName="September";break;
                 case 10: monthName="October";break;
                 case 11: monthName="November";break;
                 case 12: monthName="December";break;
                 default:
             }
             return monthName;
         }
      
      
      
      
      private JFreeChart createChart(XYDataset dataset) {

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Sales per month", 
                "month", 
                "Sales(€)", 
                dataset, 
                PlotOrientation.VERTICAL,
                true, 
                true, 
                false 
        );

        XYPlot plot = chart.getXYPlot();

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.white);

        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);

        chart.getLegend().setFrame(BlockBorder.NONE);

        chart.setTitle(new TextTitle("Sales per month",
                        new Font("Serif", java.awt.Font.BOLD, 18)
                )
        );

        return chart;

    }
      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents




    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
