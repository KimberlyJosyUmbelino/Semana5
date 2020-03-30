import javax.swing.JOptionPane;
public class InformarQuantosNumerosEntre100E200ForamDigitados
{
   public static void main(String[]args)
   {
      //Leitura de dados
      int s=0,num=0;
      do
      {
         String sNum = JOptionPane.showInputDialog("Digite números: ");
         num = Integer.parseInt(sNum);
         if(num==0)
         {
          break; 
         }
         else
         {
            if(num<=200 && num>=100)
             {
               s++;
             }
         }
         
      }
      while(num!=0);
       
      JOptionPane.showMessageDialog(null,"A soma dos números que você digitou entre 100 e 200 é: " +s);
   }
}