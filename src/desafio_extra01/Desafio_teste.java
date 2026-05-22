package desafio_extra01;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Desafio_teste extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Desafio_teste.class.getName());

    public Desafio_teste() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanelInicial = new javax.swing.JPanel();
        jLabelImagemCentral = new javax.swing.JLabel();
        jMenuBarTeste = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemPrimeiro = new javax.swing.JMenuItem();
        jMenuItemSegundo = new javax.swing.JMenuItem();
        jMenuNada = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desafio Extra");

        jPanelInicial.setBackground(new java.awt.Color(200, 200, 200));

        jLabelImagemCentral.setBackground(new java.awt.Color(255, 255, 255));
        jLabelImagemCentral.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelImagemCentral.setForeground(new java.awt.Color(0, 0, 0));
        jLabelImagemCentral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagemCentral.setText("TESTE");
        jLabelImagemCentral.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelInicialLayout = new javax.swing.GroupLayout(jPanelInicial);
        jPanelInicial.setLayout(jPanelInicialLayout);
        jPanelInicialLayout.setHorizontalGroup(
            jPanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicialLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabelImagemCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanelInicialLayout.setVerticalGroup(
            jPanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInicialLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabelImagemCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        jMenuArquivo.setText("Arquivo");

        jMenuItemPrimeiro.setText("Primeiro Item");
        jMenuItemPrimeiro.addActionListener(this::jMenuItemPrimeiroActionPerformed);
        jMenuArquivo.add(jMenuItemPrimeiro);

        jMenuItemSegundo.setText("Segundo Item");
        jMenuArquivo.add(jMenuItemSegundo);

        jMenuBarTeste.add(jMenuArquivo);

        jMenuNada.setText("nada");
        jMenuBarTeste.add(jMenuNada);

        setJMenuBar(jMenuBarTeste);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPrimeiroActionPerformed

        JFileChooser teste = new JFileChooser();

        int inicial = teste.showOpenDialog(null);

        if (inicial == JFileChooser.APPROVE_OPTION) {

            //Filtro
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Apenas imagem do tipo GIF / JPG/ PNG", "gif", "jpg", "png");
            teste.setAcceptAllFileFilterUsed(false);
            teste.addChoosableFileFilter(filtro);

            


            File arquivoEscolha = teste.getSelectedFile();

            String caminho = arquivoEscolha.getAbsolutePath();

            ImageIcon imagem = new ImageIcon(caminho);

            
            
            //dimensionar para o tamanho do Label...
            //imagem.setImage(imagem.getImage().getScaledInstance(jLabelImagemCentral.getWidth(), jLabelImagemCentral.getHeight(), 1));
            
            jLabelImagemCentral.setIcon(imagem);

            JOptionPane.showMessageDialog(null, "RODOU!", "FOI!", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "ERROU!", "ERROU", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_jMenuItemPrimeiroActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Desafio_teste().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabelImagemCentral;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBarTeste;
    private javax.swing.JMenuItem jMenuItemPrimeiro;
    private javax.swing.JMenuItem jMenuItemSegundo;
    private javax.swing.JMenu jMenuNada;
    private javax.swing.JPanel jPanelInicial;
    // End of variables declaration//GEN-END:variables

}
