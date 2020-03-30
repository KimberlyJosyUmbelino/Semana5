import javax.swing.JOptionPane;
public class NumerosParesDe100
{
   public static void main(String[]args)
   {
      //Leitura de dados
      String resultado="Resposta: ";
     
      
      for(int i=1; i<=100; i++)
      {
            if(i%2==0)
            {
             resultado = resultado +i+" ";
             
            }
             
      }
      JOptionPane.showMessageDialog (null,resultado);
   }
}