public class Prova3
{
    public static void main(String[] args) 
    {
        String commodities [] = new String[5];
        
        commodities[0] = "Amendoin";
        commodities[1] = "Cana de Açucar";
        commodities[2] = "Ovo";
        commodities[3] = "Café";
        commodities[4] = "Carne";
        
        

        int preco[] = new int [5];

        preco[0] = 57;
        preco[1] = 141;
        preco[2] = 151;
        preco[3] = 1245;
        preco[4] = 2200;
        

        for(int index = 0 ; index < preco.length ; index++)
        {
            System.out.println("O produto " + commodities[index] + " esta custando " + preco[index] +" reais");
        }

    }
}