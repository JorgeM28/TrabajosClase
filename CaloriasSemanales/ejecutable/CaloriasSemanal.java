package ejecutable;

import javax.swing.JOptionPane;
import java.util.Arrays;
public class CaloriasSemanal
{
    public static void main(String[] args) 
    {
        int calorias[], prom=0, max=0, min=0, promfinal, a=0, b=0;
        calorias = new int[7];
        String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};

        JOptionPane.showMessageDialog(null, "Bienvenido a tu contador de calorias semanal:)\nPor favor digita los datos necesarios para poder darte un buen resultado. ");

        for(int i=0;i<calorias.length;i++)
        {
            calorias[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las calorias del dia "+ dias[i]));
            prom=calorias[i]+prom;  
        }
        promfinal=prom/7;
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
        JOptionPane.showMessageDialog(null,"Las calorias consumidas en la semana fueron: "+ Arrays.toString(calorias));
        JOptionPane.showMessageDialog(null," Promedio de calorias de la semana: "+ promfinal + " calorias " );
        JOptionPane.showMessageDialog(null," El dia con mas calorias en la semana fue el "+dias[a]+" con "+max+" calorias" );
        JOptionPane.showMessageDialog(null," El dia con menos calorias en la semana fue el "+dias[b]+" con "+min+" calorias" );
        Arrays.sort(calorias);
        JOptionPane.showMessageDialog(null,"Calorias de la semana en forma ordenada: "+Arrays.toString(calorias));

        System.exit(0);
    }
}

