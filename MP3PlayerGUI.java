package AppPackage;
import java.awt.Toolkit;
import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
public class MP3PlayerGUI extends javax.swing.JFrame 
{
    int timeRun=0;
    MainClass MC=new MainClass();
    static int count;
    int xMouse;
    int yMouse;
   int width = (Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 185;
    int height = Toolkit.getDefaultToolkit().getScreenSize().height - 500;
    private String audioFilePath;
	private String lastOpenPath;
    public MP3PlayerGUI() {
         super("Java MP3 Player");
        initComponents();
        new Thread()
        {
            public void run()
            {
                  while (timeRun==0)
                {
                    Calendar cal=new GregorianCalendar();
                    int hour=cal.get(Calendar.HOUR); 
                     int min=cal.get(Calendar.MINUTE); 
                      int sec=cal.get(Calendar.SECOND); 
                       int AM_PM=cal.get(Calendar.AM_PM);
                       String day_night="";
                       if(AM_PM==1)
                       {
                           day_night="PM";
                       }
                       else
                       {
                           day_night="AM";
                       }
                       String time=hour + ":" + min + ":" + sec + " " + day_night;
                       Clock.setText(time);
                } 
            }    
        }.start(); 
        this.setIconImage(new ImageIcon(getClass().getResource("/AppPackage/Music.png")).getImage());
        this.setLocation(width, height);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Play = new javax.swing.JButton();
        Display = new javax.swing.JLabel();
        SelectFile = new javax.swing.JButton();
        Pause = new javax.swing.JButton();
        Stop = new javax.swing.JButton();
        LoopCounter = new javax.swing.JLabel();
        Loop = new javax.swing.JButton();
        Background = new javax.swing.JLabel();
        Clock = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MP3 Player");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/play.png"))); // NOI18N
        Play.setToolTipText("Play/Resume");
        Play.setEnabled(false);
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });
        getContentPane().add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 100, 100));

        Display.setBackground(new java.awt.Color(255, 102, 0));
        Display.setFont(new java.awt.Font("Liquid Crystal", 0, 17)); // NOI18N
        Display.setForeground(new java.awt.Color(51, 102, 255));
        Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Display.setToolTipText("Song Name");
        getContentPane().add(Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 20));

        SelectFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/select.png"))); // NOI18N
        SelectFile.setToolTipText("Select File");
        SelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectFileActionPerformed(evt);
            }
        });
        getContentPane().add(SelectFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 50, 50));

        Pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/pause.png"))); // NOI18N
        Pause.setToolTipText("Pause");
        Pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseActionPerformed(evt);
            }
        });
        getContentPane().add(Pause, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 70, 70));

        Stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/stop.png"))); // NOI18N
        Stop.setToolTipText("Stop");
        Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActionPerformed(evt);
            }
        });
        getContentPane().add(Stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 70, 70));

        LoopCounter.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        getContentPane().add(LoopCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 80, 20));

        Loop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/loop.png"))); // NOI18N
        Loop.setToolTipText("Repeat");
        Loop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoopActionPerformed(evt);
            }
        });
        getContentPane().add(Loop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 50, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Background.png"))); // NOI18N
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BackgroundMouseReleased(evt);
            }
        });
        Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackgroundMouseDragged(evt);
            }
        });
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 130));

        Clock.setFont(new java.awt.Font("DS-Digital", 0, 24)); // NOI18N
        Clock.setForeground(new java.awt.Color(255, 255, 0));
        Clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clock.setToolTipText("Clock");
        getContentPane().add(Clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/down.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 370, 40));

        pack();
    }// </editor-fold>                        

    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {                                        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }                                       

    private void BackgroundMouseReleased(java.awt.event.MouseEvent evt) {                                         
      xMouse=evt.getX();
        yMouse=evt.getY();
    }                                        

    private void PauseActionPerformed(java.awt.event.ActionEvent evt) {                                      
       MC.Pause();
       Play.setEnabled(true);
    }                                     

    private void SelectFileActionPerformed(java.awt.event.ActionEvent evt) {                                           
    JFileChooser chooser = null;
		
		if (lastOpenPath != null && !lastOpenPath.equals("")) {
			chooser = new JFileChooser(lastOpenPath);
		} else {
			chooser = new JFileChooser();
		}
		
		FileFilter mp3Filter = new FileFilter() {
			@Override
			public String getDescription() {
				return "Sound file (*.MP3)";
			}

			@Override
			public boolean accept(File file) {
				if (file.isDirectory()) {
					return true;
				} else {
					return file.getName().toLowerCase().endsWith(".mp3");
				}
			}
		};

        FileFilter filter=new FileNameExtensionFilter("MP3 Files","MP3","mpeg3");
       //JFileChooser chooser=new JFileChooser("E:\\songs");
       chooser.setDialogTitle("Open Audio File");
        chooser.setAcceptAllFileFilterUsed(false);
       chooser.addChoosableFileFilter(filter);
       int returnVal=chooser.showOpenDialog(null);
       if(returnVal ==JFileChooser.APPROVE_OPTION)
       {
           audioFilePath = chooser.getSelectedFile().getAbsolutePath();
            lastOpenPath = chooser.getSelectedFile().getParent();
            MC.Stop();
           File myFile=chooser.getSelectedFile();
           String song=myFile + "";
           String name=chooser.getSelectedFile().getName();
           Display.setText(name);
            MC.Play(song);
       }
    }                                          

    private void LoopActionPerformed(java.awt.event.ActionEvent evt) {                                     
       switch(count)
       {
           case 0:
               count=1;
               LoopCounter.setText("Repeat On");
               break;
           case 1:
               count=0;
               LoopCounter.setText("Repeat Off");
               break;
       }
    }                                    

    private void StopActionPerformed(java.awt.event.ActionEvent evt) {                                     
        MC.Stop();
        Play.setEnabled(true);
    }                                    

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {                                     
        MC.Resume();
        Play.setEnabled(false);
    }                                    

   
    public static void main(String args[]) 
    {
           try 
           {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MP3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MP3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MP3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MP3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MP3PlayerGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Clock;
    public static javax.swing.JLabel Display;
    private javax.swing.JButton Loop;
    private javax.swing.JLabel LoopCounter;
    private javax.swing.JButton Pause;
    private javax.swing.JButton Play;
    private javax.swing.JButton SelectFile;
    private javax.swing.JButton Stop;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
