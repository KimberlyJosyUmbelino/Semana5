import javax.swing.JOptionPane;
public class ImprimirMediaDosNumerosDigitados
{
   public static void main(String[]args)
   {
      //Leitura de dados
     int s=0;
     double media=0,sm=0,resultado=0,num=0;
     
     do
     {
      String sNum = JOptionPane.showInputDialog("Digite os numeros que você queira calcular a media: ");
      num = Double.parseDouble(sNum);
         if(num<0)
         {
           break;
         }
         else
         {
          s++;
          sm=sm+num;
         }
     } 
     while(num>=0);
     
      media=sm/s;
      resultado=resultado + media;    
      JOptionPane.showMessageDialog(null,"A media é" + resultado);
    }
}