package ejecutable;

import javax.swing.JOptionPane;
import java.util.Arrays;
public class CaloriasSemanal
{
    public static void main(String[] args) 
    {
        int calorias[], Total=0, max=0, min=0, promfinal, a=0, b=0;
        calorias = new int[7];
        String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};

        JOptionPane.showMessageDialog(null, "Bienvenido a tu contador de calorias semanal:)\nPor favor digita los datos necesarios para poder darte un buen resultado. ",
        "BIENVENIDO A TU APP DE CALORIAS SEMANAL",
        JOptionPane.PLAIN_MESSAGE);

        for(int i=0;i<calorias.length;i++)
        {
            calorias[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las calorias del dia "+ dias[i]));
            Total=calorias[i]+Total;  
        }
        promfinal=Total/7;
        for (int i=0; i<calorias.length; i++)
        {
            if (calorias[i]>max)
            {
                max=calorias[i];
                a=i;
            }
        }
        min=calorias[0];
        for (int i=0; i<calorias.length; i++)
        {
            if (min>calorias[i])
            {
                min=calorias[i];
                b=i;
            }
        }
        JOptionPane.showMessageDialog(null,"Las calorias consumidas en la semana fueron: "+ Arrays.toString(calorias),
        "CALORIAS DE LA SEMANA",
        JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null," Promedio de calorias de la semana: "+ promfinal + " calorias ",
        "PROMEDIO",
        JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog(null," El dia con mas calorias en la semana fue el "+dias[a]+" con "+max+" calorias",
        "DIA CON MAYOR CANTIDAD DE CALORIAS",
        JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog(null," El dia con menos calorias en la semana fue el "+dias[b]+" con "+min+" calorias",
        "DIA CON MENOR CANTIDAD DE CALORIAS",
        JOptionPane.PLAIN_MESSAGE);
        Arrays.sort(calorias);
        JOptionPane.showMessageDialog(null,"Calorias de la semana en forma ordenada: "+Arrays.toString(calorias),
        "CALORIAS DE MENOR A MAYOR",
        JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}

