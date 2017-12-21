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
import Business.WorkQueue.RestauranttoCharityRequest;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Calendar;
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
public class DayWasteAnalysisJPanel extends javax.swing.JPanel {
     private JPanel userProcessContainer;
    private Network network;
    /**
     * Creates new form DayWasteAnalysisJPanel
     */
    public DayWasteAnalysisJPanel(JPanel userProcessContainer, Network network) {
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
        int[] daily_total=new int[8];
        for(int i=0;i<8;i++){
            daily_total[i]=0;
        }
         for(RestauranttoCharityRequest o: network.getCompletedCharityList()){
            if(o.getRequestDate()!=null){
                Calendar c = Calendar.getInstance();
             c.setTime(o.getRequestDate());
            int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
            if(dayOfWeek==1){
                dayOfWeek=7;
            }
            else{
                dayOfWeek-=1;
            }
             daily_total[dayOfWeek]+=o.getQuantity()*o.getRawMaterial().getMaxprice();
           
            }
        }
           for(int i=1;i<=7;i++)
        series.add(i,daily_total[i]);

           
                   int max=0;
        int max_index=0;
        for(int i=1;i<=7;i++){
            if(daily_total[i]>max){
                max=daily_total[i];
                max_index=i;
            }
        }
        
        int min=2147483647;
        int min_index=0;
        for(int i=1;i<=7;i++){
            if(daily_total[i]<min){
                min=daily_total[i];
                min_index=i;
            }
        }
        
        network.getReport().setDay_waste("The day of the week with maximum donations is "+toDayName(max_index)+"With a total donation value of "+max 
        +"\n The day of the week with minimum donations  is "+toDayName(min_index)+" with a total donation value of  "+min);
           
           
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        return dataset;
    }
    
         
               public String toDayName(int i){
             String dayName="";
             switch(i){
                 case 1: dayName="Monday";break;
                 case 2: dayName="Tuesday";break;
                 case 3: dayName="Wednesday";break;
                 case 4: dayName="Thursday";break;
                 case 5: dayName="Friday";break;
                 case 6: dayName="Saturday";break;
                 case 7: dayName="Sunday";break;
                 default:
             }
             return dayName;
         }
      
      
      
      private JFreeChart createChart(XYDataset dataset) {

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Sales by Day of the week", 
                "Day of the week", 
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

        chart.setTitle(new TextTitle("Sales by Day of the week",
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
