/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelocolas2servidores;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Vicente
 */
public class ingreso extends javax.swing.JFrame {

    /**
     * Creates new form ingreso
     */
    
    public ingreso() {
        initComponents();

    }
double [] aleatorios;
        double [] aleatoriosLlegada;
        double [] aleatoriosServicio ;
    int numeroClientes;
    int mediaLlegada;
    int mediaServicio;
    int decimales;
    boolean parametrosOk;
    private Object[][] data;
    double [] tiemposLlegada;
        double [] tiemposServicio;
        double [] horasLlegada;
        int [] canal;
        double [] tiemposInicioServicio1;
        double [] tiemposFinalizacion1;
        double [] tiemposInicioServicio2;
        double [] tiemposFinalizacion2;
        double [] tiemposEspera;
        double [] tiemposEnSistema;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ingreso de variables iniciales");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setName(""); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Numero Simulaciones");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Media entre tiempos de llegada");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setName(""); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Media tiempo de servicio");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setName(""); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Generar Aleatorios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Calcular Modelo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Aleatorios genrados por sistema");
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton1StateChanged(evt);
            }
        });
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        jRadioButton2.setText("Aleatorios generado por congruencial");
        jRadioButton2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton2StateChanged(evt);
            }
        });
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel5.setText("m");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel6.setText("a");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel7.setText("Xn");

        jLabel8.setText("Aleatorio Llegada");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel9.setText("m");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel10.setText("a");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel11.setText("Xn");

        jLabel12.setText("Aleatorio Servicio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 899, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 9, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(64, 64, 64)
                            .addComponent(jLabel4))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(170, 170, 170)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(660, 660, 660)
                            .addComponent(jButton2))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jRadioButton2)
                            .addGap(255, 255, 255)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel8))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel6)
                            .addGap(11, 11, 11)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel7)
                            .addGap(10, 10, 10)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(jLabel5)
                            .addGap(15, 15, 15)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel12))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel10)
                            .addGap(11, 11, 11)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel11)
                            .addGap(10, 10, 10)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(jLabel9)
                            .addGap(15, 15, 15)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jRadioButton1)))
                    .addGap(0, 9, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 53, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(7, 7, 7)
                    .addComponent(jButton2)
                    .addGap(23, 23, 23)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jRadioButton2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(3, 3, 3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jButton1)))
                    .addGap(3, 3, 3)
                    .addComponent(jLabel8)
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(jLabel12)
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addComponent(jRadioButton1)
                    .addGap(0, 53, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try
        {

            numeroClientes  =Integer.parseInt(jTextField3.getText().toString());
            mediaLlegada    =Integer.parseInt(jTextField1.getText().toString());
            mediaServicio   =Integer.parseInt(jTextField2.getText().toString());
            decimales = 4;
            if(decimales <= 1)
            {
                JOptionPane.showMessageDialog(null, "Cantidad de decimales debe ser mayor a uno.", "Corrija los datos. " , JOptionPane.INFORMATION_MESSAGE);

                throw new Exception();

            }

            parametrosOk = true;
        }
        catch(Exception ex)
        {
            parametrosOk= false;
            JOptionPane.showMessageDialog(null, "Debe ingresar solo números en los cuadros de texto correspondientes a las variables.", "Corrija los datos. " , JOptionPane.INFORMATION_MESSAGE);
        }

        if(parametrosOk)
        {
            data = new Object [numeroClientes][2];
            aleatoriosLlegada= new double [numeroClientes];
            aleatoriosServicio= new double [numeroClientes];
            float Xn = 0;
            float m = 0;
            float Xo = 0;
            float a = 0;

            float Xn2 = 0;
            float m2 = 0;
            float Xo2 = 0;
            float a2 = 0;
            for(int i=0; i<numeroClientes;i++)
            {
                if(jRadioButton2.isSelected() == true)
                {
                    try
                    {
                        if(i==0)
                        {
                            m = Float.parseFloat( jTextField6.getText());
                            Xo = Float.parseFloat( jTextField5.getText());
                            a = Float.parseFloat( jTextField4.getText());
                            Xn = Xo;

                            m2 = Float.parseFloat( jTextField9.getText());
                            Xo2 = Float.parseFloat( jTextField8.getText());
                            a2 = Float.parseFloat( jTextField7.getText());
                            Xn2 = Xo2;
                        }

                        Xn = (a*Xn)%m;
                        aleatoriosLlegada[i]= Xn/m;

                        data[i][0] =  aleatoriosLlegada[i];

                        Xn2 = (a2*Xn2)%m2;

                        aleatoriosServicio[i]= Xn2/m2;
                        data[i][1] =  aleatoriosServicio[i];

                    }
                    catch(Exception ex)
                    {
                        parametrosOk= false;
                        JOptionPane.showMessageDialog(null, "Debe ingresar solo números en los cuadros de texto correspondientes a las variables.", "Corrija los datos. " , JOptionPane.INFORMATION_MESSAGE);
                    }

                }
                else if(jRadioButton1.isSelected() == true)
                {
                    Random miRandom = new Random();

                    double aleatorioLlegada =miRandom.nextDouble();
                    aleatorioLlegada = 0 + (1-0) * aleatorioLlegada;
                    data[i][0] = aleatorioLlegada;

                    double aleatorioServicio=miRandom.nextDouble();
                    aleatorioServicio= 0+(1-0)*aleatorioServicio;
                    data[i][1]= aleatorioServicio;

                    aleatoriosServicio[i] = aleatorioServicio;
                    aleatoriosLlegada[i] = aleatorioLlegada;
                }

            }
            JTable tablaAleatorios = new JTable(data ,new String[] {"Aleatorio Llegada","Aleatorio Servicio"} );
            JOptionPane.showMessageDialog(null, new javax.swing.JScrollPane(tablaAleatorios),"Numeros Aleatorios",JOptionPane.INFORMATION_MESSAGE);
            jButton2.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(parametrosOk)
        {
            aleatorios = new double [numeroClientes];
            tiemposLlegada = new double [numeroClientes];
            tiemposServicio = new double [numeroClientes];
            horasLlegada= new double [numeroClientes];
            canal = new int[numeroClientes];
            tiemposInicioServicio1= new double [numeroClientes];
            tiemposFinalizacion1= new double [numeroClientes];
            tiemposInicioServicio2= new double [numeroClientes];
            tiemposFinalizacion2= new double [numeroClientes];
            tiemposEspera= new double [numeroClientes];
            tiemposEnSistema= new double [numeroClientes];

            data= new Object [numeroClientes][2];

            for(int i=0; i<numeroClientes;i++)
            {

                if(i != 0)
                {
                    if(tiemposFinalizacion1[i-1] <= tiemposInicioServicio2[i-1])
                    {
                        canal[i]  = 1;

                    }
                    else
                    {
                        canal[i] = 2;
                    }
                }
                double tiempoLlegada= (-1 * mediaLlegada) * Math.log(aleatoriosLlegada[i]);
                double tiempoServicio= (-1*mediaServicio)* Math.log(aleatoriosServicio[i]);

                tiemposLlegada[i] = tiempoLlegada;
                tiemposServicio[i] = tiempoServicio;
                if(i==0)
                {
                    canal[i] = 1;
                    horasLlegada[i] = tiemposLlegada[i];
                    tiemposInicioServicio1[i] = horasLlegada[i];
                    tiemposFinalizacion2[i] = 0;
                    tiemposInicioServicio2[i] = 0;
                    tiemposFinalizacion1[i]= horasLlegada[i]+ tiemposServicio[i];
                    tiemposEspera[i] = tiemposInicioServicio1[i] - horasLlegada[i];
                    tiemposEnSistema[i] = tiemposEspera[i] + tiemposServicio[i];

                }
                else
                {
                    horasLlegada[i] = tiemposLlegada[i] + horasLlegada[i-1];
                    if(canal[i] ==1)
                    {
                        tiemposInicioServicio2[i] =tiemposInicioServicio2[i-1];

                        tiemposInicioServicio1[i] = Math.max(horasLlegada[i],tiemposFinalizacion1[i-1]);

                        tiemposFinalizacion2[i] =tiemposFinalizacion2[i-1];
                        tiemposFinalizacion1[i] = tiemposInicioServicio1[i] + tiemposServicio[i];
                        tiemposEspera[i] = tiemposInicioServicio1[i] - horasLlegada[i];
                        tiemposEnSistema[i] = tiemposEspera[i] + tiemposServicio[i];
                    }
                    else if(canal[i] == 2)
                    {
                        tiemposInicioServicio1[i] = tiemposInicioServicio1[i-1];

                        tiemposInicioServicio2[i] = Math.max(horasLlegada[i],tiemposFinalizacion2[i-1]);

                        tiemposFinalizacion1[i] = tiemposFinalizacion1[i-1];
                        tiemposFinalizacion2[i] = tiemposInicioServicio2[i] + tiemposServicio[i];
                        tiemposEspera[i] = tiemposInicioServicio2[i] - horasLlegada[i];
                        tiemposEnSistema[i] = tiemposEspera[i] + tiemposServicio[i];
                    }

                }

            }

            Object [][] datos =  new Object[numeroClientes][13];
            for (int i = 0; i < numeroClientes; i++)
            {
                datos[i][0] = i+1;
                datos[i][1] = String.format("%."+decimales+"g%n", aleatoriosLlegada[i]);
                datos[i][2] = String.format("%."+decimales+"g%n", aleatoriosServicio[i]);
                datos[i][3] = String.format("%."+decimales+"g%n",tiemposLlegada[i] );
                datos[i][4] = String.format("%."+decimales+"g%n", tiemposServicio[i]);
                datos[i][5] = String.format("%."+decimales+"g%n", horasLlegada[i]);
                datos[i][6] = canal[i];
                datos[i][7] = String.format("%."+decimales+"g%n", tiemposInicioServicio1[i]);
                datos[i][8] = String.format("%."+decimales+"g%n", tiemposFinalizacion1[i]);
                datos[i][9] = String.format("%."+decimales+"g%n", tiemposInicioServicio2[i]);
                datos[i][10] = String.format("%."+decimales+"g%n", tiemposFinalizacion2[i]);
                datos[i][11] = String.format("%."+decimales+"g%n", tiemposEspera[i]);
                datos[i][12] = String.format("%."+decimales+"g%n", tiemposEnSistema[i]);

            }

            jButton1.setVisible(false);
            Tabla miFormTabla = new Tabla(datos);
            miFormTabla.setVisible(true);

        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton1StateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioButton1StateChanged

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        // TODO add your handling code here:

        if(jRadioButton1.isSelected())
        {
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel5.setVisible(false);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            jTextField7.setVisible(false);
            jTextField8.setVisible(false);
            jTextField9.setVisible(false);
            jRadioButton2.setSelected(false);
        }else{
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel5.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
            jLabel12.setVisible(true);
            jTextField7.setVisible(true);
            jTextField8.setVisible(true);
            jTextField9.setVisible(true);
            // jRadioButton2.setSelected(false);
        }

    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton2StateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioButton2StateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        // TODO add your handling code here:

        if(jRadioButton2.isSelected())
        {
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel5.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
            jLabel12.setVisible(true);
            jTextField7.setVisible(true);
            jTextField8.setVisible(true);
            jTextField9.setVisible(true);
            jRadioButton1.setSelected(false);
        }else{
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel5.setVisible(false);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            jTextField7.setVisible(false);
            jTextField8.setVisible(false);
            jTextField9.setVisible(false);

        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

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
            java.util.logging.Logger.getLogger(ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingreso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
