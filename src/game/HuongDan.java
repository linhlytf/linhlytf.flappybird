/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Admin
 */
public class HuongDan extends javax.swing.JFrame {

    /**
     * Creates new form HuongDan
     */
    public HuongDan() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
       lbla.setText("<html><div style='padding:10px'><h3 style='color:#f50000;font-weight:bold'>Hướng dẫn</h3><p style='line-height:1.5em'>Dùng một phím bất kì trên bàn phím điều khiển một chú chim bay qua những cái ống. Nếu chú chim chạm vào chướng ngại vật thì trò chơi sẽ kết thúc. Mỗi khi chú chim vượt qua một cặp ống thì người chơi nhận được một điểm.</p>	"
               + "<h3 style='color:#f50000;font-weight:bold'>Thông tin trò chơi</h3><p style='line-height:1.5em'> Flappy Bird (tạm dịch là \"chú chim vỗ cánh\") là một trò chơi điện tử trên điện thoại do Nguyễn Hà Đông, một developer ở Hà Nội, Việt Nam phát triển, và do dotGEARS, một studio phát triển game quy mô nhỏ, hoạt động độc lập có trụ sở tại Việt Nam phát hành vào năm 2013. Trò chơi được trình bày theo phong cách side-scroller (phong cách game với các đối tượng được nhìn thấy ở mặt bên (side-view) và di chuyển từ cạnh trái sang cạnh phải của màn hình), trong đó người chơi điều khiển một chú chim, cố gắng vượt qua các hàng ống màu xanh lá cây mà không chạm vào chúng. Nguyễn Hà Đông tạo ra Flappy Bird trong vòng một vài ngày, sử dụng một nhân vật chú chim mà anh đã thiết kế cho một dự án trò chơi bị hủy bỏ vào năm 2012. Ban đầu, Flappy Bird được phát hành vào tháng 5 năm 2013 trên nền iOS5, sau đó nâng cấp cho hệ máy iOS6 và mới hơn vào tháng 9 năm 2013. Vào tháng 1 năm 2014, trò chơi bất ngờ trở nên nổi tiếng, đứng đầu bảng thể loạt miễn phí trên iTunes App Store của Mỹ và Trung Quốc và sau đó là trên UK App Store khi nó được mệnh danh là \"trò Angry Birds mới\". Vào cuối tháng 1, Flappy Bird là ứng dụng được tải về nhiều nhất trên App Store cũng như trên Google Play. Tuy Nhiên, Flappy Bird đã bị chỉ trích về mức độ khó của trò chơi, cũng như các cáo buộc về sao chép hình ảnh, âm thanh cũng như cách vận hành của một số trò chơi khác, cũng như tính gây nghiện của trò chơi này. Việc Flappy Bird bỗng nhiên nhảy vọt từ vị trí 1454 lên số 1 vào đầu năm 2014 chỉ trong vòng 26 ngày cũng gây nghi ngờ.\n" +
" Flappy Bird đã bị gỡ xuống trên App Store và Google Play bởi tác giả của nó vào ngày 10 tháng 2 năm 2014, do những tội lỗi của nó như tác giả cảm thấy là gây nghiện và bị lạm dụng quá mức. Độ nổi tiếng và việc gỡ xuống đột ngột của trò chơi khiến cộng đồng sôi sục, thậm chí những chiếc điện thoại đã cài sẵn Flappy Bird được rao bán trên mạng Internet với giá cao Các trò chơi tương tự Flappy Bird trở nên nổi tiếng trên iTunes App Store sau khi trò chơi này bị gỡ bỏ, và cả Apple và Google đã gỡ bỏ những trò chơi từ chợ ứng dụng vì lý do quá giống với nguyên tác. Trò chơi cũng đã được phân phối thông qua các kênh không chính thức trên nhiều nền tảng.</p>	"
               + "<h3 style='color:#f50000;font-weight:bold'>Thông Tin Sinh Viên Thực Hiện</h3>"
               + "<p style='line-height:1.5em'>Đồ Án Cơ Sở </p>"
               + "<p style='line-height:1.5em'>Hồ Duy Linh</p>"
               + "<p style='line-height:1.5em'>MSSV:1711545612</p>"
               + "<p style='line-height:1.5em'>Lớp:17DTH2A</p>"
               + "</div></html>");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbla = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Flappy Bird");

        lbla.setText("jLabel2");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbla))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(348, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 499, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HuongDan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HuongDan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HuongDan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HuongDan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HuongDan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbla;
    // End of variables declaration//GEN-END:variables
}
